package entity;

import entity.Empleado;
import entity.Roles;
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
@StaticMetamodel(Usuarios.class)
public class Usuarios_ { 

    public static volatile SingularAttribute<Usuarios, String> clave;
    public static volatile SingularAttribute<Usuarios, String> usuario;
    public static volatile SingularAttribute<Usuarios, Roles> idtipo;
    public static volatile SingularAttribute<Usuarios, Empleado> idempleado;
    public static volatile SingularAttribute<Usuarios, Integer> idusuario;
    public static volatile SingularAttribute<Usuarios, Integer> Estado;

}