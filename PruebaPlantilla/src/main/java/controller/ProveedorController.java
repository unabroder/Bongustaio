package controller;

import ejb.ProveedorFacadeLocal;
import entity.Proveedor;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author joqtan.marmolusam
 */
@Named(value = "ProveedorController")
@SessionScoped
public class ProveedorController implements Serializable{
    
    @EJB
    private ProveedorFacadeLocal proveedorEJB;
    private Proveedor proveedor;
    private List<Proveedor> listaProveedor;
    
    public Proveedor getProveedor(){
        return proveedor;
    }
    
    public void setProveedor(Proveedor proveedor){
        this.proveedor = proveedor;
    }
    
    public List<Proveedor> getListaProveedor(){
        listaProveedor = proveedorEJB.findAll();
        return listaProveedor;
    }
    
    public void setListaProveedor(List<Proveedor> listaProveedor){
        this.listaProveedor = listaProveedor;
    }
    
    @PostConstruct
    public void init(){
        proveedor = new Proveedor();
    }
}
