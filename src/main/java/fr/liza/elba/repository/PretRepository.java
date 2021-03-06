package fr.liza.elba.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import fr.liza.elba.model.Famille;
import fr.liza.elba.model.Pret;

public interface PretRepository extends CrudRepository<Pret, Long>{

	List<Pret> findAll();
	
	Optional<Pret> findById(Long id);
	
	List<Pret> findByFamille(Famille famille);
	
	Pret save(Pret pret);
	
	void delete(Pret pret);
}
