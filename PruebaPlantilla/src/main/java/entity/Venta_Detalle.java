
package entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="venta_detalle")
public class Venta_Detalle implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idventa_detalle;
    
    @ManyToOne
    @JoinColumn(name="idventa", referencedColumnName = "idventa")
    private int idventa;
    
    @ManyToOne
    @JoinColumn(name="idcatologo", referencedColumnName = "idcatologo")
    private int idcatologo;
    
    @Column(name="cantidad")
    private int cantidad;
    
    @Column(name="estado")
    private int estado;
    
//  ======================================================================================================================= 
//  =======================================================================================================================
    public int getIdventa_detalle() {
        return idventa_detalle;
    }

    public void setIdventa_detalle(int idventa_detalle) {
        this.idventa_detalle = idventa_detalle;
    }

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public int getIdcatologo() {
        return idcatologo;
    }

    public void setIdcatologo(int idcatologo) {
        this.idcatologo = idcatologo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
//  =======================================================================================================================
//  =======================================================================================================================

    @Override
    public String toString() {
        return "Venta_Detalle{" + "idventa_detalle=" + idventa_detalle + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.idventa_detalle;
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
        final Venta_Detalle other = (Venta_Detalle) obj;
        if (this.idventa_detalle != other.idventa_detalle) {
            return false;
        }
        return true;
    }

    
    
    
}
