/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import ejb.ComplementoFacadeLocal;
import ejb.VentaDetalleComplemetoFacadeLocal;
import entity.Complemento;
import entity.VentaDetalleComplemento;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author claudia.santosusam
 */
@Named(value = "ventaDetalleComplementoController")
@SessionScoped
public class VentaDetalleComplementoController implements Serializable {

    @EJB
    private VentaDetalleComplemetoFacadeLocal vdcomplementoEJB;
    private VentaDetalleComplemento vdcomplement;
    private List<VentaDetalleComplemento> listavdcomplemento;

    @EJB
    private ComplementoFacadeLocal complementoEJB;
    private Complemento complemento;
    private List<Complemento> listaComplemento;
    
    

}

}
