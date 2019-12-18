package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bitacora")

public class Bitacora implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idbitacora;


    @Column(name = "fecha")
    private Date fecha = new Date();
    
      @Column(name="usuario")
    private String usuario;
    
    @Column(name="accion")
    private String accion;
   
    @Column(name="estado")
    private int estado=1;

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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public int  getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.idbitacora;
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
