package controller;

import ejb.BitacoraFacadeLocal;
import ejb.UsuariosFacadeLocal;
import entity.Bitacora;
import entity.Usuarios;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Named(value = "usuarioController")
@SessionScoped
public class usuarioController implements Serializable {

    @EJB
    private UsuariosFacadeLocal usuariofacade;
    private Usuarios usuarios;
    private List<Usuarios> listausuario;

    @EJB
    private BitacoraFacadeLocal bitacoraEJB;
    private Bitacora bitacora;
    private List<Bitacora> lsBitacora;

    public Bitacora getBitacora() {
        return bitacora;
    }

    public void setBitacora(Bitacora bitacora) {
        this.bitacora = bitacora;
    }

    public List<Bitacora> getLsBitacora() {
        return lsBitacora;
    }

    public void setLsBitacora(List<Bitacora> lsBitacora) {
        this.lsBitacora = lsBitacora;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    public List<Usuarios> getListausuario() {
        return listausuario;
    }

    public void setListausuario(List<Usuarios> listausuario) {
        this.listausuario = listausuario;
    }

    @PostConstruct
    public void inti() {
        usuarios = new Usuarios();
        bitacora = new Bitacora();
    }

    public String login() {
        Usuarios us;
        String redireccion = null;
        try {
            us = usuariofacade.Sesion(usuarios);

            if (us != null) {
                FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("user", us);
                String accion = "inicio de sesion por " + usuarios.getUsuario();
                bitacora.setAccion(accion);
                bitacora.setUsuario(us);
                bitacoraEJB.create(bitacora);
                redireccion = "modulos?faces-redirect=true";

            } else {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Usuario o clave incorrecta"));
            }

        } catch (Exception e) {

            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Error" + e));

        }
        return redireccion;
    }

    public String cerrar() {
        try {
            SesionController.iniciarSesion(FacesContext.getCurrentInstance());
            SesionController.cerrarSesion();

            return "index?faces-redirect=true";
        } catch (Exception e) {
            throw e;
        }
    }

    public String cerrar2() {
        try {
            SesionController.iniciarSesion(FacesContext.getCurrentInstance());
            SesionController.cerrarSesion();

            return "/index?faces-redirect=true";
        } catch (Exception e) {
            throw e;
        }
    }

    public String validacion1() {
        String redireccion = null;
        try {
            Usuarios us = (Usuarios) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("user");
            if (us == null) {
                FacesContext.getCurrentInstance().getExternalContext().redirect("../index.xhtml");
                redireccion = "../../index?faces-redirect=true";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return redireccion;
    }

    public String validacion2() {
        String redireccion = null;
        try {
            Usuarios us = (Usuarios) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("user");
            if (us == null) {
                FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml");
                redireccion = "index?faces-redirect=true";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return redireccion;
    }

    public void validacionRol() {
        Usuarios us;
        try {
            us = usuariofacade.Sesion(usuarios);
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("user", us);
            if (us != null) {
                String cargo = us.getIdtipo().getRol();
                System.out.println(cargo);
                switch (cargo) {
                    case "Administrador":
//                       FacesContext.getCurrentInstance().getExternalContext().redirect("modulos.xhtml");
                        break;
                    case "TI":
//                       FacesContext.getCurrentInstance().getExternalContext().redirect("modulos.xhtml");
                        break;
                    case "Gerente":
                        FacesContext.getCurrentInstance().getExternalContext().redirect("mantenimiento.xhtml?faces-redirect=true");
                        break;
                    case "Vendedor":
                        FacesContext.getCurrentInstance().getExternalContext().redirect("Ventas/venta.xhtml?faces-redirect=true");
                        break;
                    default:
                        System.out.println("Ocurrio un error");
                        break;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        //return redireccion;

    }
    
    public void validacionRolBodega() {
        Usuarios us;
        try {
            us = usuariofacade.Sesion(usuarios);
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("user", us);
            if (us != null) {
                String cargo = us.getIdtipo().getRol();
                System.out.println(cargo);
                if(cargo.equalsIgnoreCase("Cocinero")){
                       FacesContext.getCurrentInstance().getExternalContext().redirect("Proveedores/Producto.xhtml?faces-redirect=true");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void guardar() {
        try {
            bitacora.setAccion("Acaba de iniciar sesion");
            bitacora.setUsuario(usuarios);
            bitacoraEJB.create(bitacora);
        } catch (Exception e) {
        }

    }
}
