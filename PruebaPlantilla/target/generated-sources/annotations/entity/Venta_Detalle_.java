package entity;

import entity.Catalogo;
import entity.Venta;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-18T16:42:12")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-18T16:23:42")
>>>>>>> 77820a0504c7c077b00813c14ec782a8ce8b9c9f
@StaticMetamodel(Venta_Detalle.class)
public class Venta_Detalle_ { 

    public static volatile SingularAttribute<Venta_Detalle, Venta> idventa;
    public static volatile SingularAttribute<Venta_Detalle, Integer> estado;
    public static volatile SingularAttribute<Venta_Detalle, Integer> idventa_detalle;
    public static volatile SingularAttribute<Venta_Detalle, Catalogo> idcatalogo;
    public static volatile SingularAttribute<Venta_Detalle, Integer> cantidad;

}