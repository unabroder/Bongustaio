/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.VentaDetalleComplemento;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author claudia.santosusam
 */
@Stateless
public class VentaDetalleComplementoFacade extends AbstractFacade<VentaDetalleComplemento> implements VentaDetalleComplementoFacadeLocal {
    
    @PersistenceContext(unitName = "bongustaio")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {

        return em;
    }

    public VentaDetalleComplementoFacade() {

        super(VentaDetalleComplemento.class);
    }
    
    
    
}
