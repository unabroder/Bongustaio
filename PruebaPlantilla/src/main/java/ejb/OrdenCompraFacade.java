/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.OrdenCompra;
import java.util.Date;
<<<<<<< HEAD
import java.util.LinkedList;
=======
>>>>>>> f4ed72f6a08a7d39008a39a42b901b3721ba8551
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author josue.vasquezusam
 */
@Stateless
public class OrdenCompraFacade extends AbstractFacade<OrdenCompra> implements OrdenCompraFacadeLocal {

    @PersistenceContext(unitName = "bongustaio")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OrdenCompraFacade() {
        super(OrdenCompra.class);
    }
<<<<<<< HEAD

    public List<OrdenCompra> consultarOrden(Date date1, Date date2) {

        List<OrdenCompra> lista = new LinkedList<>();

        try {
            if (date1 != null && date2 != null) {

                String sql = "select v from orden_compra v where v.fecha between ?1 and ?2";
                Query q = em.createQuery(sql);
                q.setParameter(1, date1);
                q.setParameter(2, date2);
                lista = q.getResultList();
            } else {
            }
            return lista;
        } catch (Exception e) {

            String sql = "select v from orden_compra v";
            Query q = em.createQuery(sql);
            lista = q.getResultList();
            e.printStackTrace();
            return lista;
        }

    }

=======
    
    
    
>>>>>>> f4ed72f6a08a7d39008a39a42b901b3721ba8551
}
