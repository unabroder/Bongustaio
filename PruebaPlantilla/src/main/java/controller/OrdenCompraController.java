package controller;

import ejb.OrdenCompraFacadeLocal;
import ejb.ProductoFacadeLocal;
import ejb.ProveedorFacadeLocal;
import ejb.SucursalFacadeLocal;
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
        ordencompra = new OrdenCompra();
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
            ordencompra.setIdproveedor(proveedor);
            ordencompra.setIdproducto(producto);

            OrdenEJB.create(ordencompra);
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "su registro fue guardado", null);
            FacesContext.getCurrentInstance().addMessage(null, msg);

        } catch (Exception e) {
        }

    }

    public void listar() {
        try {
            listaorden = OrdenEJB.findAll();

        } catch (Exception e) {
        }

    }

    public void modificar() {
        try {
            ordencompra.setIdproveedor(proveedor);
            ordencompra.setIdproducto(producto);
            OrdenEJB.edit(ordencompra);

        } catch (Exception e) {
        }

    }

    public void leerid(OrdenCompra orden) {
        try {
            this.proveedor.setIdproveedor(orden.getIdproveedor().getIdproveedor());
            this.producto.setIdproducto(orden.getIdproducto().getIdproducto());
            this.ordencompra = orden;
        } catch (Exception e) {
        }

    }

    public void eliminar(OrdenCompra orden) {
        try {
            ordencompra = orden;
            OrdenEJB.remove(ordencompra);
        } catch (Exception e) {
        }

    }

    public void limpiar() {
        ordencompra = new OrdenCompra();

    }

}
