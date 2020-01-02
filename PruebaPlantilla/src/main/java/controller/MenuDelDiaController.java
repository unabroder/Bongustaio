package controller;

import ejb.CatalogoFacadeLocal;
import ejb.MenuDelDiaFacadeLocal;
import ejb.Venta_DetalleFacadeLocal;
import entity.Catalogo;
import entity.MenuDelDia;
import entity.Venta_Detalle;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Named(value = "menuDelDia")
@SessionScoped
public class MenuDelDiaController implements Serializable {

    //Variables
    @EJB
    private MenuDelDiaFacadeLocal menuDelDiaEJB;
    private MenuDelDia menuDelDia;
    private List<MenuDelDia> listaMenuDelDia;

    private CatalogoFacadeLocal catalogoEJB;
    private Catalogo catalogo;
    private List<Catalogo> listaCatalogo;
    
    String mensaje;

    //Constructores
    public MenuDelDiaController() {
    }

    public MenuDelDia getMenuDelDia() {
        return menuDelDia;
    }

    public void setMenuDelDia(MenuDelDia menuDelDia) {
        this.menuDelDia = menuDelDia;
    }

    public List<MenuDelDia> getListaMenuDelDia() {
        return listaMenuDelDia;
    }

    public void setListaMenuDelDia(List<MenuDelDia> listaMenuDelDia) {
        this.listaMenuDelDia = listaMenuDelDia;
    }

    public Catalogo getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    public List<Catalogo> getListaCatalogo() {
        return listaCatalogo;
    }

    public void setListaCatalogo(List<Catalogo> listaCatalogo) {
        this.listaCatalogo = listaCatalogo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    //PostConstruct
    @PostConstruct
    public void init() {
        catalogo = new Catalogo();
        menuDelDia = new MenuDelDia();
    }

    //metodos 
    public void obtenerTodos() {
        try {
            listaMenuDelDia = menuDelDiaEJB.findAll();
        } catch (Exception e) {
        }

    }

    public void obtenerUno(MenuDelDia mdd) {
        try {
            this.catalogo.setIdcatalogo(mdd.getCatalogo().getIdcatalogo());
            this.menuDelDia = mdd;
        } catch (Exception e) {
        }
    }

     public void insertar() {
        try {
            this.menuDelDia.setCatalogo(catalogo);
            menuDelDiaEJB.create(menuDelDia);
            this.mensaje = "INSERTADO";
        } catch (Exception e) {
            this.mensaje = "NO INSERTADO";
        }
        FacesMessage msj = new FacesMessage(this.mensaje);
        FacesContext.getCurrentInstance().addMessage(null, msj);
    }
    
    public void actualizar() {
        try {
            
            menuDelDiaEJB.edit(menuDelDia);
            this.mensaje = "ACTUALIZADO";
        } catch (Exception e) {
            this.mensaje = "NO ACTUALIZADO";
        }
        FacesMessage msj = new FacesMessage(this.mensaje);
        FacesContext.getCurrentInstance().addMessage(null, msj);
    }

    public void eliminar(MenuDelDia mdd) {
        this.menuDelDia = mdd;
        try {
            
            menuDelDiaEJB.remove(menuDelDia);
            this.mensaje = "ELIMINADO";
            listaMenuDelDia = menuDelDiaEJB.findAll();
        } catch (Exception e) {
            this.mensaje = "NO ELIMINADO";
        }
        FacesMessage msj = new FacesMessage(this.mensaje);
        FacesContext.getCurrentInstance().addMessage(null, msj);
    }
    
    public void listarCatalogo(){
        try {
            listaCatalogo = catalogoEJB.findAll();
        } catch (Exception e) {
        }
    }
    
     public void limpiar() {
        try {
            this.menuDelDia= new MenuDelDia();
            this.catalogo = new Catalogo();
        } catch (Exception e) {
        }
    }
}
