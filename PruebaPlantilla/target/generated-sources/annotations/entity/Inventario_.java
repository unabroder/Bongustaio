package entity;

import entity.Producto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-11T08:25:59")
=======
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-11T10:46:05")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-11T10:16:53")
>>>>>>> 1ea69ceea18d17b6ddd0fc4392d76bb84fa98f51
>>>>>>> 31c12ab20074e6ac100a06c44a9a3918b8c78e6f
@StaticMetamodel(Inventario.class)
public class Inventario_ { 

    public static volatile SingularAttribute<Inventario, Integer> cant_entrada;
    public static volatile SingularAttribute<Inventario, Date> fecha;
    public static volatile SingularAttribute<Inventario, Integer> estado;
    public static volatile SingularAttribute<Inventario, Integer> idinventario;
    public static volatile SingularAttribute<Inventario, Integer> cant_disponible;
    public static volatile SingularAttribute<Inventario, Producto> idproducto;

}