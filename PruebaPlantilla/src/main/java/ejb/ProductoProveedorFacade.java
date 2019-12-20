/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.ProductoProveedor;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author claudia.santosusam
 */
@Stateless
public class ProductoProveedorFacade extends AbstractFacade<ProductoProveedor> implements ProductoProveedorFacadeLocal{
   
    
    @PersistenceContext(unitName = "bongustaio")
    private EntityManager em;
    
    @Override
    protected EntityManager getEntityManager() {

        return em;
    }
    
   public ProductoProveedorFacade() {

        super(ProductoProveedor.class);
    } 
    
}
