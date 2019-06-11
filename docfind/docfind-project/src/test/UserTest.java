package test;

import static org.junit.Assert.*;
import org.junit.Test;

import dao.UserDAO;
import model.User;

public class UserTest {
	private UserDAO userDAO;
	private User user;

	@Test
	public void testSalvar() {
		user = new User();

		user.setIduser(1);
		user.setNomeuser("Diogo");
		user.setSobrenomeuser("Barbosa");
		user.setCpfuser("11423477456");
		user.setEmail("teste@teste.com");
		user.setLogin("diogoteste");
		user.setSenha("123teste@");
		
		userDAO = new UserDAO();
		userDAO.salvar(user);

		assertTrue(userDAO.listarTodos().size() > 0);

	}

}