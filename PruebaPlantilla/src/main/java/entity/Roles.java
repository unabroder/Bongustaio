
package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "roles")
public class Roles {
    
    @Id
    private int idrol;
    private String rol;
    private int estado;
    
}
