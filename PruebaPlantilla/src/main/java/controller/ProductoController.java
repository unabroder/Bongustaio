/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import ejb.ProductoFacadeLocal;
import entity.Producto;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author claudia.santosusam
 */
@Named(value="productoController")
@SessionScoped
public class ProductoController implements Serializable{
    @EJB
    private ProductoFacadeLocal productoEJB;
    private Producto producto;
    private     List<Producto> listaproducto;

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public List<Producto> getListaproducto() {
        return listaproducto;
    }

    public void setListaproducto(List<Producto> listaproducto) {
        this.listaproducto = listaproducto;
    }
    
    @PostConstruct
    public void init(){
        producto=new Producto();
    
    }
    
    public void insertar(){
        try {
            productoEJB.create(producto);
        } catch (Exception e) {
        }
    }
    
    public void listar(){
        try {
            listaproducto=productoEJB.findAll();
        } catch (Exception e) {
        }
    
    }
    public void leerid(Producto prod){
        try {
            this.producto=prod;
        } catch (Exception e) {
        }
    
    }
    public void modificar(){
        try {
           productoEJB.edit(producto);
        } catch (Exception e) {
        }
    
    }
    
    public void eliminar(Producto prod){
    this.producto=prod;
        try {
           productoEJB.remove(producto);
           listaproducto=productoEJB.findAll();
        } catch (Exception e) {
        }
    
    }
    
}
