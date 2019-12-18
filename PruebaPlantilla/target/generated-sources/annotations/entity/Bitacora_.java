package entity;

import entity.Usuarios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-18T14:35:37")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-18T15:30:04")
>>>>>>> 834b7e889e6e5267a489ea9c45e1f676672f23b2
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
>>>>>>> 834b7e889e6e5267a489ea9c45e1f676672f23b2

}