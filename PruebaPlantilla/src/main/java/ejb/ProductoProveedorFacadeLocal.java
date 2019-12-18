/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.ProductoProveedor;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author claudia.santosusam
 */
@Local
public interface ProductoProveedorFacadeLocal {
    
    void create(ProductoProveedor productoproveedor);
    
    void edit  (ProductoProveedor productoproveedor);
    
    void remove(ProductoProveedor productoproveedor);
    
    ProductoProveedor find(Object id);
    
    List<ProductoProveedor> findAll();
    
    List<ProductoProveedor> findRange(int[] range);
    
    int count();
    
    
    
}
