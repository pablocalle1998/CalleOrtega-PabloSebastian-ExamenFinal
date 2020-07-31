package ec.edu.ups.entidad;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.*;

import com.sun.xml.rpc.processor.modeler.j2ee.xml.string;

/**
 * Entity implementation class for Entity: Sintomas
 *
 */
@Entity

public class Sintomas implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoSintoma;
	private String alergia;
	private String EnfermedadesPrev; 
	
	@ManyToOne
	@JoinColumn
	private Paciente paciente;

	public Sintomas() {
	
	}
	
	
	

	public Sintomas(String alergia, String enfermedadesPrev, Paciente paciente) {
		super();
		this.alergia = alergia;
		EnfermedadesPrev = enfermedadesPrev;
		this.paciente = paciente;
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

	public String getEnfermedadesPrev() {
		return EnfermedadesPrev;
	}

	public void setEnfermedadesPrev(String enfermedadesPrev) {
		EnfermedadesPrev = enfermedadesPrev;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	@Override
	public String toString() {
		return "Sintomas [codigoSintoma=" + codigoSintoma + ", alergia=" + alergia + ", EnfermedadesPrev="
				+ EnfermedadesPrev + ", paciente=" + paciente + "]";
	}
	
	

	
	
	
	
   
}
