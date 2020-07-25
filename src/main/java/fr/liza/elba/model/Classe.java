package fr.liza.elba.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Classe {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String libelle;
	
	@OneToOne(cascade = {CascadeType.MERGE,CascadeType.REFRESH})
	private Classe classeSup;
	
	@OneToMany(mappedBy = "classe", cascade = { CascadeType.MERGE,
			CascadeType.REFRESH }, fetch = FetchType.LAZY)
	private List<Famille> lFamilles;
	
	public Classe() {
	}

	public Classe(long id, String libelle, Classe classeSup, List<Famille> lFamilles) {
		this.id = id;
		this.libelle = libelle;
		this.classeSup = classeSup;
		this.lFamilles = lFamilles;
	}

	public Classe(long id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Classe getClasseSup() {
		return classeSup;
	}

	public void setClasseSup(Classe classeSup) {
		this.classeSup = classeSup;
	}
		
}
