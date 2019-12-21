package entity;

import entity.Producto;
import entity.Proveedor;
import entity.Sucursal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-21T09:38:54")
=======
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-20T14:46:45")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-20T13:31:26")
>>>>>>> 49f98dcae90481da319b3fa86c9f7d6e0638f4ea
>>>>>>> 7882404778a757888167502a14771bf1b4d52e46
@StaticMetamodel(ProductoProveedor.class)
public class ProductoProveedor_ { 

    public static volatile SingularAttribute<ProductoProveedor, Proveedor> idproveedor;
    public static volatile SingularAttribute<ProductoProveedor, Integer> estado;
    public static volatile SingularAttribute<ProductoProveedor, Sucursal> idsucursal;
    public static volatile SingularAttribute<ProductoProveedor, Integer> idprod_prov;
    public static volatile SingularAttribute<ProductoProveedor, Producto> idproducto;

}