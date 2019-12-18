
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


@Named(value = "menuDelDia")
@SessionScoped
public class MenuDelDiaController implements Serializable {

  
    //Variables
    @EJB
    private MenuDelDiaFacadeLocal menuDelDiaEJB;
    private MenuDelDia menuDelDia;
    private List<MenuDelDia> listaMenuDelDia;
    
    @EJB
    private Venta_DetalleFacadeLocal venta_DetalleFacadeLocalEJB;
    private Venta_Detalle venta_Detalle;
    private List<Venta_Detalle> listaVentaDetalle;
    
    
    //Constructores
    public MenuDelDiaController() {
    }
    
     //PostConstruct
    @PostConstruct
    public void init(){
        menuDelDia = new MenuDelDia();
        venta_Detalle = new Venta_Detalle();
    }

    public MenuDelDiaFacadeLocal getMenuDelDiaEJB() {
        return menuDelDiaEJB;
    }

    public void setMenuDelDiaEJB(MenuDelDiaFacadeLocal menuDelDiaEJB) {
        this.menuDelDiaEJB = menuDelDiaEJB;
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

    public Venta_DetalleFacadeLocal getVenta_DetalleFacadeLocalEJB() {
        return venta_DetalleFacadeLocalEJB;
    }

    public void setVenta_DetalleFacadeLocalEJB(Venta_DetalleFacadeLocal venta_DetalleFacadeLocalEJB) {
        this.venta_DetalleFacadeLocalEJB = venta_DetalleFacadeLocalEJB;
    }

    public Venta_Detalle getVenta_Detalle() {
        return venta_Detalle;
    }

    public void setVenta_Detalle(Venta_Detalle venta_Detalle) {
        this.venta_Detalle = venta_Detalle;
    }

    public List<Venta_Detalle> getListaVentaDetalle() {
        return listaVentaDetalle;
    }

    public void setListaVentaDetalle(List<Venta_Detalle> listaVentaDetalle) {
        this.listaVentaDetalle = listaVentaDetalle;
    }
    
    
    //metodos 
    public void insertar(){
        try {
            menuDelDiaEJB.create(menuDelDia);
        } catch (Exception e) {
        }
    }
    
    public void obtenerTodos(){
        try {
          listaMenuDelDia = menuDelDiaEJB.findAll();  
        } catch (Exception e) {
        }
        
    }
    
    public void obtenerUno(MenuDelDia menuDD){
        try {
            this.menuDelDia = menuDD;
        } catch (Exception e) {
        }
    }
    
    public void actualizar(){
        try {
            menuDelDiaEJB.edit(menuDelDia);
        } catch (Exception e) {
        }
    }
    
    public void eliminar(MenuDelDia mDD){
        this.menuDelDia = mDD;
        try {
            menuDelDiaEJB.remove(menuDelDia);
            listaMenuDelDia = menuDelDiaEJB.findAll();
        } catch (Exception e) {
        }
       
    
    }
    
}
