/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Inventario;

import java.util.Date;
import java.util.LinkedList;
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
public class InventarioFacade extends AbstractFacade<Inventario> implements InventarioFacadeLocal {

    @PersistenceContext(unitName = "bongustaio")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public InventarioFacade() {
        super(Inventario.class);
    }
 
    public List<Inventario> consultarVenta(Date date1, Date date2){
    List<Inventario> lista=new LinkedList<>();
            try {
            if (date1 != null && date2 != null) {
                String sql = "Select x from Inventario x where x.estado between ?0 and ?1";
                Query q = em.createQuery(sql);
                q.setParameter(1, date1);
                q.setParameter(2, date2);
                lista = q.getResultList();
                
            } else {
            }
                return lista;
        } catch (Exception e) {
            
            String sql = "Select x from Inventario v";
            Query q = em.createQuery(sql);
            lista = q.getResultList();
            e.printStackTrace();
            
            return lista;
        }
        
    }
    public List<Inventario> consultarInven(Date date1, Date date2){
        List<Inventario> lista=new LinkedList<>();
        try {
            if (date1!=null && date2!=null) {
                
                String sql="SELECT x FROM Inventario x WHERE x.fecha BETWEEN ?1 AND ?2";
                Query q= em.createQuery(sql);
                q.setParameter(1, date1);
                q.setParameter(2, date2);
                lista=q.getResultList();
                
            }else{
            
            }
            return lista;
        } catch (Exception e) {
            
            String sql="SELECT  x FROM Inventario x";
            Query q= em.createQuery(sql);
            lista= q.getResultList();
            e.printStackTrace();
            return lista;
        }
    }
    
}
