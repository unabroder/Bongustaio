package entity;

import entity.Empleado;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-20T14:35:13")
=======
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-02T15:34:33")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-02T16:08:14")
>>>>>>> 809258d3ffe002be16830115ca923e2880c1c4c9
>>>>>>> b9fe97107460f0f0a50b49edc7712d8b093634ed
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile SingularAttribute<Venta, Integer> idventa;
    public static volatile SingularAttribute<Venta, Date> fecha;
    public static volatile SingularAttribute<Venta, Double> total;
    public static volatile SingularAttribute<Venta, Integer> estado;
    public static volatile SingularAttribute<Venta, Double> subtotal;
    public static volatile SingularAttribute<Venta, Empleado> idempleado;

}