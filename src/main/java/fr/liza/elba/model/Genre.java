package fr.liza.elba.model;

public enum Genre {

	FEMININ("Femme"),
	MASCULIN("Homme");
	
	 private String genre ;  

	private Genre(String genre) {
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

}
