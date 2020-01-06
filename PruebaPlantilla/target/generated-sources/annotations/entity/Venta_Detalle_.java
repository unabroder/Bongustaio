package entity;

import entity.Catalogo;
import entity.Venta;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-06T13:22:23")
@StaticMetamodel(Venta_Detalle.class)
public class Venta_Detalle_ { 

    public static volatile SingularAttribute<Venta_Detalle, Venta> idventa;
    public static volatile SingularAttribute<Venta_Detalle, Integer> estado;
    public static volatile SingularAttribute<Venta_Detalle, Integer> idventa_detalle;
    public static volatile SingularAttribute<Venta_Detalle, Catalogo> idcatalogo;
    public static volatile SingularAttribute<Venta_Detalle, Integer> cantidad;

}