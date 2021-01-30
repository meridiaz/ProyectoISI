package urjc.isi.servidor;

import java.sql.Date;

public class examen {
	
	private int idExamen;
	private Date Fecha;
	private String Asignatura;
	private int finalExamen;

	public examen(int idExamen, Date fecha, String Asignatura, int finalExamen) {
		this.idExamen = idExamen;
		this.Fecha = fecha;
		this.Asignatura = Asignatura;
		this.finalExamen = finalExamen;
	}


	public int getIdExamen() {
		return idExamen;
	}

	public void setIdExamen(int idExamen) {
		this.idExamen = idExamen;
	}

	public Date getFecha() {
		return Fecha;
	}
	
	public void setFecha(Date fecha) {
		Fecha = fecha;
	}

	public String getAsignatura() {
		return Asignatura;
	}

	public void setAsignatura(String asignatura) {
		Asignatura = asignatura;
	}

	public int getFinalExamen() {
		return finalExamen;
	}

	public void setFinalExamen(int finalExamen) {
		this.finalExamen = finalExamen;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Asignatura == null) ? 0 : Asignatura.hashCode());
		result = prime * result + ((Fecha == null) ? 0 : Fecha.hashCode());
		result = prime * result + finalExamen;
		result = prime * result + idExamen;
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
		examen other = (examen) obj;
		if (Asignatura == null) {
			if (other.Asignatura != null)
				return false;
		} else if (!Asignatura.equals(other.Asignatura))
			return false;
		if (Fecha == null) {
			if (other.Fecha != null)
				return false;
		} else if (!Fecha.equals(other.Fecha))
			return false;
		if (finalExamen != other.finalExamen)
			return false;
		if (idExamen != other.idExamen)
			return false;
		return true;
	}
	
}
