package fr.liza.elba.model;

public enum Orientation {

	HO("Homo"), HE("Hétéro");

	private String orientation;

	private Orientation(String orientation) {
		this.orientation = orientation;
	}

	public String getOrientation() {
		return orientation;
	}

	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}

}
