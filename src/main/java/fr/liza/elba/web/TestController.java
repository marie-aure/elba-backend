package fr.liza.elba.web;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fr.liza.elba.model.LiaisonTest;
import fr.liza.elba.model.Test;
import fr.liza.elba.repository.LiaisonTestRepository;
import fr.liza.elba.repository.TestRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/test")
public class TestController {

	@Autowired
	private TestRepository testRepo;
	
	@Autowired
	private LiaisonTestRepository liaisonTestRepo;


	@GetMapping("/getAllTests")
	@ResponseBody
	public List<Test> getAllTest() {
		return testRepo.findAll();
	}

	@GetMapping("/getAllLiaisonTests")
	@ResponseBody
	public List<LiaisonTest> getAllLiaisonTest() {
		return liaisonTestRepo.findAll();
	}
}
