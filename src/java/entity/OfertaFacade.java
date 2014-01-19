/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author familiacetina
 */
@Stateless
public class OfertaFacade extends AbstractFacade<Oferta> {
    @PersistenceContext(unitName = "DataWebPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OfertaFacade() {
        super(Oferta.class);
    }
    
}
