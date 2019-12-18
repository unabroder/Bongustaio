
package ejb;

import entity.Venta;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class VentaFacade extends AbstractFacade<Venta> implements VentaFacadeLocal{
    
    @PersistenceContext(unitName = "bongustaio")
    private EntityManager em;
    
    @Override
    protected EntityManager getEntityManager(){
        return em;
    }
    
    public VentaFacade(){
        super(Venta.class);
    }
    
}
