
package controller;

import ejb.BitacoraFacadeLocal;
import entity.Bitacora;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
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

    public Bitacora getBitacora() {
        return bitacora;
    }

    public void setBitacora(Bitacora bitacora) {
        this.bitacora = bitacora;
    }

    public List<Bitacora> getListabitacora() {
        return listabitacora;
    }

    public void setListabitacora(List<Bitacora> listabitacora) {
        this.listabitacora = listabitacora;
    }

    @PostConstruct //constructor 
    public void init() {
        bitacora = new Bitacora();
    }
    
    
    
        public void insertar() {      // metodo para inserrtar 
        try {
            bitacoraEJB.create(bitacora);
        } catch (Exception e) {
        }
    }
        public void listar() {      // metodo para inserrtar 
        try {
            listabitacora = bitacoraEJB.findAll();
        } catch (Exception e) {
        }
    }
        
         public void leerid(Bitacora bit) {
        try {
            this.bitacora = bit;
        } catch (Exception e) {
        }
        
    }
         public void modificar() {
        try {
            bitacoraEJB.edit(bitacora);
            listabitacora= bitacoraEJB.findAll();
        } catch (Exception e) {
        }
    }
    public void eliminar(Bitacora bit){
    this.bitacora=bit;
        try {
           bitacoraEJB.remove(bitacora);
           listabitacora=bitacoraEJB.findAll();
        } catch (Exception e) {
        }
}
        
        
    }
    
    
   
    
    
    
    

