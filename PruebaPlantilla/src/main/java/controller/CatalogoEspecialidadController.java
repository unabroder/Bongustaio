package controller;

import ejb.CatalogoEspecialidadFacadeLocal;
import ejb.CatalogoFacadeLocal;
import ejb.EspecialidadFacadeLocal;
import entity.Catalogo;
import entity.CatalogoEspecialidad;
import entity.Especialidad;
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
    
    @EJB
    private CatalogoFacadeLocal catalogoEJB;
    private Catalogo catalogo;
    private List<Catalogo> listaCatalogo;
    
    @EJB
    private EspecialidadFacadeLocal especialidadEJB;
    private Especialidad especialidad;
    private List<Especialidad> listaEspecialidad;

    public CatalogoEspecialidad getCatalogoEspecialidad() {
        return catalogoEspecialidad;
    }

    public void setCatalogoEspecialidad(CatalogoEspecialidad catalogoEspecialidad) {
        this.catalogoEspecialidad = catalogoEspecialidad;
    }

    public List<CatalogoEspecialidad> getListaCatalogoEspecialidad() {
        listaCatalogoEspecialidad = catalogoEspecialidadEJB.findAll();
        return listaCatalogoEspecialidad;
    }

    public void setListaCatalogoEspecialidad(List<CatalogoEspecialidad> listaCatalogoEspecialidad) {
        this.listaCatalogoEspecialidad = listaCatalogoEspecialidad;
    }

    public Catalogo getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    public List<Catalogo> getListaCatalogo() {
        listaCatalogo = catalogoEJB.findAll();
        return listaCatalogo;
    }

    public void setListaCatalogo(List<Catalogo> listaCatalogo) {
        this.listaCatalogo = listaCatalogo;
    }
    
    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public List<Especialidad> getListaEspecialidad() {
        listaEspecialidad = especialidadEJB.findAll();
        return listaEspecialidad;
    }

    public void setListaEspecialidad(List<Especialidad> listaEspecialidad) {
        this.listaEspecialidad = listaEspecialidad;
    }
    
    
    @PostConstruct
    private void init(){
        catalogoEspecialidad = new CatalogoEspecialidad();
    }    
    
    public void insertar(){
        try {
            catalogoEspecialidad.setIdcatalogo(catalogo);
            catalogoEspecialidad.setIdespecialidad(especialidad);
            
            catalogoEspecialidadEJB.create(catalogoEspecialidad);
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Su registro fue ingresado", null);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        } catch (Exception e) {
        }
    }
    
    public void editar(){
        try {
            catalogoEspecialidad.setIdcatalogo(catalogo);
            catalogoEspecialidad.setIdespecialidad(especialidad);
            catalogoEspecialidadEJB.edit(catalogoEspecialidad);
        } catch (Exception e) {
        }
    }
    
    public void eliminar(CatalogoEspecialidad catEsp){
        try {
            catalogoEspecialidad = catEsp;
            catalogoEspecialidadEJB.remove(catalogoEspecialidad);
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
