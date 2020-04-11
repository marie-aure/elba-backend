package fr.liza.elba.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Tour {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
	private boolean enCours;
	private int nb;
	private int semaine;

	@OneToOne(cascade = { CascadeType.MERGE, CascadeType.REFRESH })
	private Famille famille;

	public Tour() {
		super();
	}

	public Tour(boolean enCours, int nb, int semaine, Famille famille) {
		super();
		this.enCours = enCours;
		this.nb = nb;
		this.semaine = semaine;
		this.famille = famille;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public boolean isEnCours() {
		return enCours;
	}

	public void setEnCours(boolean enCours) {
		this.enCours = enCours;
	}

	public int getNb() {
		return nb;
	}

	public void setNb(int nb) {
		this.nb = nb;
	}

	public int getSemaine() {
		return semaine;
	}

	public void setSemaine(int semaine) {
		this.semaine = semaine;
	}

	public Famille getFamille() {
		return famille;
	}

	public void setFamille(Famille famille) {
		this.famille = famille;
	}
}
