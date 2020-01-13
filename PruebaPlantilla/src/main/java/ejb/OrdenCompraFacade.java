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
import java.util.LinkedList;
>>>>>>> 1ea69ceea18d17b6ddd0fc4392d76bb84fa98f51
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

=======
>>>>>>> 1ea69ceea18d17b6ddd0fc4392d76bb84fa98f51

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

<<<<<<< HEAD

    
    
    

=======
>>>>>>> 1ea69ceea18d17b6ddd0fc4392d76bb84fa98f51
}
