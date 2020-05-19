package fr.liza.elba.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.liza.elba.model.Famille;

public interface FamilleService {

	public List<Famille> getAll();
	
}
