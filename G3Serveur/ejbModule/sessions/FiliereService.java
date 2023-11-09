package sessions;

import java.util.List;

import dao.IDao;
import dao.IDaoLocal;
import entities.Filiere;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class FiliereService implements IDao<Filiere>,IDaoLocal<Filiere> {
	@PersistenceContext
	private EntityManager em;

	@Override
	public boolean create(Filiere o) {
		em.persist(o);
		return true;
	}

	@Override
	public boolean update(Filiere o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Filiere o) {
		em.remove(o);
		return true;
	}

	@Override
	public Filiere findById(int id) {
		return em.find(Filiere.class, em);
	}

	@Override
	public List<Filiere> findAll() {
		jakarta.persistence.Query query = em.createQuery("select f from Filiere f");
		return query.getResultList();	
	}

}
