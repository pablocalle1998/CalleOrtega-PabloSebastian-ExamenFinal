package ec.edu.ups.controlador;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.edu.ups.ejb.CitaMedicaFacade;
import ec.edu.ups.ejb.PacienteFacade;
import ec.edu.ups.ejb.SignosVitalesFacade;
import ec.edu.ups.ejb.SintomasFacade;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@ApplicationScoped

public class SintomasBean implements Serializable {
	private static final long serialVersionUID = 1L;
	@EJB
	private SintomasFacade ejbSintomasFacade;
	@EJB
	private PacienteFacade ejbPacienteFacade;
	
	private int codigoSintoma;
	private String alergia;
	private String EnfemedadesPrev;
	
	public SintomasBean() {}

	
	@PostConstruct
	
	
	

	public SintomasFacade getEjbSintomasFacade() {
		return ejbSintomasFacade;
	}

	public void setEjbSintomasFacade(SintomasFacade ejbSintomasFacade) {
		this.ejbSintomasFacade = ejbSintomasFacade;
	}

	public PacienteFacade getEjbPacienteFacade() {
		return ejbPacienteFacade;
	}

	public void setEjbPacienteFacade(PacienteFacade ejbPacienteFacade) {
		this.ejbPacienteFacade = ejbPacienteFacade;
	}

	public int getCodigoSintoma() {
		return codigoSintoma;
	}

	public void setCodigoSintoma(int codigoSintoma) {
		this.codigoSintoma = codigoSintoma;
	}

	public String getAlergia() {
		return alergia;
	}

	public void setAlergia(String alergia) {
		this.alergia = alergia;
	}

	public String getEnfemedadesPrev() {
		return EnfemedadesPrev;
	}

	public void setEnfemedadesPrev(String enfemedadesPrev) {
		EnfemedadesPrev = enfemedadesPrev;
	}
	

	@Override
	public String toString() {
		return "SintomasBean [ejbSintomasFacade=" + ejbSintomasFacade + ", ejbPacienteFacade=" + ejbPacienteFacade
				+ ", codigoSintoma=" + codigoSintoma + ", alergia=" + alergia + ", EnfemedadesPrev=" + EnfemedadesPrev
				+ "]";
	}

	
	

}
