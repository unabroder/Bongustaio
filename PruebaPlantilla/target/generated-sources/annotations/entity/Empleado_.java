package entity;

import entity.Sucursal;
import entity.TipoEmpleado;
<<<<<<< HEAD
=======
import entity.Usuarios;
>>>>>>> 834b7e889e6e5267a489ea9c45e1f676672f23b2
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-18T14:35:37")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-18T15:30:04")
>>>>>>> 834b7e889e6e5267a489ea9c45e1f676672f23b2
@StaticMetamodel(Empleado.class)
public class Empleado_ { 

    public static volatile SingularAttribute<Empleado, String> apellidos;
    public static volatile SingularAttribute<Empleado, int> estado;
    public static volatile SingularAttribute<Empleado, TipoEmpleado> idtipoempleado;
    public static volatile SingularAttribute<Empleado, String> correo;
    public static volatile SingularAttribute<Empleado, String> dui;
    public static volatile SingularAttribute<Empleado, Sucursal> idsucursal;
    public static volatile SingularAttribute<Empleado, String> telefono;
    public static volatile SingularAttribute<Empleado, Integer> idempleado;
    public static volatile SingularAttribute<Empleado, String> nombres;
<<<<<<< HEAD
=======
    public static volatile SingularAttribute<Empleado, Usuarios> idusuario;
>>>>>>> 834b7e889e6e5267a489ea9c45e1f676672f23b2

}