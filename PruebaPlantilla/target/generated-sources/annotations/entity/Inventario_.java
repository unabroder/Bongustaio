package entity;

import entity.ProductoProveedor;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-19T16:12:13")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-19T16:26:29")
>>>>>>> 5217dee804590ed8bdceda5231868ff3fbf5bc28
@StaticMetamodel(Inventario.class)
public class Inventario_ { 

    public static volatile SingularAttribute<Inventario, Integer> cant_entrada;
    public static volatile SingularAttribute<Inventario, Integer> estado;
    public static volatile SingularAttribute<Inventario, Integer> idinventario;
    public static volatile SingularAttribute<Inventario, Integer> cant_disponible;
    public static volatile SingularAttribute<Inventario, ProductoProveedor> idprod_prov;

}