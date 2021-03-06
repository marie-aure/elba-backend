package fr.liza.elba.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.liza.elba.model.Famille;
import fr.liza.elba.model.Pret;
import fr.liza.elba.repository.PretRepository;
import fr.liza.elba.service.PretService;

@Service(value="pretService")
public class PretServiceImpl implements PretService {

	@Autowired
	private PretRepository pretRepository;

	@Override
	public List<Pret> getByFamille(Famille famille) {
		return pretRepository.findByFamille(famille);
	}


}
