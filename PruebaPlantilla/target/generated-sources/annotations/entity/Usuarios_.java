package entity;

import entity.Empleado;
import entity.Roles;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-09T11:37:33")
=======
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-09T11:32:19")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-09T14:44:10")
>>>>>>> 666ae4cb0f8a79a0675b386bf6414e6d813983bf
>>>>>>> 2f88033648ba47d4dfc40f096d37cdcaa4c3bdcd
@StaticMetamodel(Usuarios.class)
public class Usuarios_ { 

    public static volatile SingularAttribute<Usuarios, String> clave;
    public static volatile SingularAttribute<Usuarios, String> usuario;
    public static volatile SingularAttribute<Usuarios, Roles> idtipo;
    public static volatile SingularAttribute<Usuarios, Empleado> idempleado;
    public static volatile SingularAttribute<Usuarios, Integer> idusuario;
    public static volatile SingularAttribute<Usuarios, Integer> Estado;

}