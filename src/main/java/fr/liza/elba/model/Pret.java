package fr.liza.elba.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Pret {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private boolean ferme;
	
	private int somme;
	
	private long taux;
	
	private int interet;
	
	private int restant;
	
	private int rembourse;
	
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REFRESH })
	private Famille famille;
	
	public Pret() {
	}

	public Pret(long id, boolean ferme, int somme, long taux, int interet, int restant, int rembourse,
			Famille famille) {
		super();
		this.id = id;
		this.ferme = ferme;
		this.somme = somme;
		this.taux = taux;
		this.interet = interet;
		this.restant = restant;
		this.rembourse = rembourse;
		this.famille = famille;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isFerme() {
		return ferme;
	}

	public void setFerme(boolean ferme) {
		this.ferme = ferme;
	}

	public int getSomme() {
		return somme;
	}

	public void setSomme(int somme) {
		this.somme = somme;
	}

	public long getTaux() {
		return taux;
	}

	public void setTaux(long taux) {
		this.taux = taux;
	}

	public int getInteret() {
		return interet;
	}

	public void setInteret(int interet) {
		this.interet = interet;
	}

	public int getRestant() {
		return restant;
	}

	public void setRestant(int restant) {
		this.restant = restant;
	}

	public int getRembourse() {
		return rembourse;
	}

	public void setRembourse(int rembourse) {
		this.rembourse = rembourse;
	}

	public Famille getFamille() {
		return famille;
	}

	public void setFamille(Famille famille) {
		this.famille = famille;
	}

}
