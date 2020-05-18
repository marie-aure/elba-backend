package fr.liza.elba.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.liza.elba.model.Tour;
import fr.liza.elba.repository.TourRepository;
import fr.liza.elba.service.TourService;

@Service(value="tourService")
public class TourServiceImpl implements TourService {
	
	@Autowired
	private TourRepository tourRepository;
	
	@Override
	public Tour getTourEnCours() {
		Tour enCours = tourRepository.findByEnCours(true);
		return enCours;
	}
	
}
