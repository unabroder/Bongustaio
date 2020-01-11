package controller;

import ejb.EmpleadoFacadeLocal;
import ejb.VentaFacadeLocal;
import entity.Empleado;
import entity.Venta;
import entity.VentaDetalleComplemento;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import ejb.VentaDetalleComplementoFacadeLocal;
import entity.Fechas;
import org.primefaces.PrimeFaces;

@Named(value = "ventaController")
@SessionScoped
public class VentaController implements Serializable {

    @EJB
    private VentaFacadeLocal ventaEJB;
    private Venta venta;
    private List<Venta> listaventa;
    private Fechas fecha;

    public Fechas getFecha() {
        return fecha;
    }

    public void setFecha(Fechas fecha) {
        this.fecha = fecha;
    }

    @EJB
    private EmpleadoFacadeLocal empleadoEJB;
    private Empleado empleado;
    private List<Empleado> listaempleado;

    @EJB
    private VentaDetalleComplementoFacadeLocal vdComplementoEJB;
    private VentaDetalleComplemento vdComplemento;
    private List<VentaDetalleComplemento> listavdComplemento;

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public List<Venta> getListaventa() {
        this.listaventa = ventaEJB.consultarVenta(fecha.getFecha1(), fecha.getFecha2());
        return listaventa;
    }

    public void setListaventa(List<Venta> listaventa) {
        this.listaventa = listaventa;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public List<Empleado> getListaempleado() {
        return listaempleado;
    }

    public void setListaempleado(List<Empleado> listaempleado) {
        this.listaempleado = listaempleado;
    }

    public VentaDetalleComplemento getVdComplemento() {
        return vdComplemento;
    }

    public void setVdComplemento(VentaDetalleComplemento vdComplemento) {
        this.vdComplemento = vdComplemento;
    }

    public List<VentaDetalleComplemento> getListavdComplemento() {
        return listavdComplemento;
    }

    public void setListavdComplemento(List<VentaDetalleComplemento> listavdComplemento) {
        this.listavdComplemento = listavdComplemento;
    }

    @PostConstruct
    private void init() {
        venta = new Venta();
        empleado = new Empleado();
        fecha = new Fechas();

        vdComplemento = new VentaDetalleComplemento();

    }

    public EmpleadoFacadeLocal getEmpleadoEJB() {
        return empleadoEJB;
    }

    public void consultarEmpleado() {
        try {
            this.listaempleado = empleadoEJB.findAll();
        } catch (Exception e) {
        }
    }

    public void consultarVDComplemento() {
        try {
            this.listavdComplemento = vdComplementoEJB.findAll();
        } catch (Exception e) {
        }
    }

    public void insertar() {
        try {
            venta.setIdempleado(empleado);
            venta.setIdventaDetalle_complemento(vdComplemento);
            ventaEJB.create(venta);
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Su registro fue guardado", null);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        } catch (Exception e) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error "+e.getMessage(), null);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }

 

    public void leerId(Venta vent) {
        try {
            this.empleado.setIdempleado(vent.getIdempleado().getIdempleado());
            this.vdComplemento.setIdventaDetalle_complemento(vent.getIdventaDetalle_complemento().getIdventaDetalle_complemento());
            this.venta = vent;
        } catch (Exception e) {
        }
    }

    public void modificar() {
        try {
            venta.setIdempleado(empleado);
            venta.setIdventaDetalle_complemento(vdComplemento);
            ventaEJB.edit(venta);
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO,"Se actualizo correctamente",null);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        } catch (Exception e) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR,"Error "+e.getMessage(),null);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }
    
      public void reporte() {
        try {
            System.out.println("metodo de reporte ");
           Reporte reporte = new Reporte();
           reporte.reporte(this.fecha.getFecha1(), this.fecha.getFecha2());
        } catch (Exception e) {
        }
    }

    public void eliminar(Venta vent) {
        this.venta = vent;
        try {
            ventaEJB.remove(venta);
            listaventa = ventaEJB.findAll();
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO,"Se elimino correctamente",null);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        } catch (Exception e) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR,"Error "+e.getMessage(),null);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }

    public void limpiar() {
        venta = new Venta();
        empleado = new Empleado();
        vdComplemento = new VentaDetalleComplemento();
    }

}
