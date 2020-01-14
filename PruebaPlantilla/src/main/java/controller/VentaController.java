package controller;

import ejb.ComplementoFacadeLocal;
import ejb.EmpleadoFacadeLocal;
import ejb.Plato_CompletoFacadeLocal;
<<<<<<< HEAD
import ejb.VentaFacadeLocal;
import entity.Complemento;
import entity.Empleado;
import entity.Venta;

=======
import ejb.UsuariosFacadeLocal;
import ejb.VentaFacadeLocal;
import entity.Empleado;
import entity.Venta;
>>>>>>> 2452322cca5c236ae20a9fbe316e7e584816dca8
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
<<<<<<< HEAD

import entity.Fechas;
import entity.Plato_Completo;
import java.text.SimpleDateFormat;

import org.primefaces.PrimeFaces;
=======
import entity.Complemento;
import entity.Plato_Completo;
import entity.Usuarios;
import java.util.Iterator;
>>>>>>> 2452322cca5c236ae20a9fbe316e7e584816dca8

@Named(value = "ventaController")
@SessionScoped
public class VentaController implements Serializable {

    @EJB
    private VentaFacadeLocal ventaEJB;
    private Venta venta;
    private List<Venta> listaventa;
<<<<<<< HEAD
    private Fechas fecha;

    public Fechas getFecha() {

        return fecha;
    }

    public void setFecha(Fechas fecha) {
        this.fecha = fecha;
    }
=======
>>>>>>> 2452322cca5c236ae20a9fbe316e7e584816dca8

    @EJB
    private EmpleadoFacadeLocal empleadoEJB;
    private Empleado empleado;
    private List<Empleado> listaempleado;

    @EJB
    private Plato_CompletoFacadeLocal platoCompletoEJB;
<<<<<<< HEAD
    private Plato_Completo platoCompleto;
    private List<Plato_Completo> listaPlatoCompleto;
=======
    private Plato_Completo plato_Completo;
    private List<Plato_Completo> listaPlatoCompleto;

>>>>>>> 2452322cca5c236ae20a9fbe316e7e584816dca8
    @EJB
    private ComplementoFacadeLocal complementoEJB;
    private Complemento complemento;
    private List<Complemento> listaComplemento;

<<<<<<< HEAD
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

=======
     @EJB
    private UsuariosFacadeLocal usuarioEJB;
    private Usuarios usuarios;
    private List<Usuarios> lsUsuarios;

    
>>>>>>> 2452322cca5c236ae20a9fbe316e7e584816dca8
    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public List<Venta> getListaventa() {
<<<<<<< HEAD
        System.out.println(fecha.getFecha1()+"fecha2"+ fecha.getFecha2());
        this.listaventa = ventaEJB.consultarVenta(fecha.getFecha1(), fecha.getFecha2());

=======
        this.listaventa = ventaEJB.findAll();
>>>>>>> 2452322cca5c236ae20a9fbe316e7e584816dca8
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

<<<<<<< HEAD
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

=======
    public Plato_Completo getPlato_Completo() {
        return plato_Completo;
    }

    public void setPlato_Completo(Plato_Completo plato_Completo) {
        this.plato_Completo = plato_Completo;
    }

    public List<Plato_Completo> getListaPlatoCompleto() {
        return listaPlatoCompleto;
    }

    public void setListaPlatoCompleto(List<Plato_Completo> listaPlatoCompleto) {
        this.listaPlatoCompleto = listaPlatoCompleto;
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

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    public List<Usuarios> getLsUsuarios() {
        return lsUsuarios;
    }

    public void setLsUsuarios(List<Usuarios> lsUsuarios) {
        this.lsUsuarios = lsUsuarios;
    }

    @PostConstruct
    private void init() {
        venta = new Venta();
        empleado = new Empleado();
        plato_Completo = new Plato_Completo();
        complemento = new Complemento();
    }

>>>>>>> 2452322cca5c236ae20a9fbe316e7e584816dca8
    public void consultarEmpleado() {
        try {
            this.listaempleado = empleadoEJB.findAll();
        } catch (Exception e) {
        }
    }

    public void insertar() {
        try {
<<<<<<< HEAD
            
            venta.setIdempleado(empleado);
            venta.setIdcomplemento(complemento);
            venta.setIdplato_completo(platoCompleto);
            System.out.println("empleado "+venta.getIdempleado().getIdempleado());
            System.out.println("plato "+venta.getIdplato_completo().getIdplato_completo());
            System.out.println("complemento "+venta.getIdcomplemento().getIdcomplemento());
            System.out.println("Estado "+venta.getEstado());
            System.out.println("cantidad "+venta.getCantidad());
            System.out.println("total "+venta.getTotal());
            System.out.println("fecha "+venta.getFecha());
            
            ventaEJB.create(venta);
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Su registro fue guardado", null);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        } catch (Exception e) {
            System.out.println("catch del controller"+e);
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error " + e.getMessage(), null);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }

    public void leerId(Venta vent) {
        try {
            this.empleado.setIdempleado(vent.getIdempleado().getIdempleado());
            this.venta = vent;
=======
//            plato_Completo = platoCompletoEJB.find(idPlatoCompleto);
//            complemento = complementoEJB.find(idComplemento);
//            empleado = empleadoEJB.find(idEmpleado);
            System.out.println(plato_Completo);
         
            venta.setPlatoCompleto(plato_Completo);
            double precio;
            double total;
            this.listaPlatoCompleto = this.platoCompletoEJB.platoPrecio(plato_Completo);
            Iterator iter = listaPlatoCompleto.iterator();
            while (iter.hasNext()) {                
                plato_Completo = (Plato_Completo) iter.next();
                System.out.println(plato_Completo.getPrecio());
            }
            venta.setComplemento(complemento);
            this.listaComplemento = this.complementoEJB.precioComplemento(complemento);
            Iterator c = listaComplemento.iterator();
            while (c.hasNext()) {                
                complemento = (Complemento) c.next();
                complemento.getPrecio();
            }
            this.lsUsuarios = this.usuarioEJB.obtenerEmp(usuarios);
            Iterator usu = lsUsuarios.iterator();
            while (usu.hasNext()) {                
                usuarios = (Usuarios) usu.next();
                System.out.println(usuarios.getIdempleado().getIdempleado());
            }
            empleado.setIdempleado(usuarios.getIdempleado().getIdempleado());
            venta.setEmpleado(empleado);
            precio = plato_Completo.getPrecio();
            total = (venta.getCantidad() * precio) + complemento.getPrecio();
            venta.setTotal(total);
            System.out.println("total " + total);
            ventaEJB.create(venta);
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "su registro fue guardado", null);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        } catch (Exception e) {
        }
    }

    public void consultar() {
        try {
            listaventa = ventaEJB.findAll();
>>>>>>> 2452322cca5c236ae20a9fbe316e7e584816dca8
        } catch (Exception e) {
        }
    }

<<<<<<< HEAD
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
            System.out.println("metodo de reporte ");
            Reporte reporte = new Reporte();
            reporte.reporte(this.listaventa);
=======
    public void leerId(Venta vent) {
        try {
            this.empleado.setIdempleado(vent.getEmpleado().getIdempleado());
            this.plato_Completo.setIdplato_completo(vent.getPlatoCompleto().getIdplato_completo());
            this.complemento.setIdcomplemento(vent.getComplemento().getIdcomplemento());
            this.venta = vent;
        } catch (Exception e) {
        }
    }

    public void modificar() {
        try {
            venta.setEmpleado(empleado);
            venta.setPlatoCompleto(plato_Completo);
            venta.setComplemento(complemento);

            ventaEJB.edit(venta);
>>>>>>> 2452322cca5c236ae20a9fbe316e7e584816dca8
        } catch (Exception e) {
        }
    }

    public void eliminar(Venta vent) {
        this.venta = vent;
        try {
            ventaEJB.remove(venta);
            listaventa = ventaEJB.findAll();
<<<<<<< HEAD
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Se elimino correctamente", null);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        } catch (Exception e) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error " + e.getMessage(), null);
            FacesContext.getCurrentInstance().addMessage(null, msg);
=======
        } catch (Exception e) {
>>>>>>> 2452322cca5c236ae20a9fbe316e7e584816dca8
        }
    }

    public void limpiar() {
        venta = new Venta();
        empleado = new Empleado();
<<<<<<< HEAD

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
=======
        plato_Completo = new Plato_Completo();
        complemento = new Complemento();
>>>>>>> 2452322cca5c236ae20a9fbe316e7e584816dca8
    }

}
