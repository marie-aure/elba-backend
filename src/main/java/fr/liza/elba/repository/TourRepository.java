package fr.liza.elba.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import fr.liza.elba.model.Tour;

public interface TourRepository extends CrudRepository<Tour, Long>{

	List<Tour> findAll();
	
	Optional<Tour> findById(Long id);
	
	Tour save(Tour tour);
	
	void delete(Tour tour);
}
