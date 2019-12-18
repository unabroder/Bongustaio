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

@Stateless
public class TipoproductoFacade extends AbstractFacade<Tipoproducto> implements TipoproductoFacadeLocal {

    @PersistenceContext(unitName = "bongustaio")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoproductoFacade(){
    super(Tipoproducto.class);
    }

    @Override
    public List<Tipoproducto> findActivos() {
        Tipoproducto tipo=null;
        String sql;
        try {
            sql="SELECT x FROM tipoproducto x where x.estado=1";
            
        } catch (Exception e) {
        }
    }

 

}
