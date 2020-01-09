package entity;

import entity.Usuarios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-09T11:40:26")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-09T10:40:21")
>>>>>>> 30cb41335a3d2f418532cd99df01219a111f3b2d
@StaticMetamodel(Bitacora.class)
public class Bitacora_ { 

    public static volatile SingularAttribute<Bitacora, String> accion;
    public static volatile SingularAttribute<Bitacora, Date> fecha;
    public static volatile SingularAttribute<Bitacora, Integer> estado;
    public static volatile SingularAttribute<Bitacora, Integer> idbitacora;
    public static volatile SingularAttribute<Bitacora, Usuarios> usuario;

}