package ejb;

import entity.CatalogoEspecialidad;
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
public class CatalogoEspecialidadFacade extends AbstractFacade<CatalogoEspecialidad> implements CatalogoEspecialidadFacadeLocal{
    @PersistenceContext(unitName = "bongustaio")
    private EntityManager em;
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    public CatalogoEspecialidadFacade(){
        super(CatalogoEspecialidad.class);
    }

    public List<CatalogoEspecialidad> consulta(){
        String sql = "select ce from catalogo_especialidad ce where ce.estado=1";
        List<CatalogoEspecialidad> lista = new LinkedList<>();
        try {
            Query q = em.createQuery(sql);
            lista = q.getResultList();
        } catch (Exception e) {
            return lista;
        }
        return lista;
    }
}
