package ejb;

import entity.Sucursal;
import entity.Tiposucursal;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class SucursalFacade extends AbstractFacade<Sucursal> implements SucursalFacadeLocal {

    @PersistenceContext(unitName = "bongustaio")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SucursalFacade() {
        super(Sucursal.class);
    }

    public void removeEstado(Sucursal sucursal) {
        String sql;
        
        try {
            sql = "UPDATE sucursal s set s.estado=0 WHERE s.idsucursal=?1";
            Query query = em.createQuery(sql);
            query.setParameter(1, sucursal.getIdsucursal());

        } catch (Exception e) {
            throw e;
        }

    }

    @Override
    public List<Sucursal> findAllActivo() {

        List<Sucursal> lista = null;
        String sql;

        try {
            sql = "SELECT s FROM sucursal s WHERE estado=1";
            Query query = em.createQuery(sql);
            lista = query.getResultList();

        } catch (Exception e) {
            throw e;
        }
        return lista;

    }

}
