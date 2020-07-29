package fr.liza.elba.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import fr.liza.elba.model.Classe;
import fr.liza.elba.model.Tour;

public interface TourRepository extends CrudRepository<Tour, Long>{

	List<Tour> findAll();
	
	Optional<Tour> findById(Long id);
	
	Tour findByEnCours(boolean enCours);
	
	Tour save(Tour tour);
	
	void delete(Tour tour);
	
	@Query("from Tour t  where t.famille.classe=:classe and t.id > :id order by t.id asc")
	Iterable<Tour> findByClasse(@Param("classe") Classe classe, @Param("id") Long id);
	
	@Query("from Tour t where t.famille.classe=:classe order by t.id asc")
	Iterable<Tour> findByClasse(@Param("classe") Classe classe);
}
