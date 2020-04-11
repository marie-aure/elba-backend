package fr.liza.elba.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import fr.liza.elba.model.Sim;

public interface SimRepository extends CrudRepository<Sim, Long>{

	List<Sim> findAll();
	
	Optional<Sim> findById(Long id);
	
	Sim save(Sim sim);
	
	void delete(Sim sim);
}
