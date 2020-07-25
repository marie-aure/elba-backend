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
public class Famille {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
	private String nom;
	private int generation;
	private int argentIG;

	@OneToOne(cascade = { CascadeType.MERGE, CascadeType.REFRESH })
	private Sim chef;

	@OneToMany(mappedBy = "famille", cascade = { CascadeType.MERGE, CascadeType.REFRESH }, fetch = FetchType.LAZY)
	private List<Sim> lMembres;

	@OneToMany(mappedBy = "familleOrigine", cascade = { CascadeType.MERGE,
			CascadeType.REFRESH }, fetch = FetchType.LAZY)
	private List<Sim> lMembresOrigine;

	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REFRESH })
	private Classe classe;

	public Famille() {
		super();
	}

	public Famille(String nom, int generation, int argentIG, Sim chef, List<Sim> lMembres, List<Sim> lMembresOrigine,
			Classe classe) {
		super();
		this.nom = nom;
		this.generation = generation;
		this.argentIG = argentIG;
		this.chef = chef;
		this.lMembres = lMembres;
		this.lMembresOrigine = lMembresOrigine;
		this.classe = classe;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getGeneration() {
		return generation;
	}

	public void setGeneration(int generation) {
		this.generation = generation;
	}

	public int getArgentIG() {
		return argentIG;
	}

	public void setArgentIG(int argentIG) {
		this.argentIG = argentIG;
	}

	public Sim getChef() {
		return chef;
	}

	public void setChef(Sim chef) {
		this.chef = chef;
	}

	public List<Sim> getlMembres() {
		return lMembres;
	}

	public void setlMembres(List<Sim> lMembres) {
		this.lMembres = lMembres;
	}

	public List<Sim> getlMembresOrigine() {
		return lMembresOrigine;
	}

	public void setlMembresOrigine(List<Sim> lMembresOrigine) {
		this.lMembresOrigine = lMembresOrigine;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}

}
