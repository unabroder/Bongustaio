/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.PlatoCompleto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author joqtan.marmolusam
 */
@Local
public interface PlatoCompletoFacadeLocal {
    void create(PlatoCompleto platoCompleto);
    void edit(PlatoCompleto platoCompleto);
    void remove(PlatoCompleto platoCompleto);
    PlatoCompleto find(Object id);
    List<PlatoCompleto> findAll();
    List<PlatoCompleto> findRange(int[] range);
    int count();
}
