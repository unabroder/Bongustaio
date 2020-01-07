package entity;

import entity.Usuarios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-07T11:44:52")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-07T13:27:50")
>>>>>>> 6fc820610add1e897df34a1384f0abf439f38469
@StaticMetamodel(Bitacora.class)
public class Bitacora_ { 

    public static volatile SingularAttribute<Bitacora, String> accion;
    public static volatile SingularAttribute<Bitacora, Date> fecha;
    public static volatile SingularAttribute<Bitacora, Integer> estado;
    public static volatile SingularAttribute<Bitacora, Integer> idbitacora;
    public static volatile SingularAttribute<Bitacora, Usuarios> usuario;

}