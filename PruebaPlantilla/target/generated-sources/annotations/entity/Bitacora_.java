package entity;

import entity.Usuarios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-18T14:01:38")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-18T15:30:04")
>>>>>>> 8e77e18ca5acd9c41ed761bfd6cef9c3843f767f
@StaticMetamodel(Bitacora.class)
public class Bitacora_ { 

    public static volatile SingularAttribute<Bitacora, String> accion;
    public static volatile SingularAttribute<Bitacora, Date> fecha;
    public static volatile SingularAttribute<Bitacora, Integer> estado;
    public static volatile SingularAttribute<Bitacora, Integer> idbitacora;
<<<<<<< HEAD
    public static volatile SingularAttribute<Bitacora, String> usuario;
=======
    public static volatile SingularAttribute<Bitacora, Usuarios> usuario;
>>>>>>> 8e77e18ca5acd9c41ed761bfd6cef9c3843f767f

}