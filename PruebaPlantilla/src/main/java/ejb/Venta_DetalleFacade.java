package ejb;

import entity.Venta;
import entity.Venta_Detalle;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class Venta_DetalleFacade extends AbstractFacade<Venta_Detalle> implements Venta_DetalleFacadeLocal {

    @PersistenceContext(unitName = "bongustaio")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Venta_DetalleFacade() {
        super(Venta_Detalle.class);
    }

    public List<Venta_Detalle> consultaEstado(int estado) {
        String sql = "SELECT vd FROM venta_detalle where vd.estado =1";

        List<Venta_Detalle> lista = new LinkedList<>();
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

   

    

}
