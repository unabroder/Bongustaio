package ejb;


import entity.Complemento;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class ComplementoFacade extends AbstractFacade<Complemento> implements ComplementoFacadeLocal {

    @PersistenceContext(unitName = "bongustaio")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }


    public ComplementoFacade() {
        super(Complemento.class);
    }

}
