package cl.inacap.eventosModel.dao;

import java.util.List;

import javax.ejb.Local;

import cl.inacap.eventosModel.dto.Registro;

@Local
public interface RegistrosDAOLocal {

	void save(Registro registro);
	List<Registro> getAll();
	List<Registro> getByEstado(String estado);
	Registro findByRut(String Rut);
		
	
}
