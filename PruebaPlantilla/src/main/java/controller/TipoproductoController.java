/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import ejb.TipoproductoFacadeLocal;
import entity.Tipoproducto;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named(value = "tipoproductoController")
@SessionScoped
public class TipoproductoController implements Serializable{
    
    @EJB
    private TipoproductoFacadeLocal tipoproductoEJB;
    private Tipoproducto tipoproducto;
    private List<Tipoproducto> listaTipoproducto;

    public Tipoproducto getTipoproducto() {
        return tipoproducto;
    }

    public void setTipoproducto(Tipoproducto tipoproducto) {
        this.tipoproducto = tipoproducto;
    }

    public List<Tipoproducto> getListaTipoproducto() {
        listaTipoproducto=tipoproductoEJB.findAll();
        return listaTipoproducto;
    }

    public void setListaTipoproducto(List<Tipoproducto> listaTipoproducto) {
        this.listaTipoproducto = listaTipoproducto;
    }
    
    @PostConstruct
    public void init(){
        tipoproducto= new Tipoproducto();
    }
    
    public void consultarTipoproducto(){
        try {
            listaTipoproducto=tipoproductoEJB.findAll();
        } catch (Exception e) {
        }
    }
    
    public void insertar(){
        try {
            tipoproductoEJB.create(tipoproducto);
            FacesMessage msg =new FacesMessage(FacesMessage.SEVERITY_INFO, "Se guardo exitosamente", null);
            FacesContext.getCurrentInstance().addMessage(null, msg);
            } catch (Exception e) {
        }
    }
    
    public void consultar(){
        try {
            listaTipoproducto=tipoproductoEJB.findAll();
        } catch (Exception e) {
        }
    }
    
    public void listar(){
        try {
            listaTipoproducto=tipoproductoEJB.findAll();
        } catch (Exception e) {
        }
    }
    
    public void leerid(Tipoproducto tipo){
        try {
            this.tipoproducto=tipo;
        } catch (Exception e) {
        }
    }
    
    public void modificar(){
        try {
            tipoproductoEJB.edit(tipoproducto);
            listaTipoproducto=tipoproductoEJB.findAll();
        } catch (Exception e) {
        }
    }
    
    public void eliminar(Tipoproducto tipo){
    this.tipoproducto=tipo;
        try {
            tipoproductoEJB.remove(tipoproducto);
            listaTipoproducto = tipoproductoEJB.findAll();
        } catch (Exception e) {
        }
    }
    
    public void consultarActivos(){
        try {
            listaTipoproducto=tipoproductoEJB.findActivos();
        } catch (Exception e) {
        }
    }
    

}
