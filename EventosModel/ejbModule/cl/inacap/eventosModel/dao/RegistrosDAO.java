package cl.inacap.eventosModel.dao;


import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import cl.inacap.eventosModel.dto.Registro;

@Stateless
@LocalBean
public class RegistrosDAO implements RegistrosDAOLocal {
	
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("eventosModel");
	
	
	@Override
	public void save(Registro registro) {
		EntityManager em = this.emf.createEntityManager();
		try {
			em.persist(registro);
			em.flush();
			
		}catch(Exception ex) {
			
		}finally {
			em.close();
		}
		
	}

	@Override
	public List<Registro> getAll() {
		EntityManager em = this.emf.createEntityManager();
		try {
			return em.createNamedQuery("Registro.getAll",Registro.class).getResultList();
		}catch(Exception ex) {
			return null;
		}finally {
			em.close();
		}
	}

	@Override
	public List<Registro> getByEstado(String estado) {
		EntityManager em = this.emf.createEntityManager();
		try {
			return em.createNamedQuery("Registro.getByEstado", Registro.class).setParameter("estado",estado).getResultList();
		}catch(Exception ex) {
			return null;
		}finally {
			em.close();
		}
	}

	@Override
	public Registro findByRut(String Rut) {
		EntityManager em = this.emf.createEntityManager();
		try {
			return em.find(Registro.class,Rut);
		}catch(Exception ex){
			return null;
		}finally {
			em.close();
		}
	}
	
	

}
