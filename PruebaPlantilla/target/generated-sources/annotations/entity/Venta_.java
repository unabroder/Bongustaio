package entity;

import entity.Empleado;
import entity.VentaDetalleComplemento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-07T11:44:52")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-07T13:27:50")
>>>>>>> 6fc820610add1e897df34a1384f0abf439f38469
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