package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long iduser;
	
	@Column
	private String nomeuser;
	
	@Column
	private String sobrenomeuser;
	
	@Column
	private String cpfuser;
	
	@Column 
	private String email;
	
	@Column
	private String login;

	@Column 
	private String senha;

	public long getIduser() {
		return iduser;
	}

	public void setIduser(long iduser) {
		this.iduser = iduser;
	}

	public String getNomeuser() {
		return nomeuser;
	}

	public void setNomeuser(String nomeuser) {
		this.nomeuser = nomeuser;
	}

	public String getSobrenomeuser() {
		return sobrenomeuser;
	}

	public void setSobrenomeuser(String sobrenomeuser) {
		this.sobrenomeuser = sobrenomeuser;
	}

	public String getCpfuser() {
		return cpfuser;
	}

	public void setCpfuser(String cpfuser) {
		this.cpfuser = cpfuser;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	
}