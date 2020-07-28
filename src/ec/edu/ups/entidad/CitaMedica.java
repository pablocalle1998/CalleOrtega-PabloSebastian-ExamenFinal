package ec.edu.ups.entidad;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: CitaMedica
 *
 */
@Entity

public class CitaMedica implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String descripcion;
	@ManyToOne
	@JoinColumn
	private Paciente paciente;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "cita")
	private SignosVitales signos;

	public CitaMedica() {
		super();
	}
	

	public CitaMedica(int codigo, String descripcion, Paciente paciente, SignosVitales signos) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.paciente = paciente;
		this.signos = signos;
	}





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CitaMedica other = (CitaMedica) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}



	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public Paciente getPaciente() {
		return paciente;
	}



	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}



	public SignosVitales getSignos() {
		return signos;
	}



	public void setSignos(SignosVitales signos) {
		this.signos = signos;
	}



	@Override
	public String toString() {
		return "CitaMedica [codigo=" + codigo + ", descripcion=" + descripcion + ", paciente=" + paciente + ", signos="
				+ signos + "]";
	}
	
	
   
}