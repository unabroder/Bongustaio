package entity;

import entity.Sucursal;
import entity.TipoEmpleado;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-10T10:37:33")
=======
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-10T09:32:02")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-10T09:46:07")
>>>>>>> c4c6662ed6c79181cf2688c418066586d71248e8
>>>>>>> aab80b2ff07c343ecf032a483272a29376802b0d
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