
package controller;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import dao.ItemDocDAO;
import model.ItemDoc;

@ManagedBean
public class ItemDocMB {
	private ItemDoc itemdoc;
	private ItemDocDAO itemdocDAO;
	private List<ItemDoc> Lista;	
	
	public ItemDocMB() {
		itemdocDAO = new ItemDocDAO();
		itemdoc = new ItemDoc();
		
		Lista = itemdocDAO.listarTodos();				
	}
	
	public ItemDoc getItemDoc(){
		return this.itemdoc;
	}
	
	public void setItemDoc(ItemDoc itemdoc){
		this.itemdoc = itemdoc;
	}
	
	public List<ItemDoc> getList() {
		return this.Lista;
	}
	
	public void salvar() {
		itemdocDAO.salvar(itemdoc);
		itemdoc = new ItemDoc();
		Lista = itemdocDAO.listarTodos();

		addMessage("Documento salvo com sucesso!!");
		
	}
	
	public void addMessage(String summary) {
	        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
	        FacesContext.getCurrentInstance().addMessage(null, message);
	}
}	