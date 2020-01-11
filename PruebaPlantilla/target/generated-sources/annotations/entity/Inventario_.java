package entity;

import entity.Producto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-10T16:36:48")
=======
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-10T15:39:40")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-10T15:26:33")
>>>>>>> 99fea3139b1bad3b1161181bf3997449b55105a5
>>>>>>> 290fef064a1ce95277fc7cddc464c80e356a38b5
@StaticMetamodel(Inventario.class)
public class Inventario_ { 

    public static volatile SingularAttribute<Inventario, Integer> cant_entrada;
    public static volatile SingularAttribute<Inventario, Date> fecha;
    public static volatile SingularAttribute<Inventario, Integer> estado;
    public static volatile SingularAttribute<Inventario, Integer> idinventario;
    public static volatile SingularAttribute<Inventario, Integer> cant_disponible;
    public static volatile SingularAttribute<Inventario, Producto> idproducto;

}