/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import ejb.ProductoFacadeLocal;
import ejb.ProductoProveedorFacadeLocal;
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
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author claudia.santosusam
 */
@Named(value = "productoproveedorController")
@SessionScoped
public class ProductoProveedorController implements Serializable {

    @EJB
    // para poductoProveedor == proprov
    private ProductoProveedorFacadeLocal proprovEJB;
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
        listaproprov = proprovEJB.findAll();
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
        listaproducto = productoEJB.findAll();
    }

    public void insertar() {
        try {
            proprov.setIdproveedor(proveedor);
            proprov.setIdsucursal(sucursal);
            proprov.setIdproducto(producto);

            proprovEJB.create(proprov);
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "su registro fue guardado", null);
            FacesContext.getCurrentInstance().addMessage(null, msg);

        } catch (Exception e) {
        }

    }

    public void listar() {
        try {
            listaproprov = proprovEJB.findAll();

        } catch (Exception e) {
        }

    }

    public void modificar() {
        try {
            proprov.setIdproveedor(proveedor);
            proprov.setIdsucursal(sucursal);
            proprov.setIdproducto(producto);
            proprovEJB.edit(proprov);

        } catch (Exception e) {
        }

    }

    public void leerid(ProductoProveedor prov) {
        try {
            this.proveedor.setIdproveedor(prov.getIdproveedor().getIdproveedor());
            this.sucursal.setIdsucursal(prov.getIdsucursal().getIdsucursal());
            this.producto.setIdproducto(prov.getIdproducto().getIdproducto());
            this.proprov = prov;
        } catch (Exception e) {
        }

    }

    public void eliminar(ProductoProveedor prov) {
        try {
            proprov = prov;
            proprovEJB.remove(proprov);
        } catch (Exception e) {
        }

    }

    public void limpiar() {
        proprov = new ProductoProveedor();

    }

}
