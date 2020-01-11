package ejb;

import entity.Plato_Completo;
import java.util.LinkedList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class Plato_CompletoFacade extends AbstractFacade<Plato_Completo> implements Plato_CompletoFacadeLocal {

    @PersistenceContext(unitName = "bongustaio")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Plato_CompletoFacade() {
        super(Plato_Completo.class);
    }

    public List<Plato_Completo> consultaEstado(int estado) {
        String sql = "select pc from plato_completo where pc.estado=1";

        List<Plato_Completo> lista = new LinkedList<>();
        try {
            Query q = em.createQuery(sql);
            q.setParameter(1, estado);
            lista = q.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return lista;
        }
        return lista;
    }

    @Override
    public List<Plato_Completo> obtenerPlatoPorTipoProducto(int idTipoProducto) {
        String sql = "select pc from Plato_Completo pc join pc.idcatalogo c join c.idtipoproduc tp where tp.idtipoproducto=?1";
        List<Plato_Completo> lista = new LinkedList<>();
        try {
            Query q = em.createQuery(sql);
            q.setParameter(1, idTipoProducto);
            lista = q.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return lista;
        }
        return lista;
    }
}
