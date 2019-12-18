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

/**
 *
 * @author josue.vasquezusam
 */
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
<<<<<<< HEAD
        List<Tipoproducto> lista=null;
        String sql;
        try {
<<<<<<< HEAD
            sql = "SELECT x FROM tipoproducto x where x.estado=1";

=======
            sql="SELECT x FROM tipoproducto x WHERE estado=1";
            Query query=em.createQuery(sql);
            lista= query.getResultList();
        } catch (Exception e) {
            throw e;
        }
        return lista;
    }
    
    public void removerEstado(Tipoproducto tipo){
    String sql;
        try {
            sql="UPDATE tipoproducto x SET estado=0 WHERE idtipoproducto=?1";
            Query query=em.createQuery(sql);
            query.setParameter(1, tipo.getIdtipoproducto());
>>>>>>> 4aca22d4fb20d668a3d5640c149296520b847d4a
        } catch (Exception e) {
            throw e;
        }
=======
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
>>>>>>> 8e77e18ca5acd9c41ed761bfd6cef9c3843f767f
    }

  
}
