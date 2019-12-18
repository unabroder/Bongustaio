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
@Table(name = "inventario")
public class Inventario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idinventario")
    private int idinventario;

    @ManyToOne
    @JoinColumn(name = "idprod_prov", referencedColumnName = "producto_producto")
<<<<<<< HEAD
   // private ProductoProveedor idprod_prov;
    
=======
    //private ProductoProveedor idprod_prov;

>>>>>>> 834b7e889e6e5267a489ea9c45e1f676672f23b2
    @Column(name = "cant_entrada")
    private int cant_entrada;

    @Column(name = "cant_disponible")
    private int cant_disponible;

    @Column(name = "estado")
    private int estado;

    public Inventario() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.idinventario;
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
        final Inventario other = (Inventario) obj;
        if (this.idinventario != other.idinventario) {
            return false;
        }
        return true;
    }

    public int getIdinventario() {
        return idinventario;
    }

    public void setIdinventario(int idinventario) {
        this.idinventario = idinventario;
    }

<<<<<<< HEAD
 /*   public ProductoProveedor getIdprod_prov() {
=======
    /* public ProductoProveedor getIdprod_prov() {
>>>>>>> 834b7e889e6e5267a489ea9c45e1f676672f23b2
        return idprod_prov;
    }

    public void setIdprod_prov(ProductoProveedor idprod_prov) {
        this.idprod_prov = idprod_prov;
<<<<<<< HEAD
    }  */

=======
    }*/
>>>>>>> 834b7e889e6e5267a489ea9c45e1f676672f23b2
    public int getCant_entrada() {
        return cant_entrada;
    }

    public void setCant_entrada(int cant_entrada) {
        this.cant_entrada = cant_entrada;
    }

    public int getCant_disponible() {
        return cant_disponible;
    }

    public void setCant_disponible(int cant_disponible) {
        this.cant_disponible = cant_disponible;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

<<<<<<< HEAD
/*
=======
>>>>>>> 834b7e889e6e5267a489ea9c45e1f676672f23b2
    @Override
    public String toString() {
        return "Inventario{" + "idinventario=" + idinventario + ", cant_entrada=" + cant_entrada + ", cant_disponible=" + cant_disponible + ", estado=" + estado + '}';
    }
<<<<<<< HEAD
    
    */
    
=======
>>>>>>> 834b7e889e6e5267a489ea9c45e1f676672f23b2

}
