package cl.inacap.eventosModel.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import cl.inacap.eventosModel.dto.Registro;

@Stateless
@LocalBean
public class RegistrosDAO implements RegistrosDAOLocal {
	
	private static List<Registro> registros = new ArrayList<Registro>();
	
	@Override
	public void save(Registro registro) {
		registros.add(registro);
		
	}

	@Override
	public List<Registro> getAll() {
		// TODO Auto-generated method stub
		return registros;
	}

	@Override
	public void delete(Registro registro) {
		registros.remove(registro);
		
	}

	@Override
	public List<Registro> filterByName(String nombre) {
		return registros.stream().filter(r->r.getNombre().contains(nombre)).collect(Collectors.toList());
	}
	
	

}
