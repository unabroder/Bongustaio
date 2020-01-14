package controller;

import ejb.ComplementoFacadeLocal;
import ejb.EmpleadoFacadeLocal;
import ejb.Plato_CompletoFacadeLocal;
import ejb.VentaFacadeLocal;
import entity.Complemento;
import entity.Empleado;
import entity.Venta;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import entity.Fechas;
import entity.Plato_Completo;
import java.text.SimpleDateFormat;

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
    private Plato_CompletoFacadeLocal platoCompletoEJB;
    private Plato_Completo platoCompleto;
    private List<Plato_Completo> listaPlatoCompleto;
    @EJB
    private ComplementoFacadeLocal complementoEJB;
    private Complemento complemento;
    private List<Complemento> listaComplemento;

    public ComplementoFacadeLocal getComplementoEJB() {
        return complementoEJB;
    }

    public void setComplementoEJB(ComplementoFacadeLocal complementoEJB) {
        this.complementoEJB = complementoEJB;
    }

    public Complemento getComplemento() {
        return complemento;
    }

    public void setComplemento(Complemento complemento) {
        this.complemento = complemento;
    }

    public List<Complemento> getListaComplemento() {
        return listaComplemento;
    }

    public void setListaComplemento(List<Complemento> listaComplemento) {
        this.listaComplemento = listaComplemento;
    }

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

    @PostConstruct
    private void init() {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

        venta = new Venta();
        empleado = new Empleado();
        fecha = new Fechas();
        platoCompleto = new Plato_Completo();
        complemento = new Complemento();

    }

//        public void deshabilitar(Venta venta) {
//        try {
//            venta.setEstado(0);
//            ventaEJB.Estado(venta);
//            listaventa=ventaEJB.findAll();
//            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Se deshabilitó su registro", null);
//            FacesContext.getCurrentInstance().addMessage(null, msg);
//        } catch (Exception e) {
//            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR,"Error "+e.getMessage(),null);
//            FacesContext.getCurrentInstance().addMessage(null, msg);
//        }
//    }
//
//    public void habilitar(Venta venta) {
//        try {
//            venta.setEstado(1);
//            ventaEJB.Estado(venta);
//            listaventa=ventaEJB.findAll();
//            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Se habilitó su registro", null);
//            FacesContext.getCurrentInstance().addMessage(null, msg);
//        } catch (Exception e) {
//            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR,"Error "+e.getMessage(),null);
//            FacesContext.getCurrentInstance().addMessage(null, msg);
//        }
//    }
    public void click() {
        PrimeFaces.current().ajax().update("form:display");
        PrimeFaces.current().executeScript("PF('dlg').show()");
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

    public void insertar() {
        try {

            venta.setIdempleado(empleado);
            venta.setIdcomplemento(complemento);
            venta.setIdplato_completo(platoCompleto);
            System.out.println("empleado " + venta.getIdempleado().getIdempleado());
            System.out.println("plato " + venta.getIdplato_completo().getIdplato_completo());
            System.out.println("complemento " + venta.getIdcomplemento().getIdcomplemento());
            System.out.println("Estado " + venta.getEstado());
            System.out.println("cantidad " + venta.getCantidad());
            System.out.println("total " + venta.getTotal());
            System.out.println("fecha " + venta.getFecha());

            ventaEJB.create(venta);
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Su registro fue guardado", null);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        } catch (Exception e) {
            System.out.println("catch del controller" + e);
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error " + e.getMessage(), null);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }

    public void leerId(Venta vent) {
        try {
            this.empleado.setIdempleado(vent.getIdempleado().getIdempleado());
            this.venta = vent;
        } catch (Exception e) {
        }
    }

    public void modificar() {
        try {
            venta.setIdempleado(empleado);
            venta.setIdcomplemento(complemento);
            venta.setIdplato_completo(platoCompleto);
            ventaEJB.edit(venta);
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Se actualizo correctamente", null);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        } catch (Exception e) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error " + e.getMessage(), null);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }

    public void reporte() {
        try {
            Reporte reporte = new Reporte();
            reporte.reporte(this.listaventa);
        } catch (Exception e) {
        }
    }

    public void eliminar(Venta vent) {
        this.venta = vent;
        try {
            ventaEJB.remove(venta);
            listaventa = ventaEJB.findAll();
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Se elimino correctamente", null);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        } catch (Exception e) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error " + e.getMessage(), null);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }

    public void limpiar() {
        venta = new Venta();
        empleado = new Empleado();

    }

    public Plato_CompletoFacadeLocal getPlatoCompletoEJB() {
        return platoCompletoEJB;
    }

    public void setPlatoCompletoEJB(Plato_CompletoFacadeLocal platoCompletoEJB) {
        this.platoCompletoEJB = platoCompletoEJB;
    }

    public Plato_Completo getPlatoCompleto() {
        return platoCompleto;
    }

    public void setPlatoCompleto(Plato_Completo platoCompleto) {
        this.platoCompleto = platoCompleto;
    }

    public List<Plato_Completo> getListaPlatoCompleto() {
        return listaPlatoCompleto;
    }

    public void setListaPlatoCompleto(List<Plato_Completo> listaPlatoCompleto) {
        this.listaPlatoCompleto = listaPlatoCompleto;
    }

    public VentaFacadeLocal getVentaEJB() {
        return ventaEJB;
    }

    public void setVentaEJB(VentaFacadeLocal ventaEJB) {
        this.ventaEJB = ventaEJB;
    }

}
