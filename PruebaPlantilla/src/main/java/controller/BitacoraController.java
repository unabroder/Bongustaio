
package controller;

import ejb.BitacoraFacadeLocal;
import entity.Bitacora;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "bitacoraController")
@SessionScoped
public class BitacoraController  implements Serializable {
    
    
    @EJB
    private BitacoraFacadeLocal bitacoraEJB;
    private Bitacora bitacora;
    private List<Bitacora> listabitacora;
    
   
    
    
    
    
}
