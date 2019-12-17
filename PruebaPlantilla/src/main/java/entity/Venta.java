
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
    private Decimal
    
}
