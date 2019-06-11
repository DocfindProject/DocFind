package test;

import static org.junit.Assert.*;
import org.junit.Test;

import dao.TipoDocDAO;
import model.TipoDoc;

public class TipoDocTest {
	private TipoDocDAO tipodocDAO;
	private TipoDoc tipodoc;

	@Test
	public void testSalvar() {
		tipodoc = new TipoDoc();

		tipodoc.setIdtipodoc(1);
		tipodoc.setNomedoc("cpf");
		tipodoc.setDesctipodoc("cadastro de pessoa fisica");
		
		tipodocDAO = new TipoDocDAO();
		tipodocDAO.salvar(tipodoc);

		assertTrue(tipodocDAO.listarTodos().size() > 0);

	}

}