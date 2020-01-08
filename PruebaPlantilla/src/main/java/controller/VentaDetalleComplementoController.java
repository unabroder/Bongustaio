/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import ejb.ComplementoFacadeLocal;
import entity.Complemento;
import entity.VentaDetalleComplemento;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;
import ejb.VentaDetalleComplementoFacadeLocal;
import ejb.Venta_DetalleFacadeLocal;
import entity.Venta_Detalle;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author claudia.santosusam
 */
@Named(value = "ventaDetalleComplementoController")
@SessionScoped
public class VentaDetalleComplementoController implements Serializable {

    @EJB
    private VentaDetalleComplementoFacadeLocal vdcomplementoEJB;
    private VentaDetalleComplemento vdcomplement;
    private List<VentaDetalleComplemento> listavdcomplemento;

    @EJB
    private ComplementoFacadeLocal complementoEJB;
    private Complemento complemento;
    private List<Complemento> listaComplemento;

    @EJB
    private Venta_DetalleFacadeLocal vdetalleEJB;
    private Venta_Detalle vdetalle;
    private List<Venta_Detalle> listavdetalle;
    
//==============================================================================================
//==============================================================================================
    
    public VentaDetalleComplemento getVdcomplement() {

        return vdcomplement;

    }

    public void setVdcomplement(VentaDetalleComplemento vdcomplement) {
        this.vdcomplement = vdcomplement;
    }

    public List<VentaDetalleComplemento> getListavdcomplemento() {
        this.listavdcomplemento=vdcomplementoEJB.findAll();
        return listavdcomplemento;
    }

    public void setListavdcomplemento(List<VentaDetalleComplemento> listavdcomplemento) {
        this.listavdcomplemento = listavdcomplemento;
    }

    public Complemento getComplemento() {
        return complemento;
    }

    public void setComplemento(Complemento complemento) {
        this.complemento = complemento;
    }

    public List<Complemento> getListaComplemento() {
        return listaComplemento;
    }

    public void setListaComplemento(List<Complemento> listaComplemento) {
        this.listaComplemento = listaComplemento;
    }

    public Venta_Detalle getVdetalle() {
        return vdetalle;
    }

    public void setVdetalle(Venta_Detalle vdetalle) {
        this.vdetalle = vdetalle;
    }

    public List<Venta_Detalle> getListavdetalle() {
        return listavdetalle;
    }

    public void setListavdetalle(List<Venta_Detalle> listavdetalle) {
        this.listavdetalle = listavdetalle;
    }

//==============================================================================================
//==============================================================================================
    @PostConstruct
    private void init() {
        vdcomplement = new VentaDetalleComplemento();
        complemento = new Complemento();
        vdetalle = new Venta_Detalle();
    }

    public void ConsultarComplemento() {
        try {
            listaComplemento = complementoEJB.findAll();
        } catch (Exception e) {
        }
        
    }

    public void ConsultarVentaDetalle() {
        try {
             listavdetalle = vdetalleEJB.findAll();
        } catch (Exception e) {
        }
    }

    public void insertar() {

        try {
            vdcomplement.setIdcomplemento(complemento);
            vdcomplement.setIdventa_detalle(vdetalle);

            vdcomplementoEJB.create(vdcomplement);
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "su registro fue guardado", null);
            FacesContext.getCurrentInstance().addMessage(null, msg);

        } catch (Exception e) {
        }

    }
    public void listar(){
        try {
            listavdcomplemento=vdcomplementoEJB.findAll();
        } catch (Exception e) {
        }
    
    }
    
    public void modificar(){
        try {
            vdcomplement.setIdcomplemento(complemento);
            vdcomplement.setIdventa_detalle(vdetalle);
            
            vdcomplementoEJB.edit(vdcomplement);
            
        } catch (Exception e) {
        }
    
    
    }
    
    public void leerid(VentaDetalleComplemento vdc){
        try {
            this.complemento.setIdcomplemento(vdc.getIdcomplemento().getIdcomplemento());
            this.vdetalle.setIdventa_detalle(vdc.getIdventa_detalle().getIdventa_detalle());
            this.vdcomplement=vdc;
            
            
        } catch (Exception e) {
        }
    
    
    }
    public void eliminar(VentaDetalleComplemento vdc){
        try {
            vdcomplement=vdc;
            vdcomplementoEJB.remove(vdcomplement);
        } catch (Exception e) {
        }
    
    
    }
     public void limpiar(){
     vdcomplement = new VentaDetalleComplemento();
        complemento = new Complemento();
        vdetalle = new Venta_Detalle();
     }
    

}
