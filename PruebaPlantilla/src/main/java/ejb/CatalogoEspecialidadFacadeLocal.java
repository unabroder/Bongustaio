/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.CatalogoEspecialidad;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author joqtan.marmolusam
 */
@Local
public interface CatalogoEspecialidadFacadeLocal {
    void create(CatalogoEspecialidad catalogoEspecialidad);
    void edit(CatalogoEspecialidad catalogoEspecialidad);
    void remove(CatalogoEspecialidad catalogoEspecialidad);
    CatalogoEspecialidad find(Object id);
    List<CatalogoEspecialidad> findAll();
    List<CatalogoEspecialidad> findRange(int[] range);
    int count();
}
