package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/*

@Entity
@Table(name = "catalogo_especialidad")
public class CatalogoEspecialidad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_cat_esp;
    
    @ManyToOne
    @JoinColumn(name = "idcatalogo", referencedColumnName = "idcatalogo")
    private Catalogo idcatalogo;
    
    @ManyToOne
    @JoinColumn(name = "idespecialidad", referencedColumnName = "idespecialidad")
    private Especialidad idespecialidad;
    
    @Column(name = "estado")
    private int estado;

    public int getId_cat_esp() {
        return id_cat_esp;
    }

    public void setId_cat_esp(int id_cat_esp) {
        this.id_cat_esp = id_cat_esp;
    }

    public Catalogo getIdcatalogo() {
        return idcatalogo;
    }

    public void setIdcatalogo(Catalogo idcatalogo) {
        this.idcatalogo = idcatalogo;
    }

    public Especialidad getIdespecialidad() {
        return idespecialidad;
    }

    public void setIdespecialidad(Especialidad idespecialidad) {
        this.idespecialidad = idespecialidad;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id_cat_esp;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CatalogoEspecialidad other = (CatalogoEspecialidad) obj;
        if (this.id_cat_esp != other.id_cat_esp) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CatalogoEspecialidad{" + "id_cat_esp=" + id_cat_esp + '}';
    }
    
    
}
 */
