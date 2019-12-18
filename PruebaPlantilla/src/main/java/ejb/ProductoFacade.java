/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Bitacora;
import entity.Producto;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ProductoFacade extends AbstractFacade<Producto> implements ProductoFacadeLocal {
    
   @PersistenceContext(unitName = "bongustaio")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {

        return em;
    }

    public ProductoFacade() {

        super(Producto.class);
    }

    
}
