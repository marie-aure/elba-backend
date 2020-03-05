package fr.liza.elba.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fr.liza.elba.model.Test;
import fr.liza.elba.repository.TestRepository;

@RestController
@RequestMapping("/api/test")
public class TestController {

@Autowired
private TestRepository testRepo;
	
	@GetMapping("/getAll")
	@ResponseBody
	public List<Test> getAllTest() {
		Test test = new Test("test_1","re_1");
		testRepo.save(test);
		return testRepo.findAll();
	}
	
}
