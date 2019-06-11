package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.User;

public class UserDAO {
	EntityManagerFactory emf;
	EntityManager em;

	public UserDAO() {
		emf = Persistence.createEntityManagerFactory("conexao");
		em = emf.createEntityManager();

	}

	public void salvar(User user) {
		em.getTransaction().begin();
		em.merge(user);
		em.getTransaction().commit();
		emf.close();

	}

	public void excluir(User user) {
		em.getTransaction().begin();
		em.remove(user);
		em.getTransaction().commit();
		emf.close();
	}
	@SuppressWarnings("unchecked")
	public List<User> listarTodos() {
		em.getTransaction().begin();
		Query consulta = em.createQuery("select user from User user");
		List<User> users = consulta.getResultList();
		em.getTransaction().commit();
		emf.close();
		return users;
	}

}