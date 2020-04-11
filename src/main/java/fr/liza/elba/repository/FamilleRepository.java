package fr.liza.elba.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import fr.liza.elba.model.Famille;

public interface FamilleRepository extends CrudRepository<Famille, Long>{

	List<Famille> findAll();
	
	Optional<Famille> findById(Long id);
	
	Famille save(Famille famille);
	
	void delete(Famille famille);
}
