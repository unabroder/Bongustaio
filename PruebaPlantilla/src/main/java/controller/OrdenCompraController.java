package controller;

import ejb.OrdenCompraFacadeLocal;
import ejb.ProductoFacadeLocal;
import ejb.ProveedorFacadeLocal;
import ejb.SucursalFacadeLocal;
import entity.Fechas;
import entity.OrdenCompra;
import entity.Producto;
import entity.Proveedor;
import entity.Sucursal;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@ManagedBean
@SessionScoped
@Named(value = "ordencompracontroller")
public class OrdenCompraController implements Serializable {

    @EJB
    private OrdenCompraFacadeLocal OrdenEJB;
    private OrdenCompra ordencompra;
    private List<OrdenCompra> listaorden;
    
    private Fechas fecha;

    public Fechas getFecha() {
        return fecha;
    }

    public void setFecha(Fechas fecha) {
        this.fecha = fecha;
    }
    
    

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

    String mensaje;

    public OrdenCompra getOrdencompra() {
        return ordencompra;
    }

    public void setOrdencompra(OrdenCompra ordencompra) {
        this.ordencompra = ordencompra;
    }

    public List<OrdenCompra> getListaorden() {
   return    this.listaorden = OrdenEJB.consultarOrden(fecha.getFecha1(),fecha.getFecha2());
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
        this.listaProveedor = proveedorEJB.findAll();
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
        this.listaSucursal = sucursalEJB.findAll();
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
        this.listaproducto = productoEJB.findAll();
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

    @PostConstruct
    private void init() {
        ordencompra = new OrdenCompra();
        proveedor = new Proveedor();
        sucursal = new Sucursal();
        producto = new Producto();
        fecha = new Fechas();
    }

    public void insertar() {
        try {
            ordencompra.setIdproveedor(proveedor);
            ordencompra.setIdproducto(producto);
            ordencompra.setIdsucursal(sucursal);
            OrdenEJB.create(ordencompra);

            this.mensaje = "Orde de Compra Registrada Exitosamente";

        } catch (Exception e) {
            this.mensaje = "Error :" + e.getMessage();
            e.printStackTrace();
        }
        FacesMessage msj = new FacesMessage(mensaje);
        FacesContext.getCurrentInstance().addMessage(null, msj);
    }

    public void modificar() {
        try {
            ordencompra.setIdproveedor(proveedor);
            ordencompra.setIdproducto(producto);
            ordencompra.setIdsucursal(sucursal);
            OrdenEJB.edit(ordencompra);
            this.mensaje = "Orden de compra modificada";
        } catch (Exception e) {
            this.mensaje = "Error: " + e.getMessage();
            e.printStackTrace();
        }
        FacesMessage msj = new FacesMessage(mensaje);
        FacesContext.getCurrentInstance().addMessage(null, msj);
    }

    public void leerid(OrdenCompra orden) {
        try {
            this.proveedor.setIdproveedor(orden.getIdproveedor().getIdproveedor());
            this.producto.setIdproducto(orden.getIdproducto().getIdproducto());
            this.sucursal.setIdsucursal(orden.getIdsucursal().getIdsucursal());
            this.ordencompra = orden;
        } catch (Exception e) {
        }
        FacesMessage msj = new FacesMessage(mensaje);
        FacesContext.getCurrentInstance().addMessage(null, msj);
    }

    public void eliminar(OrdenCompra orden) {
        try {
            ordencompra = orden;
            OrdenEJB.remove(ordencompra);
            this.mensaje = "Orden de compra eliminada";
        } catch (Exception e) {
            this.mensaje = "Error " + e.getMessage();
            e.printStackTrace();
        }
        FacesMessage msj = new FacesMessage(mensaje);
        FacesContext.getCurrentInstance().addMessage(null, msj);
    }

    public void limpiar() {
        ordencompra = new OrdenCompra();
        proveedor = new Proveedor();
        sucursal = new Sucursal();
        producto = new Producto();
    }

}
