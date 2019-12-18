
package entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="especialidad")
public class Especialidad implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idespecialidad;
    
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="estado")
    private int estado;
    
    
    
    
    
    
    
    
}
