package ejb;

import entity.PlatoCompleto;
import java.util.LinkedList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author joqtan.marmolusam
 */
@Stateless
public class PlatoCompletoFacade extends AbstractFacade<PlatoCompleto> implements PlatoCompletoFacadeLocal{
    @PersistenceContext(unitName = "bongustaio")
    private EntityManager em;
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    public PlatoCompletoFacade(){
        super(PlatoCompleto.class);
    }

    public List<PlatoCompleto> consulta(){
        String sql = "select ce from plato_completo ce where ce.estado=1";
        List<PlatoCompleto> lista = new LinkedList<>();
        try {
            Query q = em.createQuery(sql);
            lista = q.getResultList();
        } catch (Exception e) {
            return lista;
        }
        return lista;
    }
}
