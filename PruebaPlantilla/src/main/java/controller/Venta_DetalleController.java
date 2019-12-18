/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import ejb.VentaFacadeLocal;
import ejb.Venta_DetalleFacadeLocal;
import entity.Venta;
import entity.Venta_Detalle;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author rene.linaresusam
 */
@Named(value = "venta_DetalleController")
@SessionScoped
public class Venta_DetalleController implements Serializable {

    @EJB
    private Venta_DetalleFacadeLocal vdetalleEJB;
    private Venta_Detalle vdetalle;
    private List<Venta_Detalle> listavdetalle;

    @EJB
    private VentaFacadeLocal ventaEJB;
    private Venta venta;
    private List<Venta> listaventa;

    @EJB
    private CatalogoFacadeLocal catalogoEJB;
    private Catalago catalogo;
    private List<Catalago> listacatalogo;

    public Venta_Detalle getVdetalle() {
        return vdetalle;
    }

    public void setVdetalle(Venta_Detalle vdetalle) {
        this.vdetalle = vdetalle;
    }

    public List<Venta_Detalle> getListavdetalle() {
        listavdetalle = vdetalleEJB.findAll();
        return listavdetalle;
    }

    public void setListavdetalle(List<Venta_Detalle> listavdetalle) {
        this.listavdetalle = listavdetalle;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public List<Venta> getListaventa() {
        return listaventa;
    }

    public void setListaventa(List<Venta> listaventa) {
        this.listaventa = listaventa;
    }

    @PostConstruct
    private void init() {
        vdetalle = new Venta_Detalle();
        venta = new Venta();
        catalogo = new Catalogo();
    }

    public void consultarVenta() {
        try {
            listaventa = ventaEJB.findAll();
        } catch (Exception e) {
        }
    }

    public void consultarCatalogo() {
        try {
            listacatalogo = catalogoEJB.findAll();
        } catch (Exception e) {
        }
    }

    public void insertar() {
        try {
            venta.setIdventa(venta);
            catalogo.setCatalogo(catalogo);

            vdetalleEJB.create(vdetalle);
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "su registro fue guardado", null);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        } catch (Exception e) {
        }
    }

    public void consultar() {
        try {
            listavdetalle = vdetalleEJB.findAll();
        } catch (Exception e) {
        }
    }

}
