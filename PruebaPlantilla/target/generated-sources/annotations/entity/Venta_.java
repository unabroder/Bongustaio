package entity;

import entity.Complemento;
import entity.Empleado;
import entity.Plato_Completo;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-14T14:22:29")
=======
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-13T22:46:42")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-13T23:50:05")
>>>>>>> 2452322cca5c236ae20a9fbe316e7e584816dca8
>>>>>>> c87746450ee84774dcc8c2338f7edf272cc5e6e9
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile SingularAttribute<Venta, Integer> idventa;
    public static volatile SingularAttribute<Venta, Date> fecha;
    public static volatile SingularAttribute<Venta, Complemento> idcomplemento;
    public static volatile SingularAttribute<Venta, Double> total;
    public static volatile SingularAttribute<Venta, Integer> estado;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> c87746450ee84774dcc8c2338f7edf272cc5e6e9
    public static volatile SingularAttribute<Venta, Plato_Completo> idplato_completo;
    public static volatile SingularAttribute<Venta, Integer> cantidad;
    public static volatile SingularAttribute<Venta, Empleado> idempleado;
=======
    public static volatile SingularAttribute<Venta, Complemento> complemento;
    public static volatile SingularAttribute<Venta, Empleado> empleado;
    public static volatile SingularAttribute<Venta, Integer> cantidad;
    public static volatile SingularAttribute<Venta, Plato_Completo> platoCompleto;
>>>>>>> 2452322cca5c236ae20a9fbe316e7e584816dca8

}