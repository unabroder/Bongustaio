/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipoproducto")
public class Tipoproducto implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idtipoproducto;
    
    @Column(name = "tipoproducto", nullable = true)
    private String tipoproducto;
    
    @Column(name = "estado")
    private int estado;

    public int getIdtipoproducto() {
        return idtipoproducto;
    }

    public void setIdtipoproducto(int idtipoproducto) {
        this.idtipoproducto = idtipoproducto;
    }

    public String getTipoproducto() {
        return tipoproducto;
    }

    public void setTipoproducto(String tipoproducto) {
        this.tipoproducto = tipoproducto;
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
        hash = 83 * hash + this.idtipoproducto;
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
        final Tipoproducto other = (Tipoproducto) obj;
        if (this.idtipoproducto != other.idtipoproducto) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tipoproducto{" + "idtipoproducto=" + idtipoproducto + '}';
    }
    
    
}
