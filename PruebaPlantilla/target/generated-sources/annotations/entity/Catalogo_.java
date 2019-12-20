package entity;

import entity.Tipoproducto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-20T13:23:54")
@StaticMetamodel(Catalogo.class)
public class Catalogo_ { 

    public static volatile SingularAttribute<Catalogo, Double> preciounit;
    public static volatile SingularAttribute<Catalogo, Integer> idcatalogo;
    public static volatile SingularAttribute<Catalogo, Integer> cantidad;
    public static volatile SingularAttribute<Catalogo, String> nombre;
    public static volatile SingularAttribute<Catalogo, Tipoproducto> idtipoproduc;

}