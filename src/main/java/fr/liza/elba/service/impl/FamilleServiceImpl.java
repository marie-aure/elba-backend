package fr.liza.elba.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.liza.elba.model.Famille;
import fr.liza.elba.model.Tour;
import fr.liza.elba.repository.FamilleRepository;
import fr.liza.elba.repository.TourRepository;
import fr.liza.elba.service.FamilleService;

@Service(value="familleService")
public class FamilleServiceImpl implements FamilleService {

	@Autowired
	private FamilleRepository familleRepository;

	@Override
	public List<Famille> getAll() {
		return familleRepository.findAll();
	}

}
