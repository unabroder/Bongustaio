/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author roberto.alferesusam
 */
@Named(value = "tipoEmpleadoController")
@SessionScoped
public class TipoEmpleadoController implements Serializable{

    /**
     * Creates a new instance of TipoEmpleadoController
     */
    public TipoEmpleadoController() {
    }
    
}
