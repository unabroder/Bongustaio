/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author claudia.santosusam
 */
@Named(value = "producto_proveedor")
@SessionScoped
public class ProductoProveedor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idprod_prov;

    @JoinColumn(name = "id_proveedor", referencedColumnName = "idproveedor")
    @ManyToOne
    private Proveedor idproveedor;

    @JoinColumn(name = "id_sucursal", referencedColumnName = "idsucursal")
    @ManyToOne
    private Sucursal idsucursal;

    @JoinColumn(name = "id_producto", referencedColumnName = "idproducto")
    @ManyToOne
    private Producto idproducto;
    
    @Column(name = "estado")
    private int estado=1;

    public int getIdprod_prov() {
        return idprod_prov;
    }

    public void setIdprod_prov(int idprod_prov) {
        this.idprod_prov = idprod_prov;
    }

    public Proveedor getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(Proveedor idproveedor) {
        this.idproveedor = idproveedor;
    }

    public Sucursal getIdsucursal() {
        return idsucursal;
    }

    public void setIdsucursal(Sucursal idsucursal) {
        this.idsucursal = idsucursal;
    }

    public Producto getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Producto idproducto) {
        this.idproducto = idproducto;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + this.idprod_prov;
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
        final ProductoProveedor other = (ProductoProveedor) obj;
        if (this.idprod_prov != other.idprod_prov) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductoProveedor{" + "idprod_prov=" + idprod_prov + '}';
    }
    
    
    
}
