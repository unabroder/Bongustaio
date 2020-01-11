package controller;

import ejb.InventarioFacadeLocal;

import ejb.ProductoFacadeLocal;
import entity.Fechas;
import entity.Inventario;
import entity.Producto;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.PrimeFaces;

@Named(value = "inventarioController")
@SessionScoped
public class InventarioController implements Serializable {

    //Declarar variables
    @EJB
    private InventarioFacadeLocal inventarioEJB;
    private Inventario inventario;
    private List<Inventario> listaInventario;
    private  Fechas fecha;

    public Fechas getFecha() {
        return fecha;
    }

    public void setFecha(Fechas fecha) {
        this.fecha = fecha;
    }
    
<<<<<<< HEAD
    
    
    
    
=======
>>>>>>> 1ea69ceea18d17b6ddd0fc4392d76bb84fa98f51
    @EJB
    private ProductoFacadeLocal productoEJB;
    private Producto producto;
    private List<Producto> listaproducto;
    
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
    
    public String getMensaje() {
        return mensaje;
    }
    
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    //PostConstructores
    @PostConstruct
    public void init() {
        inventario = new Inventario();
        producto = new Producto();
        fecha= new Fechas();
        obtenerTodos();
    }
    
        public void click() {
        PrimeFaces.current().ajax().update("form:display");
        PrimeFaces.current().executeScript("PF('dlg').show()");
    }

    //metodos 
    public void obtenerTodos() {
        try {
            listaInventario = inventarioEJB.findAll();
            listaproducto = productoEJB.findAll();
        } catch (Exception e) {
        }
        
    }
    public void obtenerUno(Inventario idInven) {
        try {
            this.producto.setIdproducto(idInven.getIdproducto().getIdproducto());
            this.inventario = idInven;
        } catch (Exception e) {
        }
    }
    
    public void insertar() {
        try {
            this.inventario.setIdproducto(producto);
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
            this.inventario.setIdproducto(producto);
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
            this.inventarioEJB.remove(idInven);
            this.mensaje = "ELIMINADO";
            listaInventario = inventarioEJB.findAll();
        } catch (Exception e) {
            this.mensaje = "NO ELIMINADO";
        }
        FacesMessage msj = new FacesMessage(this.mensaje);
        FacesContext.getCurrentInstance().addMessage(null, msj);
    }
   
    public List<Inventario> consultar(){
    return this.listaInventario=inventarioEJB.findAll();
    }
    
    public void limpiar() {
        try {
            this.inventario = new Inventario();
            this.producto = new Producto();
        } catch (Exception e) {
        }
    }
    
    
}
