package controller;

import ejb.CatalogoEspecialidadFacadeLocal;
import entity.CatalogoEspecialidad;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author joqtan.marmolusam
 */
@Named(value = "catalogoEspecialidadController")
@SessionScoped
public class CatalogoEspecialidadController implements Serializable{
    @EJB
    private CatalogoEspecialidadFacadeLocal catalogoEspecialidadEJB;
    private CatalogoEspecialidad catalogoEspecialidad;
    private List<CatalogoEspecialidad> listaCatalogoEspecialidad;

    public CatalogoEspecialidad getCatalogoEspecialidad() {
        return catalogoEspecialidad;
    }

    public void setCatalogoEspecialidad(CatalogoEspecialidad catalogoEspecialidad) {
        this.catalogoEspecialidad = catalogoEspecialidad;
    }

    public List<CatalogoEspecialidad> getListaCatalogoEspecialidad() {
        return listaCatalogoEspecialidad;
    }

    public void setListaCatalogoEspecialidad(List<CatalogoEspecialidad> listaCatalogoEspecialidad) {
        this.listaCatalogoEspecialidad = listaCatalogoEspecialidad;
    }
    
    @PostConstruct
    private void init(){
        catalogoEspecialidad = new CatalogoEspecialidad();
    }    
    
    public void insertar(){
        try {
            catalogoEspecialidadEJB.create(catalogoEspecialidad);
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Su registro fue ingresado", null);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        } catch (Exception e) {
        }
    }
    
    public void consultar(){
        try {
            listaCatalogoEspecialidad = catalogoEspecialidadEJB.findAll();
        } catch (Exception e) {
        }
    }
}
