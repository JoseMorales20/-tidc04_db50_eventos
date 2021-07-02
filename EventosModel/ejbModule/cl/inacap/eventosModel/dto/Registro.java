package cl.inacap.eventosModel.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Rut;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="registros")
@NamedQueries({
		@NamedQuery(name="Registro.getAll", query="SELECT r FROM Registro r ORDER BY r.rut"),
		@NamedQuery(name="Registro.getByEstado", query="SELECT r FROM Registro r WHERE r.estado = estado"),
})

public class Registro {
	@Rut
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String rut;
	private String nombre;
	private String apellido;
	private int edad;
	private String empresa;
	private String estado;
	private String region;
	List<Registro> registros;
	
	
	
	public List<Registro> getRegistros() {
		return registros;
	}
	public void setRegistros(List<Registro> registros) {
		this.registros = registros;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	
	

}
