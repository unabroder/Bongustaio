
package ejb;

import entity.Venta;
import java.util.LinkedList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
    
    public List<Venta> consultaEstado(int estado){
        String sql="SELECT v FROM Venta v where v.estado=1";
        
        List<Venta> lista=new LinkedList<>();
        try {
            Query q= em.createQuery(sql);
            q.setParameter(1, estado);
            lista=q.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return lista;
        }
        return lista;
    }
   
    
}
