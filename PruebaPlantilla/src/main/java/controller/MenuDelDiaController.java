package controller;

import ejb.CatalogoFacadeLocal;
import ejb.MenuDelDiaFacadeLocal;
import ejb.Venta_DetalleFacadeLocal;
import entity.Catalogo;
import entity.MenuDelDia;
import entity.Plato_Completo;
import entity.Venta_Detalle;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Named(value = "menuDelDiaController")
@SessionScoped
public class MenuDelDiaController implements Serializable {

    //Variables
    @EJB
    private MenuDelDiaFacadeLocal menuDelDiaEJB;
    private MenuDelDia menuDelDia;
    private List<MenuDelDia> listaMenuDelDia;

    private Plato_Completo plato_CompletoEJB;
    private Plato_Completo plato_completo;
    private List<Plato_Completo> listaPlato_Completo;
    
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
        this.listaMenuDelDia=menuDelDiaEJB.findAll();
        return listaMenuDelDia;
    }

    public void setListaMenuDelDia(List<MenuDelDia> listaMenuDelDia) {
        this.listaMenuDelDia = listaMenuDelDia;
    }

    public Plato_Completo getPlato_completo() {
        return plato_completo;
    }

    public void setPlato_completo(Plato_Completo plato_completo) {
        this.plato_completo = plato_completo;
    }

    public List<Plato_Completo> getListaPlato_Completo() {
        return listaPlato_Completo;
    }

    public void setListaPlato_Completo(List<Plato_Completo> listaPlato_Completo) {
        this.listaPlato_Completo = listaPlato_Completo;
    }


    //PostConstruct
    @PostConstruct
    public void init() {
        this.plato_completo = new Plato_Completo();
        this.menuDelDia = new MenuDelDia();
    }

    //metodos 
    public void obtenerTodos() {
        try {
            this.listaMenuDelDia = menuDelDiaEJB.findAll();
        } catch (Exception e) {
        }

    }

    public void obtenerUno(MenuDelDia mdd) {
        try {
            this.plato_completo.setIdplato_completo(mdd.getPlato_Completo().getIdplato_completo());
            this.menuDelDia = mdd;
        } catch (Exception e) {
        }
    }

     public void insertar() {
        try {
            this.menuDelDia.setPlato_Completo(plato_completo);
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
    
    public void listarPlatoCompleto(){
        try {
           this.listaMenuDelDia = menuDelDiaEJB.findAll();
        } catch (Exception e) {
        }
    }
    
     public void limpiar() {
        try {
            this.menuDelDia= new MenuDelDia();
            this.plato_completo = new Plato_Completo();
        } catch (Exception e) {
        }
    }
}
