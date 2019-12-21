package entity;

import entity.Usuarios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-21T10:41:20")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-21T10:53:11")
>>>>>>> e8c9fb5eb982136be79dc0a40e462c6ba3b7a71e
@StaticMetamodel(Bitacora.class)
public class Bitacora_ { 

    public static volatile SingularAttribute<Bitacora, String> accion;
    public static volatile SingularAttribute<Bitacora, Date> fecha;
    public static volatile SingularAttribute<Bitacora, Integer> estado;
    public static volatile SingularAttribute<Bitacora, Integer> idbitacora;
    public static volatile SingularAttribute<Bitacora, Usuarios> usuario;

}