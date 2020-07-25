package fr.liza.elba.dto;

import java.util.List;

import fr.liza.elba.model.Sim;

public class FamilleDto {

	private long id;
	private String nom;
	private int generation;
	private int argentIG;
	private String classe;
	private SimFamilleDto chef;
	private List<SimFamilleDto> lMembers;
	private List<SimFamilleDto> lMembersOrigine;

	public FamilleDto(long id, String nom, int generation, int argentIG) {
		super();
		this.id = id;
		this.nom = nom;
		this.generation = generation;
		this.argentIG = argentIG;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public SimFamilleDto getChef() {
		return chef;
	}

	public void setChef(SimFamilleDto chef) {
		this.chef = chef;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public List<SimFamilleDto> getlMembers() {
		return lMembers;
	}

	public void setlMembers(List<SimFamilleDto> lMembers) {
		this.lMembers = lMembers;
	}

	public List<SimFamilleDto> getlMembersOrigine() {
		return lMembersOrigine;
	}

	public void setlMembersOrigine(List<SimFamilleDto> lMembersOrigine) {
		this.lMembersOrigine = lMembersOrigine;
	}

}
