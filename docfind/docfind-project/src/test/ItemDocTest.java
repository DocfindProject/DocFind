package test;

import static org.junit.Assert.*;
import org.junit.Test;

import dao.ItemDocDAO;
import model.ItemDoc;

public class ItemDocTest {
	private ItemDocDAO itemdocDAO;
	private ItemDoc itemdoc;

	@Test
	public void testSalvar() {
		itemdoc = new ItemDoc();

		itemdoc.setIditemdoc(1);
		itemdoc.setIdtipodocfk(3);
		itemdoc.setPessoaperdeufk("teste perdeu");
		itemdoc.setPessoaachoufk("teste achou");
		itemdoc.setDocachadoperdido(true);
		itemdoc.setNomepessoa("Diogo");
		itemdoc.setNumregdoc("11423477456");
		itemdoc.setControledoc(false);
		

		itemdocDAO = new ItemDocDAO();
		itemdocDAO.salvar(itemdoc);

		assertTrue(itemdocDAO.listarTodos().size() > 0);

	}

}