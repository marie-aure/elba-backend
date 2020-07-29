package fr.liza.elba.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import fr.liza.elba.model.Classe;
import fr.liza.elba.model.Famille;

public interface ClasseRepository extends CrudRepository<Classe, Long>{

	
	Optional<Classe> findById(Long id);
}
