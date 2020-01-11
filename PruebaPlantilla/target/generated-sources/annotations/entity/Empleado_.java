package entity;

import entity.Sucursal;
import entity.TipoEmpleado;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-10T16:36:48")
=======
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-10T15:39:41")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-10T15:26:33")
>>>>>>> 99fea3139b1bad3b1161181bf3997449b55105a5
>>>>>>> 290fef064a1ce95277fc7cddc464c80e356a38b5
@StaticMetamodel(Empleado.class)
public class Empleado_ { 

    public static volatile SingularAttribute<Empleado, String> apellidos;
    public static volatile SingularAttribute<Empleado, Integer> estado;
    public static volatile SingularAttribute<Empleado, TipoEmpleado> idtipoempleado;
    public static volatile SingularAttribute<Empleado, String> correo;
    public static volatile SingularAttribute<Empleado, String> dui;
    public static volatile SingularAttribute<Empleado, Sucursal> idsucursal;
    public static volatile SingularAttribute<Empleado, String> telefono;
    public static volatile SingularAttribute<Empleado, Integer> idempleado;
    public static volatile SingularAttribute<Empleado, String> nombres;

}