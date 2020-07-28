package ec.edu.ups.controlador;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.edu.ups.ejb.CitaMedicaFacade;
import ec.edu.ups.ejb.PacienteFacade;
import ec.edu.ups.ejb.SignosVitalesFacade;
import ec.edu.ups.entidad.CitaMedica;
import ec.edu.ups.entidad.Paciente;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@ApplicationScoped
public class CitaBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@EJB
	private CitaMedicaFacade ejbCitaMedicaFacade;
	@EJB
	private PacienteFacade ejbPacienteFacade;
	@EJB
	private SignosVitalesFacade ejbSignosVitalesFacade;
	
	private List<Paciente> listPaciente;
	
	private String codigoPaciente;
	private String descripcion;
	
	public CitaBean() {}
	
	@PostConstruct
	public void init() {
		System.out.println("listando pacientes");
		listPaciente = ejbPacienteFacade.findAll();
		System.out.println("lisa de pacientes: "+listPaciente);
	}
	
	public String add() {
		Paciente paciente = new Paciente();
		
		paciente = ejbPacienteFacade.find(codigoPaciente);
		System.out.println("paciente recuperado:"+paciente);
		ejbCitaMedicaFacade.create(new CitaMedica(this.descripcion, paciente));
		this.descripcion="";
		this.codigoPaciente="";
		System.out.println("exito");
		
		
		return null;
	}

	public CitaMedicaFacade getEjbCitaMedicaFacade() {
		return ejbCitaMedicaFacade;
	}

	public void setEjbCitaMedicaFacade(CitaMedicaFacade ejbCitaMedicaFacade) {
		this.ejbCitaMedicaFacade = ejbCitaMedicaFacade;
	}

	public PacienteFacade getEjbPacienteFacade() {
		return ejbPacienteFacade;
	}

	public void setEjbPacienteFacade(PacienteFacade ejbPacienteFacade) {
		this.ejbPacienteFacade = ejbPacienteFacade;
	}

	public SignosVitalesFacade getEjbSignosVitalesFacade() {
		return ejbSignosVitalesFacade;
	}

	public void setEjbSignosVitalesFacade(SignosVitalesFacade ejbSignosVitalesFacade) {
		this.ejbSignosVitalesFacade = ejbSignosVitalesFacade;
	}

	public List<Paciente> getListPaciente() {
		return listPaciente;
	}

	public void setListPaciente(List<Paciente> listPaciente) {
		this.listPaciente = listPaciente;
	}

	

	public String getCodigoPaciente() {
		return codigoPaciente;
	}

	public void setCodigoPaciente(String codigoPaciente) {
		this.codigoPaciente = codigoPaciente;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "CitaBean [ejbCitaMedicaFacade=" + ejbCitaMedicaFacade + ", ejbPacienteFacade=" + ejbPacienteFacade
				+ ", ejbSignosVitalesFacade=" + ejbSignosVitalesFacade + ", listPaciente=" + listPaciente
				+ ", codigoPaciente=" + codigoPaciente + ", descripcion=" + descripcion + "]";
	}


}