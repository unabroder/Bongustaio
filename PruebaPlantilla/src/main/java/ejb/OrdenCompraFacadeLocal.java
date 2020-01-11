/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.OrdenCompra;
<<<<<<< HEAD
import entity.Venta;
=======
>>>>>>> f4ed72f6a08a7d39008a39a42b901b3721ba8551
import java.util.Date;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author josue.vasquezusam
 */
@Local
public interface OrdenCompraFacadeLocal {

    void create(OrdenCompra ordenCompra);

    void edit(OrdenCompra ordenCompra);

    void remove(OrdenCompra ordenCompra);

    OrdenCompra find(Object id);

    List<OrdenCompra> findAll();

    List<OrdenCompra> findRange(int[] range);

    int count();
<<<<<<< HEAD
 
    public List<OrdenCompra> consultarOrden(Date date1, Date date2);
=======
   
    
>>>>>>> f4ed72f6a08a7d39008a39a42b901b3721ba8551
}
