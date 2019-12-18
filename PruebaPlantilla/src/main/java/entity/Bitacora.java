
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name ="bitacora")
public class Bitacora implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idbitacora;
    
    @Temporal(TemporalType.DATE)
    @Column( name ="fecha")
    private Date fecha;
    
    @ManyToOne
    @JoinColumn(name="usuario", referencedColumnName = "idusuario" ) 
    private Usuarios usuario;
    
    @Column( name = "accion")
    private String accion;
<<<<<<< HEAD
   
    @Column(name="estado")
    private int estado=1;
=======
    
    @Column( name = "estado")
    private int estado =1;
>>>>>>> 8e77e18ca5acd9c41ed761bfd6cef9c3843f767f

    public int getIdbitacora() {
        return idbitacora;
    }

    public void setIdbitacora(int idbitacora) {
        this.idbitacora = idbitacora;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

<<<<<<< HEAD
    public int  getEstado() {
=======
    public int getEstado() {
>>>>>>> 8e77e18ca5acd9c41ed761bfd6cef9c3843f767f
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.idbitacora;
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
        final Bitacora other = (Bitacora) obj;
        if (this.idbitacora != other.idbitacora) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bitacora{" + "idbitacora=" + idbitacora + '}';
    }
    
    
    
}
