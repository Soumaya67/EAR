package sessions;

import java.util.List;

import dao.IDao;
import dao.IDaoLocal;
import entities.Etudiant;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class EtudiantService implements IDao<Etudiant>, IDaoLocal<Etudiant>{
	@PersistenceContext
	private EntityManager em;

	@Override
	public boolean create(Etudiant o) {
		em.persist(o);
		return true;
	}

	@Override
	public boolean update(Etudiant o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Etudiant o) {
		em.remove(o);
		return true;
	}

	@Override
	public Etudiant findById(int id) {
		return em.find(Etudiant.class, em);
		
	}

	@Override
	public List<Etudiant> findAll() {
		jakarta.persistence.Query query = em.createQuery("select e from Etudiant e");
		return query.getResultList();	
	}

}
