package entity;

import entity.Empleado;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-20T14:46:45")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-20T13:31:26")
>>>>>>> 49f98dcae90481da319b3fa86c9f7d6e0638f4ea
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile SingularAttribute<Venta, Integer> idventa;
    public static volatile SingularAttribute<Venta, Date> fecha;
    public static volatile SingularAttribute<Venta, Double> total;
    public static volatile SingularAttribute<Venta, Integer> estado;
    public static volatile SingularAttribute<Venta, Double> subtotal;
    public static volatile SingularAttribute<Venta, Empleado> idempleado;

}