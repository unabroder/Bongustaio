/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Bitacora;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author roberto.alferesusam
 */
@Stateless
public class BitacoraFacade extends AbstractFacade<Bitacora> implements BitacoraFacadeLocal {

    @PersistenceContext(unitName = "bongustaio")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BitacoraFacade() {
        super(Bitacora.class);
    }

    public List<Bitacora> consultarBita(Date date1, Date date2) {
        List<Bitacora> lista = new LinkedList<>();

        try {
            if (date1 != null && date2 != null) {

                String sql = "Select v from bitacora v where v.fecha between ?1 and ?2";
                Query q = em.createQuery(sql);
                q.setParameter(1, date1);
                q.setParameter(2, date2);
                lista = q.getResultList();
            } else {
            }
            return lista;
        } catch (Exception e) {
            String sql = "Select v from bitacora v";
            Query q = em.createQuery(sql);
            lista = q.getResultList();
            e.printStackTrace();
            return lista;
        }

    }
}
