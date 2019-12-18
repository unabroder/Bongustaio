package entity;

<<<<<<< HEAD
=======
import entity.Sucursal;
import entity.TipoEmpleado;
<<<<<<< HEAD
=======
import entity.Usuario;
>>>>>>> 886011ffd5753541bfe75d7e3c447521db0e716e
>>>>>>> efb1911fb6bd4ac0694e9b7f60ebc30853844c23
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-18T14:01:38")
=======
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-18T09:28:02")
@StaticMetamodel(Empleado.class)
public class Empleado_ { 

    public static volatile SingularAttribute<Empleado, Integer> idempleado;
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-18T10:41:24")
>>>>>>> efb1911fb6bd4ac0694e9b7f60ebc30853844c23
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
<<<<<<< HEAD
    public static volatile SingularAttribute<Empleado, ? extends Object> idusuario;
=======
    public static volatile SingularAttribute<Empleado, Usuario> idusuario;
>>>>>>> 886011ffd5753541bfe75d7e3c447521db0e716e
>>>>>>> efb1911fb6bd4ac0694e9b7f60ebc30853844c23

}