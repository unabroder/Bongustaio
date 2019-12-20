package controller;

import ejb.MenuDelDiaFacadeLocal;
import ejb.Venta_DetalleFacadeLocal;
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

    private Venta_DetalleFacadeLocal ventaDetalleEJB;
    private Venta_Detalle ventaDetalle;
    private List<Venta_Detalle> listaVentaDetalle;
    
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

    public Venta_Detalle getVentaDetalle() {
        return ventaDetalle;
    }

    public void setVentaDetalle(Venta_Detalle ventaDetalle) {
        this.ventaDetalle = ventaDetalle;
    }

    public List<Venta_Detalle> getListaVentaDetalle() {
        return listaVentaDetalle;
    }

    public void setListaVentaDetalle(List<Venta_Detalle> listaVentaDetalle) {
        this.listaVentaDetalle = listaVentaDetalle;
    }

    //PostConstruct
    @PostConstruct
    public void init() {
        ventaDetalle = new Venta_Detalle();
        menuDelDia = new MenuDelDia();
    }

    //metodos 
    public void obtenerTodos() {
        try {
            listaMenuDelDia = menuDelDiaEJB.findAll();
        } catch (Exception e) {
        }

    }

    public void obtenerUno(MenuDelDia idMenuDD) {
        try {
            this.ventaDetalle.setIdventa_detalle(idMenuDD.getIdventa_detalle().getIdventa_detalle());
            this.menuDelDia = idMenuDD;
        } catch (Exception e) {
        }
    }

     public void insertar() {
        try {
            this.menuDelDia.setIdventa_detalle(ventaDetalle);
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
            this.menuDelDia.setIdventa_detalle(ventaDetalle);
            menuDelDiaEJB.edit(menuDelDia);
            this.mensaje = "ACTUALIZADO";
        } catch (Exception e) {
            this.mensaje = "NO ACTUALIZADO";
        }
        FacesMessage msj = new FacesMessage(this.mensaje);
        FacesContext.getCurrentInstance().addMessage(null, msj);
    }

    public void eliminar(MenuDelDia idMDD) {
        this.menuDelDia = idMDD;
        try {
            this.menuDelDia.setIdventa_detalle(ventaDetalle);
            menuDelDiaEJB.remove(menuDelDia);
            this.mensaje = "ELIMINADO";
            listaMenuDelDia = menuDelDiaEJB.findAll();
        } catch (Exception e) {
            this.mensaje = "NO ELIMINADO";
        }
        FacesMessage msj = new FacesMessage(this.mensaje);
        FacesContext.getCurrentInstance().addMessage(null, msj);
    }
    
    public void listarVentaDetalle(){
        try {
            this.listaVentaDetalle = ventaDetalleEJB.findAll();
        } catch (Exception e) {
        }
    }
}
