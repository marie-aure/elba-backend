package fr.liza.elba.dto;

public class SimFamilleDto {
	private String prenom;
	private String nom;
	private String prenomConjoint;
	private String nomConjoint;
	private String nomOrigineConjoint;
	


	public SimFamilleDto(String prenom, String nom) {
		super();
		this.prenom = prenom;
		this.nom = nom;
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

	public String getPrenomConjoint() {
		return prenomConjoint;
	}

	public void setPrenomConjoint(String prenomConjoint) {
		this.prenomConjoint = prenomConjoint;
	}

	public String getNomConjoint() {
		return nomConjoint;
	}

	public void setNomConjoint(String nomConjoint) {
		this.nomConjoint = nomConjoint;
	}

	public String getNomOrigineConjoint() {
		return nomOrigineConjoint;
	}

	public void setNomOrigineConjoint(String nomOrigineConjoint) {
		this.nomOrigineConjoint = nomOrigineConjoint;
	}

}
