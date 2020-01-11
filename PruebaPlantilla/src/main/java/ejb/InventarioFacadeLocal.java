/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Inventario;
import java.util.Date;
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
 
    public List<Inventario> consultarVenta(Date date1, Date date2);
=======
    
    public List<Inventario> consultarInven(Date date1, Date date2);
    
>>>>>>> f4ed72f6a08a7d39008a39a42b901b3721ba8551
}
