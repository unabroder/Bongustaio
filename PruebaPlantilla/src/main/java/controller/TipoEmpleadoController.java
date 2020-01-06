/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import ejb.TipoEmpleadoFacadeLocal;
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
@Named(value = "tipoEmpleadoController")
@SessionScoped
public class TipoEmpleadoController implements Serializable {

    @EJB
    private TipoEmpleadoFacadeLocal tipoEmpleadoEJB;
    private TipoEmpleado tipoEmpleado;
    private List<TipoEmpleado> lista;

    public TipoEmpleado getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(TipoEmpleado tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public List<TipoEmpleado> getLista() {
        this.lista = tipoEmpleadoEJB.findAll();
        return lista;
    }

    public void setLista(List<TipoEmpleado> lista) {
        this.lista = lista;
    }

    /**
     * Creates a new instance of TipoEmpleadoController
     */
    @PostConstruct
    public void init() {
        tipoEmpleado = new TipoEmpleado();
    }

    public void insertar() {
        try {
            tipoEmpleadoEJB.create(tipoEmpleado);
        } catch (Exception e) {
        }
    }

    public void LeerId(TipoEmpleado idtipo) {
        tipoEmpleado = idtipo;
    }

    public void actualizar() {
        try {
            tipoEmpleadoEJB.edit(tipoEmpleado);
        } catch (Exception e) {
        }
    }

    public void listaTP() {
        try {
            lista = tipoEmpleadoEJB.findAll();
        } catch (Exception e) {
        }
    }

    public void eliminar(TipoEmpleado tpEmp) {
        try {
            tipoEmpleado = tpEmp;
            tipoEmpleadoEJB.remove(tipoEmpleado);
        } catch (Exception e) {
        }
    }
    
    public void limpiar(){
        tipoEmpleado = new TipoEmpleado();
    }
}
