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
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Named(value = "inventarioController")
@SessionScoped
public class InventarioController implements Serializable {

    //Declarar variables
    @EJB
    private InventarioFacadeLocal inventarioEJB;
    private Inventario inventario;
    private List<Inventario> listaInventario;

    private ProductoProveedorFacadeLocal productoProveedorEJB;
    private ProductoProveedor productoProveedor;
    private List<ProductoProveedor> listaProductoProveedores;

    String mensaje;

    //contrustores
    public InventarioController() {
    }

    
    //Getters y Setters

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

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
    //PostConstructores
    @PostConstruct
    public void init() {
        productoProveedor = new ProductoProveedor();
        inventario = new Inventario();
    }

    //metodos 
    
    public void obtenerTodos() {
        try {
            listaInventario = inventarioEJB.findAll();
        } catch (Exception e) {
        }

    }

    public void obtenerUno(Inventario idInven) {
        try {
            this.productoProveedor.setIdprod_prov(idInven.getIdprod_prov().getIdprod_prov());
            this.inventario = idInven;
        } catch (Exception e) {
        }
    }
    
    public void insertar() {
        try {
            this.inventario.setIdprod_prov(productoProveedor);
            inventarioEJB.create(inventario);
            this.mensaje = "INSERTADO";
        } catch (Exception e) {
            this.mensaje = "NO INSERTADO" + e.getMessage();
        }
        FacesMessage msj = new FacesMessage(this.mensaje);
        FacesContext.getCurrentInstance().addMessage(null, msj);
        
    }

    public void actualizar() {
        try {
            this.inventario.setIdprod_prov(productoProveedor);
            this.inventarioEJB.edit(inventario);
            this.mensaje = "ACTUALIZADO";
        } catch (Exception e) {
            this.mensaje = "NO ACTUALIZADO";
            e.printStackTrace();
        }
        FacesMessage msj = new FacesMessage(this.mensaje);
        FacesContext.getCurrentInstance().addMessage(null, msj);
    }

    public void eliminar(Inventario idInven) {
        this.inventario = idInven;
        try {
            this.inventario.setIdprod_prov(productoProveedor);
            this.inventarioEJB.remove(idInven);
            this.mensaje = "ELIMINADO";
            listaInventario = inventarioEJB.findAll();
        } catch (Exception e) {
            this.mensaje = "NO INSERTADO";
        }
        FacesMessage msj = new FacesMessage(this.mensaje);
        FacesContext.getCurrentInstance().addMessage(null, msj);
    }
    
    public void listarproductoProveedor() {
        try {
            this.listaProductoProveedores = productoProveedorEJB.findAll();
        } catch (Exception e) {
        }
    }
    
    public void limpiar() {
        try {
            this.inventario = new Inventario();
            this.productoProveedor = new ProductoProveedor();
        } catch (Exception e) {
        }
    }
}
