package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.ItemDoc;

public class ItemDocDAO {
	EntityManagerFactory emf;
	EntityManager em;

	public ItemDocDAO() {
		emf = Persistence.createEntityManagerFactory("conexao");
		em = emf.createEntityManager();

	}

	public void salvar(ItemDoc itemdoc) {
		em.getTransaction().begin();
		em.merge(itemdoc);
		em.getTransaction().commit();
		emf.close();

	}

	public void excluir(ItemDoc itemdoc) {
		em.getTransaction().begin();
		em.remove(itemdoc);
		em.getTransaction().commit();
		emf.close();
	}
	@SuppressWarnings("unchecked")
	public List<ItemDoc> listarTodos() {
		em.getTransaction().begin();
		Query consulta = em.createQuery("select itemdoc from ItemDoc itemdoc");
		List<ItemDoc> itemdocs = consulta.getResultList();
		em.getTransaction().commit();
		emf.close();
		return itemdocs;
	}

}