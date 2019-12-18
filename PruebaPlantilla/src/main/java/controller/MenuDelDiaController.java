
package controller;

import ejb.MenuDelDiaFacadeLocal;
import entity.MenuDelDia;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;


@Named(value = "menuDelDia")
@SessionScoped
public class MenuDelDiaController implements Serializable {

  
    //Variables
    @EJB
    private MenuDelDiaFacadeLocal menuDelDiaEJB;
    private MenuDelDia menuDelDia;
    private List<MenuDelDia> listaMenuDelDia;
    
    //Constructores
    public MenuDelDiaController() {
    }

    public MenuDelDiaFacadeLocal getMenuDelDiaEJB() {
        return menuDelDiaEJB;
    }

    public void setMenuDelDiaEJB(MenuDelDiaFacadeLocal menuDelDiaEJB) {
        this.menuDelDiaEJB = menuDelDiaEJB;
    }

    public MenuDelDia getMenuDelDia() {
        return menuDelDia;
    }

    public void setMenuDelDia(MenuDelDia menuDelDia) {
        this.menuDelDia = menuDelDia;
    }

    public List<MenuDelDia> getListaMenuDelDia() {
        return listaMenuDelDia;
    }

    public void setListaMenuDelDia(List<MenuDelDia> listaMenuDelDia) {
        this.listaMenuDelDia = listaMenuDelDia;
    }
    
    //PostConstruct
    @PostConstruct
    public void init(){
        menuDelDia = new MenuDelDia();
    }
    
    //metodos 
    public void insertar(){
        try {
            menuDelDiaEJB.create(menuDelDia);
        } catch (Exception e) {
        }
    }
    
    public void obtenerTodos(){
        try {
          listaMenuDelDia = menuDelDiaEJB.findAll();  
        } catch (Exception e) {
        }
        
    }
    
    public void obtenerUno(MenuDelDia menuDD){
        try {
            this.menuDelDia = menuDD;
        } catch (Exception e) {
        }
    }
    
    public void actualizar(){
        try {
            menuDelDiaEJB.edit(menuDelDia);
        } catch (Exception e) {
        }
    }
    
    public void eliminar(){
        try {
            
        } catch (Exception e) {
        }
    }
    
    public void eliminar(MenuDelDia mDD){
        this.menuDelDia = mDD;
        try {
            menuDelDiaEJB.remove(menuDelDia);
            listaMenuDelDia = menuDelDiaEJB.findAll();
        } catch (Exception e) {
        }
       
    
    }
    
}
