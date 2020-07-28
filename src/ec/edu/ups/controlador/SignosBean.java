package ec.edu.ups.controlador;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.edu.ups.ejb.CitaMedicaFacade;
import ec.edu.ups.ejb.SignosVitalesFacade;
import ec.edu.ups.entidad.CitaMedica;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@ApplicationScoped
public class SignosBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@EJB
	private SignosVitalesFacade ejbSignosVitalesFacade;
	@EJB
	private CitaMedicaFacade ejbCitaMedicaFacade;
	
	private int codigoCita;
	private List<CitaMedica> listaCita;
	
	public SignosBean() {}

}