/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import ejb.CatalogoFacadeLocal;
import ejb.TipoproductoFacadeLocal;
import entity.Catalogo;
import entity.Tipoproducto;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "catalogoController")
@SessionScoped
public class CatalogoController implements Serializable{
    
    @EJB
    private CatalogoFacadeLocal catalogoEJB;
    private Catalogo catalogo;
    private List<Catalogo> listaCatalogo;
    
    @EJB
    private TipoproductoFacadeLocal tipoproductoEJB;
    private Tipoproducto tipoproducto;
    private List<Tipoproducto> listaTipoproducto;

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

    public Tipoproducto getTipoproducto() {
        return tipoproducto;
    }

    public void setTipoproducto(Tipoproducto tipoproducto) {
        this.tipoproducto = tipoproducto;
    }

    public List<Tipoproducto> getListaTipoproducto() {
        return listaTipoproducto;
    }

    public void setListaTipoproducto(List<Tipoproducto> listaTipoproducto) {
        this.listaTipoproducto = listaTipoproducto;
    }
    
    
    @PostConstruct
    private void init(){
        catalogo = new Catalogo();
        tipoproducto = new Tipoproducto();
    }
    
    public void consultarCatalogo(){
        try {
            listaCatalogo = catalogoEJB.findAll();
        } catch (Exception e) {
        }
    }
    
    public void consultarTipoproducto(){
        try {
<<<<<<< HEAD
            listaTipoproducto= listaTipoproducto;
=======
            listaTipoproducto = tipoproductoEJB.findAll();
>>>>>>> efb1911fb6bd4ac0694e9b7f60ebc30853844c23
        } catch (Exception e) {
        }
    }
}
