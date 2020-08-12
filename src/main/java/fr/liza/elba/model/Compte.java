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
public class Compte {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private int montant;
	
	private long taux;
	
	private int retrait;
	
	private int depot;
	
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REFRESH })
	private Famille famille;
	
	public Compte() {
	}

	public Compte(long id, int montant, long taux, int retrait, int depot, Famille famille) {
		super();
		this.id = id;
		this.montant = montant;
		this.taux = taux;
		this.retrait = retrait;
		this.depot = depot;
		this.famille = famille;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getMontant() {
		return montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}

	public long getTaux() {
		return taux;
	}

	public void setTaux(long taux) {
		this.taux = taux;
	}

	public int getRetrait() {
		return retrait;
	}

	public void setRetrait(int retrait) {
		this.retrait = retrait;
	}

	public int getDepot() {
		return depot;
	}

	public void setDepot(int depot) {
		this.depot = depot;
	}

	public Famille getFamille() {
		return famille;
	}

	public void setFamille(Famille famille) {
		this.famille = famille;
	}


	
}
