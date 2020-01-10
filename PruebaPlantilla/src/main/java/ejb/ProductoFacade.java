/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Producto;
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
public class ProductoFacade extends AbstractFacade<Producto> implements ProductoFacadeLocal {

    @PersistenceContext(unitName = "bongustaio")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductoFacade() {
        super(Producto.class);
    }
    
    @Override
    public List<Producto> Buscar(Producto pro){
        List<Producto> lista= new LinkedList<>();
        String sql;
        try {
            String n = pro.getNombre();
            sql ="SELECT p FROM Producto p where nombre like '%"+n+"%'";
             Query query = em.createQuery(sql);
             
             query.setParameter(1, pro.getNombre());
             lista= query.getResultList();
             if (!lista.isEmpty()) {
                lista.get(0);
            }
            
        } catch (Exception e) {
            throw e;
            
        }
        System.out.println(lista);
        return lista;
        
    }
}
