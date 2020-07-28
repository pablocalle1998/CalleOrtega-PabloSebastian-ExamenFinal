package ec.edu.ups.entidad;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Paciente
 *
 */
@Entity

public class Paciente implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(unique=true)
	private String cedula;
	
	private String nombres;
	private String apellidos;
	
	private int numero;
	private String direccion;
	private String correo;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "paciente")
	private List<CitaMedica> citas;

	public Paciente() {
		super();
	}
	
	

	public Paciente(String nombres, String apellidos, String cedula, int numero, String direccion,
			String correo) {
		super();
		
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.cedula = cedula;
		this.numero = numero;
		this.direccion = direccion;
		this.correo = correo;
	}



	public Paciente(String nombres, String apellidos, String cedula, int numero, String direccion,
			String correo, List<CitaMedica> citas) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.cedula = cedula;
		this.numero = numero;
		this.direccion = direccion;
		this.correo = correo;
		this.citas = citas;
	}




	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public List<CitaMedica> getCitas() {
		return citas;
	}

	public void setCitas(List<CitaMedica> citas) {
		this.citas = citas;
	}

	

	@Override
	public String toString() {
		return "Paciente [cedula=" + cedula + ", nombres=" + nombres + ", apellidos=" + apellidos + ", numero=" + numero
				+ ", direccion=" + direccion + ", correo=" + correo + ", citas=" + citas + "]";
	}

   
}