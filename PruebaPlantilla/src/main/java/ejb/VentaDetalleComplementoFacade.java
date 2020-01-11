/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.VentaDetalleComplemento;
import java.util.LinkedList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author claudia.santosusam
 */
@Stateless
public class VentaDetalleComplementoFacade extends AbstractFacade<VentaDetalleComplemento> implements VentaDetalleComplementoFacadeLocal {
    
    @PersistenceContext(unitName = "bongustaio")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {

        return em;
    }

    public VentaDetalleComplementoFacade() {

        super(VentaDetalleComplemento.class);
    }
    
    public List<VentaDetalleComplemento> consultaEstado(int estado){
            String sql="SELECT vdc FROM ventaDetalle_complemento where vdc.estado=1";
            
            List<VentaDetalleComplemento> lista=new LinkedList<>();
            try {
                Query q= em.createQuery(sql);
                q.setParameter(1, estado);
                lista=q.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return lista;
        }
            return lista;
    }
    
    
}
