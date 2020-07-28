package ec.edu.ups.entidad;

import java.io.Serializable;
import java.sql.Date;

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
	private Date fecha;
	@ManyToOne
	@JoinColumn
	private Paciente paciente;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "cita")
	private SignosVitales signos;

	public CitaMedica() {
		super();
	}
	

	public CitaMedica(String descripcion, Paciente paciente) {
		super();
		this.descripcion = descripcion;
		this.paciente = paciente;
	}
	
	
	
	public CitaMedica(String descripcion, Date fecha, Paciente paciente) {
		super();
		this.descripcion = descripcion;
		this.fecha = fecha;
		this.paciente = paciente;
	}


	public CitaMedica(String descripcion, Paciente paciente, SignosVitales signos) {
		super();
		this.descripcion = descripcion;
		this.paciente = paciente;
		this.signos = signos;
	}


	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
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
		return "CitaMedica [codigo=" + codigo + ", descripcion=" + descripcion + ", fecha=" + fecha + ", paciente="
				+ paciente + ", signos=" + signos + "]";
	}
	
   
}