package ejb;

import entity.Proveedor;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author joqtan.marmolusam
 */
@Stateless
public class ProveedorFacade extends AbstractFacade<Proveedor> implements ProveedorFacadeLocal{
        
    @PersistenceContext(unitName = "bongustaio")
    private EntityManager em;
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }        
    public ProveedorFacade(){
        super(Proveedor.class);
    }    
}
