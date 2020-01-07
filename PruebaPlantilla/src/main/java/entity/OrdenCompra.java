
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orden_compra")
public class OrdenCompra implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idorden_compra")
    private int idorden_compra;
    
    @Column(name = "idproveedor")
    private int idproveedor;
    
    @Column(name = "idproducto")
    private int idproducto;
    
    @Column(name = "cantidad")
    private int cantidad;
    private Date fecha;
}
