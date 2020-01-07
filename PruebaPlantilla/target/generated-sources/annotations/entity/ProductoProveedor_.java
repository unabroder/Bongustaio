package entity;

import entity.Producto;
import entity.Proveedor;
import entity.Sucursal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-07T09:29:20")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-06T16:29:59")
>>>>>>> 328645d1e25083079688b013e106caad6e0f63ce
@StaticMetamodel(ProductoProveedor.class)
public class ProductoProveedor_ { 

    public static volatile SingularAttribute<ProductoProveedor, Proveedor> idproveedor;
    public static volatile SingularAttribute<ProductoProveedor, Integer> estado;
    public static volatile SingularAttribute<ProductoProveedor, Sucursal> idsucursal;
    public static volatile SingularAttribute<ProductoProveedor, Integer> idprod_prov;
    public static volatile SingularAttribute<ProductoProveedor, Producto> idproducto;

}