package entity;

import entity.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-09T11:32:19")
@StaticMetamodel(Inventario.class)
public class Inventario_ { 

    public static volatile SingularAttribute<Inventario, Integer> cant_entrada;
    public static volatile SingularAttribute<Inventario, Integer> estado;
    public static volatile SingularAttribute<Inventario, Integer> idinventario;
    public static volatile SingularAttribute<Inventario, Integer> cant_disponible;
    public static volatile SingularAttribute<Inventario, Producto> idproducto;

}