package sessions;

import java.util.List;

import dao.IDao;
import dao.IDaoLocal;
import entities.User;
import jakarta.annotation.security.PermitAll;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class UserService implements IDao<User>,IDaoLocal<User>{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	@PermitAll
	public boolean create(User o) {
		em.persist(o);
		return true;
	}

	@Override
	public boolean update(User o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(User o) {
		em.remove(o);
		return true;
	}

	@Override
	public User findById(int id) {
		return em.find(User.class, id);
	}

	@Override
	public List<User> findAll() {
		jakarta.persistence.Query query = em.createQuery("select e from User e");
		return query.getResultList();	
	}
	

}
