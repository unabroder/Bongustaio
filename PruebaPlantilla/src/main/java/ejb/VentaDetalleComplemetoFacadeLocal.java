/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.VentaDetalleComplemento;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author claudia.santosusam
 */
@Local
public interface VentaDetalleComplemetoFacadeLocal {

    void create(VentaDetalleComplemento  vdcomplemento);

    void edit(VentaDetalleComplemento  vdcomplemento);

    void remove(VentaDetalleComplemento  vdcomplemento);

    VentaDetalleComplemento find(Object id);

    List<VentaDetalleComplemento> findAll();

    List<VentaDetalleComplemento> findRange(int[] range);

    int count();

}
