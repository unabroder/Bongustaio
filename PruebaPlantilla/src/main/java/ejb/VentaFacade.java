package ejb;

import entity.Venta;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


@Stateless
public class VentaFacade extends AbstractFacade<Venta> implements VentaFacadeLocal {

    @PersistenceContext(unitName = "bongustaio")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
  
    
    
    

    public VentaFacade() {
        super(Venta.class);
    }

    public List<Venta> consultaEstado(int estado) {
        String sql = "SELECT v FROM Venta v where v.estado=1";

        List<Venta> lista = new LinkedList<>();
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

    public List<Venta> consultarVenta(Date date1, Date date2) {

        List<Venta> lista = new LinkedList<>();
        try {
            System.out.println(date1);
            if (date1 != null && date2 != null) {
                System.out.println("###################botones llenos ################");
                String sql = "Select v from Venta v where v.fecha between ?1 and ?2";
                Query q = em.createQuery(sql);
                q.setParameter(1, date1);
                q.setParameter(2, date2);
                lista = q.getResultList();

            } else {

            }

            return lista;

        } catch (Exception e) {

            String sql = "Select v from Venta v";
            Query q = em.createQuery(sql);
            lista = q.getResultList();
            System.out.println("###################botones vacios ################");

            e.printStackTrace();
            System.out.println(date1 + "////" + date2);
            System.out.println("###################error de vista de venta ################" + e);
            return lista;
        }
    }

}
