package entity;

import entity.Producto;
import entity.Proveedor;
import entity.Sucursal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-20T10:49:05")
=======
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-20T10:31:46")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-20T09:25:08")
>>>>>>> d74d99cad30f52334f5e3c1b4c9586fdab6f782a
>>>>>>> a53346a7d956554d3e619ff4b236af441eb9202d
@StaticMetamodel(ProductoProveedor.class)
public class ProductoProveedor_ { 

    public static volatile SingularAttribute<ProductoProveedor, Proveedor> idproveedor;
    public static volatile SingularAttribute<ProductoProveedor, Integer> estado;
    public static volatile SingularAttribute<ProductoProveedor, Sucursal> idsucursal;
    public static volatile SingularAttribute<ProductoProveedor, Integer> idprod_prov;
    public static volatile SingularAttribute<ProductoProveedor, Producto> idproducto;

}