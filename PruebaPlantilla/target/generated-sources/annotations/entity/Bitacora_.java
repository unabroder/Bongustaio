package entity;

import entity.Usuarios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-07T14:08:34")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-07T15:36:00")
>>>>>>> d3472d356742f83891f5ca5ef8ae6df5530b26f4
@StaticMetamodel(Bitacora.class)
public class Bitacora_ { 

    public static volatile SingularAttribute<Bitacora, String> accion;
    public static volatile SingularAttribute<Bitacora, Date> fecha;
    public static volatile SingularAttribute<Bitacora, Integer> estado;
    public static volatile SingularAttribute<Bitacora, Integer> idbitacora;
    public static volatile SingularAttribute<Bitacora, Usuarios> usuario;

}