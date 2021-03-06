package fr.liza.elba.service;

import java.util.List;

import fr.liza.elba.model.Famille;
import fr.liza.elba.model.Pret;

public interface PretService {

	public List<Pret> getByFamille(Famille famille);
	
}
