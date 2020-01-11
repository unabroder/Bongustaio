package entity;

import entity.Empleado;
import entity.VentaDetalleComplemento;
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
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile SingularAttribute<Venta, Integer> idventa;
    public static volatile SingularAttribute<Venta, Date> fecha;
    public static volatile SingularAttribute<Venta, Double> total;
    public static volatile SingularAttribute<Venta, Integer> estado;
    public static volatile SingularAttribute<Venta, Double> subtotal;
    public static volatile SingularAttribute<Venta, VentaDetalleComplemento> idventaDetalle_complemento;
    public static volatile SingularAttribute<Venta, Empleado> idempleado;

}