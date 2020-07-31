package ec.edu.ups.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.entidad.SignosVitales;
import ec.edu.ups.entidad.Sintomas;

@Stateless
public class SintomasFacade extends AbstractFacade<Sintomas> {
	@PersistenceContext(unitName = "Examen")
	private EntityManager em;
	
	public SintomasFacade() {
		super(Sintomas.class);
	}
	
	@Override
    protected EntityManager getEntityManager() {
        return em;
    }
	

}
