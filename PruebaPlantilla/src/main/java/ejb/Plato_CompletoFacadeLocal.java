
package ejb;

import entity.Plato_Completo;
import java.util.List;
import javax.ejb.Local;

@Local
public interface Plato_CompletoFacadeLocal {
    
    void create(Plato_Completo pcompleto);
    
    void edit(Plato_Completo pcompleto);
    
    void remove(Plato_Completo pcompleto);
    
    Plato_Completo find(Object id);
    
    List<Plato_Completo> findAll();
    
    List<Plato_Completo> findRange(int[] range);
    
    int count();
    
<<<<<<< HEAD
    List<Plato_Completo> obtenerPlatoCompletoPorTipoProducto(int idTipoProducto); 
=======
    List<Plato_Completo> obtenerPlatoCompletoPorTipoProducto(int idTipoProducto);
    
    List<Plato_Completo> platoPrecio(Plato_Completo pp);
>>>>>>> 2452322cca5c236ae20a9fbe316e7e584816dca8
}
