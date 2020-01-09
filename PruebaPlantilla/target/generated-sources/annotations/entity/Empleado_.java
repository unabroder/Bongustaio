package entity;

import entity.Sucursal;
import entity.TipoEmpleado;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-09T11:42:21")
=======
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-09T11:40:26")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-09T10:40:21")
>>>>>>> 30cb41335a3d2f418532cd99df01219a111f3b2d
>>>>>>> 0ae6656332a4c328b7fd4e342a2ecba1d356f192
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