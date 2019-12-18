
package controller;

import ejb.EmpleadoFacadeLocal;
import ejb.VentaFacadeLocal;
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


@Named(value = "ventaController")
@SessionScoped
public class VentaController implements Serializable {

        @EJB
        private VentaFacadeLocal ventaEJB;
        private Venta venta;
        private List<Venta> listaventa;
        
        @EJB
        private EmpleadoFacadeLocal empleadoEJB;
        private Empleado empleado;
        private List<Empleado> listaempleado;

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public List<Venta> getListaventa() {
        listaventa=ventaEJB.findAll();
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
        private void init(){
            venta =new Venta();
            empleado = new Empleado();
        }
        
        public void consultarEmpleado(){
            try {
                listaempleado=empleadoEJB.findAll();
            } catch (Exception e) {
            }
        }
        
        public void insertar(){
            try {
                venta.setIdempleado(empleado);
                
                ventaEJB.create(venta);
                FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "su registro fue guardado",null);
                FacesContext.getCurrentInstance().addMessage(null, msg);
            } catch (Exception e) {
            }
        }
        
        public void consultar(){
            try {
                listaventa = ventaEJB.findAll();
            } catch (Exception e) {
            }
        }
        
        public void leerid(Venta vent){
            try {
                this.venta=vent;
            } catch (Exception e) {
            }
        }
        
        public void modificar(){
            try {
                ventaEJB.edit(venta);
            } catch (Exception e) {
            }
        }
        
        public void eliminar(Venta vent){
            this.venta=vent;
            try {
                ventaEJB.remove(venta);
                listaventa=ventaEJB.findAll();
            } catch (Exception e) {
            }
        }
        
        public void CargarVenta(Venta vent){
            this.empleado.setIdempleado(vent.getIdempleado().getIdempleado());
            this.venta=vent;
        }
    
}
