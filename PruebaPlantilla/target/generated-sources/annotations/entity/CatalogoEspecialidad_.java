package entity;

import entity.Catalogo;
import entity.Especialidad;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-20T10:37:16")
@StaticMetamodel(CatalogoEspecialidad.class)
public class CatalogoEspecialidad_ { 

    public static volatile SingularAttribute<CatalogoEspecialidad, Integer> estado;
    public static volatile SingularAttribute<CatalogoEspecialidad, Catalogo> idcatalogo;
    public static volatile SingularAttribute<CatalogoEspecialidad, Especialidad> idespecialidad;
    public static volatile SingularAttribute<CatalogoEspecialidad, Integer> id_cat_esp;

}