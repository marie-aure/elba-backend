package fr.liza.elba.service;

import java.util.List;
import java.util.Optional;

import fr.liza.elba.model.Famille;

public interface FamilleService {

	public List<Famille> getAll();
	
	public Optional<Famille> getById(long id);
	
}
