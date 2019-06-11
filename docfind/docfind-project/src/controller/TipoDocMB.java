
package controller;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import dao.TipoDocDAO;
import model.TipoDoc;

@ManagedBean
public class TipoDocMB {
	private TipoDoc tipodoc;
	private TipoDocDAO tipodocDAO;
	private List<TipoDoc> Lista;	
	
	public TipoDocMB() {
		tipodocDAO = new TipoDocDAO();
		tipodoc = new TipoDoc();
		
		Lista = tipodocDAO.listarTodos();				
	}
	
	public TipoDoc getTipoDoc(){
		return this.tipodoc;
	}
	
	public void setTipoDoc(TipoDoc tipodoc){
		this.tipodoc = tipodoc;
	}
	
	public List<TipoDoc> getList() {
		return this.Lista;
	}
	
	public void salvar() {
		tipodocDAO.salvar(tipodoc);
		tipodoc = new TipoDoc();
		Lista = tipodocDAO.listarTodos();

		addMessage("Tipo de documento salvo com sucesso!!");
		
	}
	
	public void addMessage(String summary) {
	        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
	        FacesContext.getCurrentInstance().addMessage(null, message);
	}
}	