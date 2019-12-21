/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import ejb.EmpleadoFacadeLocal;
import ejb.SucursalFacadeLocal;
import ejb.TipoEmpleadoFacadeLocal;
import entity.Empleado;
import entity.Sucursal;
import entity.TipoEmpleado;
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

    private SucursalFacadeLocal sucursalEJB;
    private Sucursal sucursal;
    private List<Sucursal> listSucursal;

    private TipoEmpleadoFacadeLocal tipoEmpEJB;
    private TipoEmpleado tipoEmp;
    private List<TipoEmpleado> lsTipoEmp;
    //Producto == pro
    //porveedor == prov
    //lista = lis

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public List<Empleado> getListaEmpleado() {
        this.listaEmpleado = empleadoEJB.findAll();
        return listaEmpleado;
    }

    public void setListaEmpleado(List<Empleado> listaEmpleado) {
        this.listaEmpleado = listaEmpleado;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public List<Sucursal> getListSucursal() {
        return listSucursal;
    }

    public void setListSucursal(List<Sucursal> listSucursal) {
        this.listSucursal = listSucursal;
    }

    public TipoEmpleado getTipoEmp() {
        return tipoEmp;
    }

    public void setTipoEmp(TipoEmpleado tipoEmp) {
        this.tipoEmp = tipoEmp;
    }

    public List<TipoEmpleado> getLsTipoEmp() {
        return lsTipoEmp;
    }

    public void setLsTipoEmp(List<TipoEmpleado> lsTipoEmp) {
        this.lsTipoEmp = lsTipoEmp;
    }

    @PostConstruct
    public void init() {
        empleado = new Empleado();
    }

    
    public void insertar() {
        try {
            empleado.setIdsucursal(sucursal);
            empleado.setIdtipoempleado(tipoEmp);
            empleadoEJB.create(empleado);
        } catch (Exception e) {
        }
    }

    public void editar() {
        try {
            empleado.setIdsucursal(sucursal);
            empleado.setIdtipoempleado(tipoEmp);
            empleadoEJB.edit(empleado);
        } catch (Exception e) {
        }
    }

    public void eliminar(Empleado emp) {
        try {
            empleado = emp;
            empleadoEJB.remove(empleado);
        } catch (Exception e) {
        }
    }

    public void lisEmp() {
        try {
            listaEmpleado = empleadoEJB.findAll();
        } catch (Exception e) {
        }
    }

    public void lsSucursal() {
        try {
            listSucursal = sucursalEJB.findAll();
        } catch (Exception e) {
        }
    }

    public void lisTipoEmp() {
        try {
            lsTipoEmp = tipoEmpEJB.findAll();
        } catch (Exception e) {
        }
    }
}
