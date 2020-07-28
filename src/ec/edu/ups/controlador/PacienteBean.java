package ec.edu.ups.controlador;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.edu.ups.ejb.CitaMedicaFacade;
import ec.edu.ups.ejb.PacienteFacade;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@ApplicationScoped
public class PacienteBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@EJB
	private PacienteFacade ejbPacienteFacade;
	@EJB
	private CitaMedicaFacade ejbCitaMedicaFacade;
	
}