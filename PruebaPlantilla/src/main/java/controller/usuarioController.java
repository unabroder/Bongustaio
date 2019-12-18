
package controller;

import ejb.UsuariosFacadeLocal;
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
    public void inti(){
        usuarios = new Usuarios();
    }
    
    public String login(){
        Usuarios us;
        String redireccion = null;
        try {
            us = usuariofacade.Sesion(usuarios);
            if (us != null) {
                FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("user", us);
                redireccion = "modulos?faces-redirect=true";
            }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Usuario o clave incorrecta"));
            }
            
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Error"));
        }
        return redireccion;
    }
}
