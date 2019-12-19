/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Tipoproducto;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class TipoproductoFacade extends AbstractFacade<Tipoproducto> implements TipoproductoFacadeLocal {

    @PersistenceContext(unitName = "bongustaio")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoproductoFacade() {
        super(Tipoproducto.class);
    }
    
    

    @Override
    public List<Tipoproducto> findActivos() {

        List<Tipoproducto> lista = null;
        String sql;
        try {

            sql = "SELECT x FROM tipoproducto x WHERE estado=1";
            Query query = em.createQuery(sql);
            lista = query.getResultList();
        } catch (Exception e) {
            throw e;
        }
        return lista;
    }

    public void removerEstado(Tipoproducto tipo) {
        String sql;
        try {
            sql = "UPDATE tipoproducto x SET estado=0 WHERE idtipoproducto=?1";
            Query query = em.createQuery(sql);
            query.setParameter(1, tipo.getIdtipoproducto());

        } catch (Exception e) {
            throw e;
        }

    }
 
}
