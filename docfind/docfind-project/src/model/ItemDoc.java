package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ItemDoc {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long iditemdoc;
	
	@Column
	private long idtipodocfk;
	
	@Column 
	private String pessoaperdeufk;
	
	@Column
	private String pessoaachoufk;
	
	@Column 
	private boolean docachadoperdido;
	
	@Column 
	private String nomepessoa;
	
	@Column
	private String numregdoc;
	
	@Column
	private String descdoc;
	
	@Column
	private boolean controledoc;

	public long getIditemdoc() {
		return iditemdoc;
	}

	public void setIditemdoc(long iditemdoc) {
		this.iditemdoc = iditemdoc;
	}

	public long getIdtipodocfk() {
		return idtipodocfk;
	}

	public void setIdtipodocfk(long idtipodocfk) {
		this.idtipodocfk = idtipodocfk;
	}

	public String getPessoaperdeufk() {
		return pessoaperdeufk;
	}

	public void setPessoaperdeufk(String pessoaperdeufk) {
		this.pessoaperdeufk = pessoaperdeufk;
	}

	public String getPessoaachoufk() {
		return pessoaachoufk;
	}

	public void setPessoaachoufk(String pessoaachoufk) {
		this.pessoaachoufk = pessoaachoufk;
	}

	public boolean isDocachadoperdido() {
		return docachadoperdido;
	}

	public void setDocachadoperdido(boolean docachadoperdido) {
		this.docachadoperdido = docachadoperdido;
	}

	public String getNomepessoa() {
		return nomepessoa;
	}

	public void setNomepessoa(String nomepessoa) {
		this.nomepessoa = nomepessoa;
	}

	public String getNumregdoc() {
		return numregdoc;
	}

	public void setNumregdoc(String numregdoc) {
		this.numregdoc = numregdoc;
	}
	
	public String getDescdoc() {
		return descdoc;
	}

	public void setDescdoc(String descdoc) {
		this.descdoc = descdoc;
	}

	public boolean isControledoc() {
		return controledoc;
	}

	public void setControledoc(boolean controledoc) {
		this.controledoc = controledoc;
	}
	
	
	
}