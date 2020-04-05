package fr.liza.elba.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import fr.liza.elba.model.Test;

public interface TestRepository extends CrudRepository<Test, Long>{

	List<Test> findAll();
	
	Optional<Test> findById(Long id);
	
	Test save(Test test);
	
	void delete(Test test);
}
