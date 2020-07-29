package fr.liza.elba.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import fr.liza.elba.model.Classe;
import fr.liza.elba.model.Famille;
import fr.liza.elba.model.Tour;
import fr.liza.elba.repository.ClasseRepository;
import fr.liza.elba.repository.FamilleRepository;
import fr.liza.elba.repository.TourRepository;
import fr.liza.elba.service.TourService;

@Service(value="tourService")
public class TourServiceImpl implements TourService {
	
	@Autowired
	private TourRepository tourRepository;
	
	@Autowired
	private FamilleRepository familleRepository;
	
	@Autowired
	private ClasseRepository classeRepository;
	
	@Override
	public Tour getTourEnCours() {
		Tour enCours = tourRepository.findByEnCours(true);
		return enCours;
	}
	
	@Override
	public void tourSuivant(int argentIG) {
		Tour tourOld = getTourEnCours();
		tourOld.setEnCours(false);
		tourOld.setSemaine(0);
		tourRepository.save(tourOld);
		
		Famille familleOld = tourOld.getFamille();
		familleOld.setArgentIG(argentIG);
		familleRepository.save(familleOld);
		
		// sélection du tour suivant
		List<Tour> liste = (List<Tour>) tourRepository.findByClasse(familleOld.getClasse(), tourOld.getId());
		
		Tour tourNew = null;
		
		if (!CollectionUtils.isEmpty(liste)){
			tourNew = liste.get(0);
		} else {
			while (tourNew == null) {
				if (familleOld.getClasse().getClasseSup() != null) {
					liste = (List<Tour>) tourRepository.findByClasse(familleOld.getClasse().getClasseSup());
				} else if (familleOld.getClasse().getLibelle().equals("Illégitime")){
					liste = (List<Tour>) tourRepository.findByClasse(classeRepository.findById((long) 2).get());
				}
				else if (familleOld.getClasse().getLibelle().equals("Noblesse")){
					liste = (List<Tour>) tourRepository.findByClasse(classeRepository.findById((long) 1).get());
				}
				if (!CollectionUtils.isEmpty(liste)){
					tourNew = liste.get(0);
				}
			}
		}
		
		tourNew.setEnCours(true);
		tourNew.setSemaine(1);
		tourNew.setNb(tourNew.getNb()+1);
		
		tourRepository.save(tourNew);		
	}
	
}
