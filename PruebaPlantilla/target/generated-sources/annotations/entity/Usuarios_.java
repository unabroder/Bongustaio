package entity;

import entity.Roles;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-21T11:03:37")
@StaticMetamodel(Usuarios.class)
public class Usuarios_ { 

    public static volatile SingularAttribute<Usuarios, String> clave;
    public static volatile SingularAttribute<Usuarios, String> usuario;
    public static volatile SingularAttribute<Usuarios, Roles> idtipo;
    public static volatile SingularAttribute<Usuarios, Integer> idusuario;
    public static volatile SingularAttribute<Usuarios, Integer> Estado;

}