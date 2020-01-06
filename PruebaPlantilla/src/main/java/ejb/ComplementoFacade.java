/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author claudia.santosusam
 */
@Named(value = "complementoFacade")
@Dependent
public class ComplementoFacade {

    /**
     * Creates a new instance of ComplementoFacade
     */
    public ComplementoFacade() {
    }
    
}
