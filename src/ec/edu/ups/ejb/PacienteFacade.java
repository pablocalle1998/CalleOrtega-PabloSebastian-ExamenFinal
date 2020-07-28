
package ec.edu.ups.ejb;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.entidad.Paciente;

public class PacienteFacade extends AbstractFacade<Paciente>{
	
	@PersistenceContext(unitName = "Examen")
	 private EntityManager em;
	
	
	public PacienteFacade() {
		super(Paciente.class);
	}
	
	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
}