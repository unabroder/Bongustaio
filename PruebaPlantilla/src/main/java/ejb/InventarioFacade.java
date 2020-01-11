/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Inventario;
<<<<<<< HEAD
import entity.Producto;
=======

<<<<<<< HEAD
import entity.Venta;


=======
>>>>>>> 1ea69ceea18d17b6ddd0fc4392d76bb84fa98f51
import java.util.Date;
>>>>>>> 31c12ab20074e6ac100a06c44a9a3918b8c78e6f
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
<<<<<<< HEAD
    
<<<<<<< HEAD
    public List<Inventario> consultarInvenByNombre(Producto id){
=======

        try {
=======
            try {
>>>>>>> 1ea69ceea18d17b6ddd0fc4392d76bb84fa98f51
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
<<<<<<< HEAD

=======
>>>>>>> 1ea69ceea18d17b6ddd0fc4392d76bb84fa98f51
    public List<Inventario> consultarInven(Date date1, Date date2){
>>>>>>> 31c12ab20074e6ac100a06c44a9a3918b8c78e6f
        List<Inventario> lista=new LinkedList<>();
        System.out.println("entro al metodo");
        try {
           
                System.out.println("antes de consultar la lista");
                String sql="SELECT i FROM Inventario i WHERE i.idproducto=?1";
                
                Query q= em.createQuery(sql);
                 System.out.println("lee la query");
                q.setParameter(1, id);
                System.out.println("despues de consultar la lista");
                lista=q.getResultList();
                
           System.out.println("despues de llenar la lista");
            return lista;
        } catch (Exception e) {
            
          
            e.printStackTrace();
            return lista;
        }
    }
    
<<<<<<< HEAD

=======
>>>>>>> 1ea69ceea18d17b6ddd0fc4392d76bb84fa98f51
}
