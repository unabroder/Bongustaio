/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Especialidad;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
<<<<<<< HEAD
 * @author claudia.santosusam
 */

public class EspecialidadFacade extends AbstractFacade<Especialidad> implements EspecialidadFacadeLocal {
    
   @PersistenceContext(unitName = "bongustaio")
=======
 * @author josue.vasquezusam
 */
@Stateless
public class EspecialidadFacade extends AbstractFacade<Especialidad> implements EspecialidadFacadeLocal {

    @PersistenceContext(unitName = "bongustaio")
>>>>>>> 5217dee804590ed8bdceda5231868ff3fbf5bc28
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
<<<<<<< HEAD
    
=======

>>>>>>> 5217dee804590ed8bdceda5231868ff3fbf5bc28
    public EspecialidadFacade() {
        super(Especialidad.class);
    }
    
<<<<<<< HEAD
    
=======
>>>>>>> 5217dee804590ed8bdceda5231868ff3fbf5bc28
}
