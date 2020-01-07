
package controller;

import ejb.OrdenCompraFacade;
import ejb.OrdenCompraFacadeLocal;
import ejb.ProductoFacade;
import ejb.ProductoFacadeLocal;
import ejb.ProveedorFacadeLocal;
import entity.OrdenCompra;
import entity.Producto;
import entity.Proveedor;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

@ManagedBean
@SessionScoped
@Named(value = "ordencompracontroller")
public class OrdenCompraController implements Serializable{
    
    @EJB
    private OrdenCompraFacadeLocal OrdenEJB;
    private OrdenCompra ordencompra;
    private List<OrdenCompra> listaorden;
    
    @EJB
    private ProveedorFacadeLocal proveedorEJB;
    private Proveedor proveedor;
    private List<Proveedor> listaProveedor;
    
    @EJB
    private ProductoFacadeLocal productoEJB;
    private Producto producto;
    private List<Producto> listaproducto;

    public OrdenCompra getOrdencompra() {
        return ordencompra;
    }

    public void setOrdencompra(OrdenCompra ordencompra) {
        this.ordencompra = ordencompra;
    }

    public List<OrdenCompra> getListaorden() {
        return listaorden;
    }

    public void setListaorden(List<OrdenCompra> listaorden) {
        this.listaorden = listaorden;
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

   
    
            
}
