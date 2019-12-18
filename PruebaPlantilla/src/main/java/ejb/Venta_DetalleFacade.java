
package ejb;

import entity.Venta_Detalle;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class Venta_DetalleFacade extends AbstractFacade<Venta_Detalle> implements VentaFacadeLocal{
    
    @PersistenceContext(unitName = "bongustaio")
    private EntityManager em;
    
    @Override
    protected EntityManager geEntityManager(){
        return em;
    }
    
    public Venta_DetalleFacade(){
        super(Venta_Detalle.class);
    }
    
}
