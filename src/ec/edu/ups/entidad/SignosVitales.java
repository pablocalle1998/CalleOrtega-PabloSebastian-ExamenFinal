package ec.edu.ups.entidad;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: SignosVitales
 *
 */
@Entity

public class SignosVitales implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private double presion;
	private double frecuenciaCardiaca;
	private double frecuenciaRespiratoria;
	private double temperatura;
	private double saturacion;
	@OneToOne
	@JoinColumn
	private CitaMedica cita;

	public SignosVitales() {
		super();
	}
	
	
	public SignosVitales(double presion, double frecuenciaCardiaca, double frecuenciaRespiratoria,
			double temperatura, double saturacion, CitaMedica cita) {
		super();
		this.presion = presion;
		this.frecuenciaCardiaca = frecuenciaCardiaca;
		this.frecuenciaRespiratoria = frecuenciaRespiratoria;
		this.temperatura = temperatura;
		this.saturacion = saturacion;
		this.cita = cita;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}





	public double getPresion() {
		return presion;
	}





	public void setPresion(double presion) {
		this.presion = presion;
	}





	public double getFrecuenciaCardiaca() {
		return frecuenciaCardiaca;
	}





	public void setFrecuenciaCardiaca(double frecuenciaCardiaca) {
		this.frecuenciaCardiaca = frecuenciaCardiaca;
	}





	public double getFrecuenciaRespiratoria() {
		return frecuenciaRespiratoria;
	}





	public void setFrecuenciaRespiratoria(double frecuenciaRespiratoria) {
		this.frecuenciaRespiratoria = frecuenciaRespiratoria;
	}





	public double getTemperatura() {
		return temperatura;
	}





	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}





	public double getSaturacion() {
		return saturacion;
	}





	public void setSaturacion(double saturacion) {
		this.saturacion = saturacion;
	}





	public CitaMedica getCita() {
		return cita;
	}





	public void setCita(CitaMedica cita) {
		this.cita = cita;
	}





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cita == null) ? 0 : cita.hashCode());
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
		SignosVitales other = (SignosVitales) obj;
		if (cita == null) {
			if (other.cita != null)
				return false;
		} else if (!cita.equals(other.cita))
			return false;
		if (codigo != other.codigo)
			return false;
		return true;
	}
	
	
   
}