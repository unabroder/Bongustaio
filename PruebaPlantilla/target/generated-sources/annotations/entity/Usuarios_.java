package entity;

import entity.Empleado;
import entity.Roles;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-11T08:25:59")
=======
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-11T10:46:05")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-11T10:16:53")
>>>>>>> 1ea69ceea18d17b6ddd0fc4392d76bb84fa98f51
>>>>>>> 31c12ab20074e6ac100a06c44a9a3918b8c78e6f
@StaticMetamodel(Usuarios.class)
public class Usuarios_ { 

    public static volatile SingularAttribute<Usuarios, String> clave;
    public static volatile SingularAttribute<Usuarios, String> usuario;
    public static volatile SingularAttribute<Usuarios, Roles> idtipo;
    public static volatile SingularAttribute<Usuarios, Empleado> idempleado;
    public static volatile SingularAttribute<Usuarios, Integer> idusuario;
    public static volatile SingularAttribute<Usuarios, Integer> Estado;

}