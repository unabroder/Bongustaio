package entity;

import entity.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-09T08:58:10")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-08T16:48:51")
>>>>>>> 11a849d3eca8309247f4236b22931a23a1d8bb4e
@StaticMetamodel(Inventario.class)
public class Inventario_ { 

    public static volatile SingularAttribute<Inventario, Integer> cant_entrada;
    public static volatile SingularAttribute<Inventario, Integer> estado;
    public static volatile SingularAttribute<Inventario, Integer> idinventario;
    public static volatile SingularAttribute<Inventario, Integer> cant_disponible;
    public static volatile SingularAttribute<Inventario, Producto> idproducto;

}