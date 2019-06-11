package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.TipoDoc;

public class TipoDocDAO {
	EntityManagerFactory emf;
	EntityManager em;

	public TipoDocDAO() {
		emf = Persistence.createEntityManagerFactory("conexao");
		em = emf.createEntityManager();

	}

	public void salvar(TipoDoc tipodoc) {
		em.getTransaction().begin();
		em.merge(tipodoc);
		em.getTransaction().commit();
		emf.close();

	}

	public void excluir(TipoDoc tipodoc) {
		em.getTransaction().begin();
		em.remove(tipodoc);
		em.getTransaction().commit();
		emf.close();
	}
	@SuppressWarnings("unchecked")
	public List<TipoDoc> listarTodos() {
		em.getTransaction().begin();
		Query consulta = em.createQuery("select tipodoc from TipoDoc tipodoc");
		List<TipoDoc> tipodocs = consulta.getResultList();
		em.getTransaction().commit();
		emf.close();
		return tipodocs;
	}

}