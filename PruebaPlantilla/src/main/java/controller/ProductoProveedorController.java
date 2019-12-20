/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import ejb.ProductoFacadeLocal;
import ejb.ProveedorFacadeLocal;
import ejb.SucursalFacadeLocal;
import entity.Producto;
import entity.ProductoProveedor;
import entity.Proveedor;
import entity.Sucursal;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;

/**
 *
 * @author claudia.santosusam
 */
public class ProductoProveedorController implements Serializable {

    @EJB
    // para poductoProveedor == proprov
    private ProductoProveedor proprovEJB;
    private ProductoProveedor proprov;
    // la lista se llamara listaproprov
    private List<ProductoProveedor> listaproprov;

    @EJB
    private ProveedorFacadeLocal proveedorEJB;
    private Proveedor proveedor;
    private List<Proveedor> listaProveedor;

    @EJB
    private SucursalFacadeLocal sucursalEJB;
    private Sucursal sucursal;
    private List<Sucursal> listaSucursal;

    @EJB
    private ProductoFacadeLocal productoEJB;
    private Producto producto;
    private List<Producto> listaproducto;

    public ProductoProveedor getProprov() {
        return proprov;
    }

    public void setProprov(ProductoProveedor proprov) {
        this.proprov = proprov;
    }

    public List<ProductoProveedor> getListaproprov() {
        return listaproprov;
    }

    public void setListaproprov(List<ProductoProveedor> listaproprov) {
        this.listaproprov = listaproprov;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public List<Proveedor> getListaProveedor() {
        return listaProveedor;
    }

    public void setListaProveedor(List<Proveedor> listaProveedor) {
        this.listaProveedor = listaProveedor;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public List<Sucursal> getListaSucursal() {
        return listaSucursal;
    }

    public void setListaSucursal(List<Sucursal> listaSucursal) {
        this.listaSucursal = listaSucursal;
    }

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
    private void init() {
        proprov = new ProductoProveedor();
        proveedor = new Proveedor();
        sucursal = new Sucursal();
        producto = new Producto();

    }

    public void consultarProvedor() {
        try {
            listaProveedor = proveedorEJB.findAll();
        } catch (Exception e) {
        }

    }

    public void consultarSucursal() {
        try {
            listaSucursal = sucursalEJB.findAll();
        } catch (Exception e) {
        }

    }

    public void consultarProducto() {
        listaproducto= productoEJB.findAll();
    }
    
    
    public void insertar(){
    
    
    
    }

}
