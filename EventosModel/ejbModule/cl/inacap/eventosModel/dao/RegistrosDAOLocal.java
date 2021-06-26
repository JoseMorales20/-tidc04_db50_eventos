package cl.inacap.eventosModel.dao;

import java.util.List;

import javax.ejb.Local;

import cl.inacap.eventosModel.dto.Registro;

@Local
public interface RegistrosDAOLocal {

	void save(Registro registro);
	List<Registro> getAll();
	void delete(Registro regsitro);
	List<Registro> filterByName(String nombre);
		
	
}
