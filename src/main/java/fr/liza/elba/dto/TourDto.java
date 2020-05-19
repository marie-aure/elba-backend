package fr.liza.elba.dto;

import fr.liza.elba.model.Famille;

public class TourDto {

	private int numero;
	private int semaine;
	private FamilleDto famille;

	public TourDto(int numero, int semaine) {
		this.numero = numero;
		this.semaine = semaine;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getSemaine() {
		return semaine;
	}

	public void setSemaine(int semaine) {
		this.semaine = semaine;
	}

	public FamilleDto getFamille() {
		return famille;
	}

	public void setFamille(FamilleDto famille) {
		this.famille = famille;
	}

}
