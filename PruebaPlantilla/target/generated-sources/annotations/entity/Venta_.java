package entity;

import entity.Empleado;
import java.util.Date;
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
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile SingularAttribute<Venta, Integer> idventa;
    public static volatile SingularAttribute<Venta, Date> fecha;
    public static volatile SingularAttribute<Venta, Double> total;
    public static volatile SingularAttribute<Venta, Integer> estado;
    public static volatile SingularAttribute<Venta, Double> subtotal;
    public static volatile SingularAttribute<Venta, Empleado> idempleado;

}