package entity;

import entity.Producto;
import entity.Proveedor;
import entity.Sucursal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-02T13:36:03")
@StaticMetamodel(ProductoProveedor.class)
public class ProductoProveedor_ { 

    public static volatile SingularAttribute<ProductoProveedor, Proveedor> idproveedor;
    public static volatile SingularAttribute<ProductoProveedor, Integer> estado;
    public static volatile SingularAttribute<ProductoProveedor, Sucursal> idsucursal;
    public static volatile SingularAttribute<ProductoProveedor, Integer> idprod_prov;
    public static volatile SingularAttribute<ProductoProveedor, Producto> idproducto;

}