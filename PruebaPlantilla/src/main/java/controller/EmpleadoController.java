/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import ejb.EmpleadoFacadeLocal;
import entity.Empleado;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author roberto.alferesusam
 */
@Named(value = "empleadoController")
@SessionScoped
public class EmpleadoController implements Serializable {
    
    @EJB
    private EmpleadoFacadeLocal empleadoEJB;
    private Empleado empleado;
    private List<Empleado> listaEmpleado;
    
    public EmpleadoFacadeLocal getEmpleadoEJB() {
        return empleadoEJB;
    }
    
    public void setEmpleadoEJB(EmpleadoFacadeLocal empleadoEJB) {
        this.empleadoEJB = empleadoEJB;
    }
    
    public Empleado getEmpleado() {
        return empleado;
    }
    
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    
    @PostConstruct
    public void init() {
        empleado = new Empleado();
    }

    public void insertar() {
        try {
            empleadoEJB.create(empleado);
        } catch (Exception e) {
        }
    }
    
    public void editar(){
        try {
            empleadoEJB.edit(empleado);
        } catch (Exception e) {
        }
    }
    
    public void eliminar(){
        
    }
}
