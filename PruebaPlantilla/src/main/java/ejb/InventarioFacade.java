/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Inventario;

import entity.Producto;




import java.util.Date;

import java.util.LinkedList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


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
 
  


    public List<Inventario> consultarInvenByNombre(Producto id){

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
    

}
