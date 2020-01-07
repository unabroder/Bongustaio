package entity;

import entity.Sucursal;
import entity.TipoEmpleado;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-07T14:08:34")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-07T15:36:00")
>>>>>>> d3472d356742f83891f5ca5ef8ae6df5530b26f4
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