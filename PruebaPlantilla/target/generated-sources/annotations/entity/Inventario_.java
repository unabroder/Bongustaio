package entity;

import entity.ProductoProveedor;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-02T15:34:34")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-02T16:08:14")
>>>>>>> 809258d3ffe002be16830115ca923e2880c1c4c9
@StaticMetamodel(Inventario.class)
public class Inventario_ { 

    public static volatile SingularAttribute<Inventario, Integer> cant_entrada;
    public static volatile SingularAttribute<Inventario, Integer> estado;
    public static volatile SingularAttribute<Inventario, Integer> idinventario;
    public static volatile SingularAttribute<Inventario, Integer> cant_disponible;
    public static volatile SingularAttribute<Inventario, ProductoProveedor> idprod_prov;

}