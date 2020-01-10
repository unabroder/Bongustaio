
package ejb;

import entity.Venta;
import entity.Venta_Detalle;
import java.util.Date;
import java.util.List;
import javax.ejb.Local;

@Local
public interface Venta_DetalleFacadeLocal {
    
     void create(Venta_Detalle vdetalle);
    
    void edit(Venta_Detalle vdetalle);
    
    void remove(Venta_Detalle vdetalle);
    
    Venta_Detalle find(Object id);
    
    List<Venta_Detalle> findAll();
    
    List<Venta_Detalle> findRange(int[] range);
    
    int count();
   
}
