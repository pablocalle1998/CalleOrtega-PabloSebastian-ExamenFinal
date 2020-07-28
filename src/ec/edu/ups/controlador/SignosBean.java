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
	
	private double freCardiaca;
	private double freResp;
	private double presion;
	private double saturacion;
	private double temperatura;
	
	public SignosBean() {}
	
	@PostConstruct
	public void init() {
		listaCita = ejbCitaMedicaFacade.findAll();
		System.out.println(listaCita);
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

	public double getFreCardiaca() {
		return freCardiaca;
	}

	public void setFreCardiaca(double freCardiaca) {
		this.freCardiaca = freCardiaca;
	}

	public double getFreResp() {
		return freResp;
	}

	public void setFreResp(double freResp) {
		this.freResp = freResp;
	}

	public double getPresion() {
		return presion;
	}

	public void setPresion(double presion) {
		this.presion = presion;
	}

	public double getSaturacion() {
		return saturacion;
	}

	public void setSaturacion(double saturacion) {
		this.saturacion = saturacion;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
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