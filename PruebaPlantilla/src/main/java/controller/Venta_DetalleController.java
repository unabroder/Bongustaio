/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import ejb.CatalogoFacadeLocal;
import ejb.Plato_CompletoFacadeLocal;
import ejb.VentaFacadeLocal;
import ejb.Venta_DetalleFacadeLocal;
import entity.Catalogo;
import entity.Plato_Completo;
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


@Named(value = "venta_DetalleController")
@SessionScoped
public class Venta_DetalleController implements Serializable {

    @EJB
    private Venta_DetalleFacadeLocal vdetalleEJB;
    private Venta_Detalle vdetalle;
    private List<Venta_Detalle> listavdetalle;

    @EJB
    private Plato_CompletoFacadeLocal pcompletoEJB;
    private Plato_Completo pcompleto;
    private List<Plato_Completo> listapcompleto;

//=======================================================================================================================
//=======================================================================================================================
    
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
    
    public Plato_Completo getPcompleto() {
        return pcompleto;
    }

    public void setPcompleto(Plato_Completo pcompleto) {
        this.pcompleto = pcompleto;
    }

    public List<Plato_Completo> getListapcompleto() {
        return listapcompleto;
    }

    public void setListapcompleto(List<Plato_Completo> listapcompleto) {
        this.listapcompleto = listapcompleto;
    }
    

//=======================================================================================================================
//=======================================================================================================================

    @PostConstruct
    private void init() {
        vdetalle = new Venta_Detalle();
        pcompleto = new Plato_Completo();
    }

    

    public void consultarPCompleto() {
        try {
            listapcompleto = pcompletoEJB.findAll();
        } catch (Exception e) {
        }
    }

    public void insertar() {
        try {
            vdetalle.setIdplato_completo(pcompleto);

            vdetalleEJB.create(vdetalle);
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "su registro fue guardado", null);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        } catch (Exception e) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "su registro NO fue guardado", null);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
        
    }

    public void consultar() {
        try {
            listavdetalle = vdetalleEJB.findAll();
        } catch (Exception e) {
        }
    }

    public void leerId(Venta_Detalle vdeta) {
        try {
            this.pcompleto.setIdplato_completo(vdeta.getIdplato_completo().getIdplato_completo());
            this.vdetalle = vdeta;
        } catch (Exception e) {
        }
    }

    public void modificar() {
        try {
            vdetalle.setIdplato_completo(pcompleto);
            vdetalleEJB.edit(vdetalle);
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO,"Se actualizo correctamente",null);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        } catch (Exception e) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR,"Error "+e.getMessage(),null);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }
    
    public void eliminar(Venta_Detalle vdeta){
        this.vdetalle=vdeta;
        try {
            vdetalleEJB.remove(vdetalle);
            listavdetalle=vdetalleEJB.findAll();
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO,"Se elimino correctamente",null);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        } catch (Exception e) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR,"Error "+e.getMessage(),null);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }

    public void limpiar() {
        vdetalle = new Venta_Detalle();
        pcompleto = new Plato_Completo();
    }

}
