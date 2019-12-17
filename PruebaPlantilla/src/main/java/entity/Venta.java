
package entity;

import java.io.Serializable;
import java.text.DecimalFormat;
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
@Table(name="venta")
public class Venta implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idventa;
    
    @ManyToOne
    @JoinColumn(name="idempleado", referencedColumnName = "idempleado")
    private Empleado idempleado;
    
    @ManyToOne
    @JoinColumn(name="idmenu", referencedColumnName = "idmenu")
    private Menu idmenu;
    
    @Temporal(TemporalType.DATE)
    @Column(name="fecha")
    private Date fecha=new Date();
    
    @Column(name="subtotal")
    private DecimalFormat subtotal;
    
    @Column(name="total")
    private DecimalFormat total;
    
    @Column(name="estado")
    private int estado;

//  =======================================================================================================================
//  =======================================================================================================================
    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public Empleado getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(Empleado idempleado) {
        this.idempleado = idempleado;
    }

    public Menu getIdmenu() {
        return idmenu;
    }

    public void setIdmenu(Menu idmenu) {
        this.idmenu = idmenu;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public DecimalFormat getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(DecimalFormat subtotal) {
        this.subtotal = subtotal;
    }

    public DecimalFormat getTotal() {
        return total;
    }

    public void setTotal(DecimalFormat total) {
        this.total = total;
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
        return "Venta{" + "idventa=" + idventa + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + this.idventa;
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
        final Venta other = (Venta) obj;
        if (this.idventa != other.idventa) {
            return false;
        }
        return true;
    }
    
    
    
}
