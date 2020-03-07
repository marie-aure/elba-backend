package fr.liza.elba.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import fr.liza.elba.model.LiaisonTest;

public interface LiaisonTestRepository extends CrudRepository<LiaisonTest, Long>{

	List<LiaisonTest> findAll();
	
	Optional<LiaisonTest> findById(Long id);
	
	LiaisonTest save(LiaisonTest liaisonTest);
	
	void delete(LiaisonTest liaisonTest);
	
}
