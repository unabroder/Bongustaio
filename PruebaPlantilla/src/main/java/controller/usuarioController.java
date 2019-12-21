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

    public void guardar() {
        try {
            bitacora.setAccion("Acaba de iniciar sesion");
            bitacora.setUsuario(usuarios);
            bitacoraEJB.create(bitacora);
        } catch (Exception e) {
        }
    }
}
