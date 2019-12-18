
package controller;

import ejb.InventarioFacadeLocal;
import ejb.ProductoProveedorFacadeLocal;
import entity.Inventario;
import entity.ProductoProveedor;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;


@Named(value = "inventarioController")
@Dependent
public class InventarioController implements Serializable{
    
    //Declarar variables
    @EJB
    private InventarioFacadeLocal inventarioEJB;
    private Inventario inventario;
    private List<Inventario> listaInventario;

    @EJB
    private ProductoProveedorFacadeLocal productoProveedorFacadeLocalEJB;
    private ProductoProveedor productoProveedor;
    private List<ProductoProveedor> listaProductoProveedores;
    
    
    //contrustores
    public InventarioController() {
    }
    
    //PostConstructores
    @PostConstruct
    public void init(){
        inventario = new Inventario();
        productoProveedor = new ProductoProveedor();
    }

    
    //Getters y Setters
    
    public InventarioFacadeLocal getInventarioEJB() {
        return inventarioEJB;
    }

    public void setInventarioEJB(InventarioFacadeLocal inventarioEJB) {
        this.inventarioEJB = inventarioEJB;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public List<Inventario> getListaInventario() {
        return listaInventario;
    }

    public void setListaInventario(List<Inventario> listaInventario) {
        this.listaInventario = listaInventario;
    }

    public ProductoProveedorFacadeLocal getProductoProveedorFacadeLocalEJB() {
        return productoProveedorFacadeLocalEJB;
    }

    public void setProductoProveedorFacadeLocalEJB(ProductoProveedorFacadeLocal productoProveedorFacadeLocalEJB) {
        this.productoProveedorFacadeLocalEJB = productoProveedorFacadeLocalEJB;
    }

    public ProductoProveedor getProductoProveedor() {
        return productoProveedor;
    }

    public void setProductoProveedor(ProductoProveedor productoProveedor) {
        this.productoProveedor = productoProveedor;
    }

    public List<ProductoProveedor> getListaProductoProveedores() {
        return listaProductoProveedores;
    }

    public void setListaProductoProveedores(List<ProductoProveedor> listaProductoProveedores) {
        this.listaProductoProveedores = listaProductoProveedores;
    }
    
    
    
    //metodos 
    public void insertar(){
        try {
            inventarioEJB.create(inventario);
        } catch (Exception e) {
        }
    }
    
    public void obtenerTodos(){
        try {
          listaInventario = inventarioEJB.findAll();  
        } catch (Exception e) {
        }
        
    }
    
    public void obtenerUno(Inventario inven){
        try {
            this.inventario = inven;
        } catch (Exception e) {
        }
    }
    
    public void actualizar(){
        try {
            inventarioEJB.edit(inventario);
        } catch (Exception e) {
        }
    }
    
    public void eliminar(Inventario inven){
        this.inventario = inven;
        try {
            inventarioEJB.remove(inventario);
            listaInventario = inventarioEJB.findAll();
        } catch (Exception e) {
        }
       
    
    }
}
