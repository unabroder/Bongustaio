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
@Table(name = "menu_del_dia")
public class MenuDelDia implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmenu")
    private int idmenu;
    
    @Column(name = "descuento")
    private double descuento;
    
    @ManyToOne
    @JoinColumn(name = "idventa_detalle", referencedColumnName = "venta_detalle")
    private Venta_Detalle idventa_detalle;
    
    @Column(name = "estado")
    private int estado;
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.idmenu;
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
        final MenuDelDia other = (MenuDelDia) obj;
        if (this.idmenu != other.idmenu) {
            return false;
        }
        return true;
    }

    public MenuDelDia() {
    }

    public int getIdmenu() {
        return idmenu;
    }

    public void setIdmenu(int idmenu) {
        this.idmenu = idmenu;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public Venta_Detalle getIdventa_detalle() {
        return idventa_detalle;
    }

    public void setIdventa_detalle(Venta_Detalle idventa_detalle) {
        this.idventa_detalle = idventa_detalle;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "MenuDelDia{" + "idmenu=" + idmenu + '}';
    }
    
    
    
    
    
    
}
