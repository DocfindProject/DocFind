package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TipoDoc {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idtipodoc;
	
	@Column
	private String nomedoc;
	
	@Column 
	private String desctipodoc;

	public long getIdtipodoc() {
		return idtipodoc;
	}

	public void setIdtipodoc(long idtipodoc) {
		this.idtipodoc = idtipodoc;
	}

	public String getNomedoc() {
		return nomedoc;
	}

	public void setNomedoc(String nomedoc) {
		this.nomedoc = nomedoc;
	}

	public String getDesctipodoc() {
		return desctipodoc;
	}

	public void setDesctipodoc(String desctipodoc) {
		this.desctipodoc = desctipodoc;
	}

	
}