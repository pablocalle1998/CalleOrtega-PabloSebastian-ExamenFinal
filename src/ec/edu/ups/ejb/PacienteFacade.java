package ec.edu.ups.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.entidad.Paciente;


@Stateless
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
	
	/*public List<Paciente> buscarCitas(){
		Query nq = em.createNativeQuery("SELECT * FROM ")
	}*/
}