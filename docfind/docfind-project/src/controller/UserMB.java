
package controller;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import dao.UserDAO;
import model.User;

@ManagedBean
public class UserMB {
	private User user;
	private UserDAO userDAO;
	private List<User> Lista;	
	
	public UserMB() {
		userDAO = new UserDAO();
		user = new User();
		
		Lista = userDAO.listarTodos();				
	}
	
	public User getUser(){
		return this.user;
	}
	
	public void setUser(User user){
		this.user = user;
	}
	
	public List<User> getList() {
		return this.Lista;
	}
	
	public void salvar() {
		userDAO.salvar(user);
		user = new User();
		Lista = userDAO.listarTodos();

		addMessage("Usuario cadastrado com sucesso!!");
		
	}
	
	public void addMessage(String summary) {
	        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
	        FacesContext.getCurrentInstance().addMessage(null, message);
	}
}	