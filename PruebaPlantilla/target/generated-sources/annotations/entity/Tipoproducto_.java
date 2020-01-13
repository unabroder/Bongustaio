package entity;

import entity.Tiposucursal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-13T16:43:15")
@StaticMetamodel(Tipoproducto.class)
public class Tipoproducto_ { 

    public static volatile SingularAttribute<Tipoproducto, Integer> estado;
    public static volatile SingularAttribute<Tipoproducto, Integer> idtipoproducto;
    public static volatile SingularAttribute<Tipoproducto, Tiposucursal> idtiposucursal;
    public static volatile SingularAttribute<Tipoproducto, String> nombre;

}