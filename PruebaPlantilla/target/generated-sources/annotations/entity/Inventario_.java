package entity;

import entity.ProductoProveedor;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-18T14:35:37")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-18T15:30:04")
>>>>>>> 834b7e889e6e5267a489ea9c45e1f676672f23b2
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-18T15:44:17")
>>>>>>> 8f83e49ba85a5c5fed3be2cdd85f0f5537b33b86
@StaticMetamodel(Inventario.class)
public class Inventario_ { 

    public static volatile SingularAttribute<Inventario, Integer> cant_entrada;
    public static volatile SingularAttribute<Inventario, Integer> estado;
    public static volatile SingularAttribute<Inventario, Integer> idinventario;
    public static volatile SingularAttribute<Inventario, Integer> cant_disponible;
    public static volatile SingularAttribute<Inventario, ProductoProveedor> idprod_prov;

}