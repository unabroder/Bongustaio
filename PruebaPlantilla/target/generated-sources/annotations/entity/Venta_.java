package entity;

import entity.Empleado;
import entity.VentaDetalleComplemento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-08T11:35:12")
=======
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-08T11:45:14")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-08T10:38:07")
>>>>>>> c4c91e415bf0eee1c73ab9ab7acdab179450e70c
>>>>>>> dc6bd176e326032359faf4b5e52280cc035ad75a
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