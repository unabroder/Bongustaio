/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Inventario;
import entity.Producto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author josue.vasquezusam
 */
@Local
public interface InventarioFacadeLocal {

    void create(Inventario inventario);

    void edit(Inventario inventario);

    void remove(Inventario inventario);

    Inventario find(Object id);

    List<Inventario> findAll();

    List<Inventario> findRange(int[] range);

    int count();
<<<<<<< HEAD
    
    public List<Inventario> consultarInvenByNombre(Producto id);
=======

 
    public List<Inventario> consultarVenta(Date date1, Date date2);
<<<<<<< HEAD

    public List<Inventario> consultarInven(Date date1, Date date2);
>>>>>>> 31c12ab20074e6ac100a06c44a9a3918b8c78e6f
    

=======
    
>>>>>>> 1ea69ceea18d17b6ddd0fc4392d76bb84fa98f51
}
