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
}
