package ec.edu.ups.controlador;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.edu.ups.ejb.CitaMedicaFacade;
import ec.edu.ups.ejb.SignosVitalesFacade;
import ec.edu.ups.entidad.CitaMedica;
import ec.edu.ups.entidad.SignosVitales;

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
	
	private String freCardiaca;
	private String freResp;
	private String presion;
	private String saturacion;
	private String temperatura;
	
	public SignosBean() {}
	
	@PostConstruct
	public void init() {
		listaCita = ejbCitaMedicaFacade.findAll();
		System.out.println(listaCita);
	}
	
	
	public String add() {
		
		CitaMedica cita = new CitaMedica();
		cita = ejbCitaMedicaFacade.find(codigoCita);
		System.out.println("cita recuperada:"+cita);
		double frecuenciaCardiaca = Double.parseDouble(this.freCardiaca);
		double frecuenciaRespiratoria = Double.parseDouble(this.freResp);
		double presion  = Double.parseDouble(this.presion);
		double saturacion = Double.parseDouble(this.saturacion);
		double temperatura = Double.parseDouble(this.temperatura);
		
		ejbSignosVitalesFacade.create(new SignosVitales(presion, frecuenciaCardiaca, frecuenciaRespiratoria, temperatura, saturacion, cita));
		System.out.println("registro con exito");
		
		return null;
	}

	public SignosVitalesFacade getEjbSignosVitalesFacade() {
		return ejbSignosVitalesFacade;
	}

	public void setEjbSignosVitalesFacade(SignosVitalesFacade ejbSignosVitalesFacade) {
		this.ejbSignosVitalesFacade = ejbSignosVitalesFacade;
	}

	public CitaMedicaFacade getEjbCitaMedicaFacade() {
		return ejbCitaMedicaFacade;
	}

	public void setEjbCitaMedicaFacade(CitaMedicaFacade ejbCitaMedicaFacade) {
		this.ejbCitaMedicaFacade = ejbCitaMedicaFacade;
	}

	public int getCodigoCita() {
		return codigoCita;
	}

	public void setCodigoCita(int codigoCita) {
		this.codigoCita = codigoCita;
	}

	public List<CitaMedica> getListaCita() {
		return listaCita;
	}

	public void setListaCita(List<CitaMedica> listaCita) {
		this.listaCita = listaCita;
	}


	public String getFreCardiaca() {
		return freCardiaca;
	}

	public void setFreCardiaca(String freCardiaca) {
		this.freCardiaca = freCardiaca;
	}

	public String getFreResp() {
		return freResp;
	}

	public void setFreResp(String freResp) {
		this.freResp = freResp;
	}

	public String getPresion() {
		return presion;
	}

	public void setPresion(String presion) {
		this.presion = presion;
	}

	public String getSaturacion() {
		return saturacion;
	}

	public void setSaturacion(String saturacion) {
		this.saturacion = saturacion;
	}

	public String getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}

	@Override
	public String toString() {
		return "SignosBean [ejbSignosVitalesFacade=" + ejbSignosVitalesFacade + ", ejbCitaMedicaFacade="
				+ ejbCitaMedicaFacade + ", codigoCita=" + codigoCita + ", listaCita=" + listaCita + ", freCardiaca="
				+ freCardiaca + ", freResp=" + freResp + ", presion=" + presion + ", saturacion=" + saturacion
				+ ", temperatura=" + temperatura + "]";
	}
	
	
	
	

}