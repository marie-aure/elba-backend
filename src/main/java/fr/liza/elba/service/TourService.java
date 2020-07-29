package fr.liza.elba.service;

import org.springframework.stereotype.Service;

import fr.liza.elba.model.Tour;

public interface TourService {
	
	public Tour getTourEnCours();
	
	public void tourSuivant(int argentIG);

}
