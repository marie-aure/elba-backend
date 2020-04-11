package fr.liza.elba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.liza.elba.model.Famille;
import fr.liza.elba.repository.FamilleRepository;

@Service(value="familleService")
public class FamilleService {
	
	@Autowired
	private FamilleRepository repository;

	public List<Famille> getAll(){
		return repository.findAll();
	}
	
}
