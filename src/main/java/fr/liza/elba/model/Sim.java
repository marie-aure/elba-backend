package fr.liza.elba.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;

@Entity
public class Sim {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
	private String prenom;
	private String nom;
	private Genre genre;
	private Espece espece;
	private Orientation orientation;
	private boolean marie;
	private boolean realise;
	private boolean mort;
	private boolean legitime;
	private boolean heritier;
	private boolean adulte;

	@OneToOne(cascade = { CascadeType.MERGE, CascadeType.REFRESH })
	private Sim couple;

	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REFRESH })
	private Sim parent1;

	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REFRESH })
	private Sim parent2;

	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REFRESH }, fetch = FetchType.EAGER)
	private Famille famille;

	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.REFRESH }, fetch = FetchType.EAGER)
	private Famille familleOrigine;

	public Sim() {
		super();
	}

	public Sim(String prenom, String nom, Genre genre, Espece espece, Orientation orientation, boolean marie,
			boolean realise, boolean mort, boolean legitime, boolean heritier, boolean adulte, Sim couple, Sim parent1,
			Sim parent2, Famille famille, Famille familleOrigine) {
		this.prenom = prenom;
		this.nom = nom;
		this.genre = genre;
		this.espece = espece;
		this.orientation = orientation;
		this.marie = marie;
		this.realise = realise;
		this.mort = mort;
		this.legitime = legitime;
		this.heritier = heritier;
		this.adulte = adulte;
		this.couple = couple;
		this.parent1 = parent1;
		this.parent2 = parent2;
		this.famille = famille;
		this.familleOrigine = familleOrigine;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public Espece getEspece() {
		return espece;
	}

	public void setEspece(Espece espece) {
		this.espece = espece;
	}

	public Orientation getOrientation() {
		return orientation;
	}

	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}

	public boolean isMarie() {
		return marie;
	}

	public void setMarie(boolean marie) {
		this.marie = marie;
	}

	public boolean isRealise() {
		return realise;
	}

	public void setRealise(boolean realise) {
		this.realise = realise;
	}

	public boolean isMort() {
		return mort;
	}

	public void setMort(boolean mort) {
		this.mort = mort;
	}

	public boolean isLegitime() {
		return legitime;
	}

	public void setLegitime(boolean legitime) {
		this.legitime = legitime;
	}

	public boolean isHeritier() {
		return heritier;
	}

	public void setHeritier(boolean heritier) {
		this.heritier = heritier;
	}

	public boolean isAdulte() {
		return adulte;
	}

	public void setAdulte(boolean adulte) {
		this.adulte = adulte;
	}

	public Sim getCouple() {
		return couple;
	}

	public void setCouple(Sim couple) {
		this.couple = couple;
	}

	public Sim getParent1() {
		return parent1;
	}

	public void setParent1(Sim parent1) {
		this.parent1 = parent1;
	}

	public Sim getParent2() {
		return parent2;
	}

	public void setParent2(Sim parent2) {
		this.parent2 = parent2;
	}

	public Famille getFamille() {
		return famille;
	}

	public void setFamille(Famille famille) {
		this.famille = famille;
	}

	public Famille getFamilleOrigine() {
		return familleOrigine;
	}

	public void setFamilleOrigine(Famille familleOrigine) {
		this.familleOrigine = familleOrigine;
	}

}
