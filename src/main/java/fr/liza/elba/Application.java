package fr.liza.elba;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.liza.elba.model.LiaisonTest;
import fr.liza.elba.model.Test;
import fr.liza.elba.repository.LiaisonTestRepository;
import fr.liza.elba.repository.TestRepository;

@SpringBootApplication
@EnableAutoConfiguration
public class Application implements CommandLineRunner {

	 @Autowired
	    private TestRepository repository;

	 @Autowired
	    private LiaisonTestRepository lRepository;

	public static void main(String[] args) {
		 SpringApplication.run(Application.class, args);

	}

	@Override
    public void run(String... args) {

      
        System.out.println("ça démarre");
        
        System.out.println("Test create crud");
        Test test1 = new Test("test_1","re_1");
        
        test1 = repository.save(test1);
        System.out.println(test1);

        System.out.println("Test update crud");
        Test test2 = new Test("test_2","re_2");
        
        test2 = repository.save(test2);
        System.out.println(test2);
        
        test2.setLabel("test_2_modifie");
        test2 = repository.save(test2);
        
        System.out.println(test2);
        
        System.out.println("Test find all crud");
        List<Test> liste = repository.findAll();
        
        System.out.println(liste);
        
        System.out.println("Test find by id crud");
        Optional<Test> opTest3 = repository.findById(test1.getId());
        Test test3 = opTest3.isPresent() ? opTest3.get() : null;
        
        System.out.println("Test delete crud");
        for (Test test : liste) {
			repository.delete(test);
		}
        
        liste = repository.findAll();
        System.out.println(liste);
        
         test1 = new Test("test1", "re1");
		 test2 = new Test("test2", "re2");
		
		 repository.save(test1);
		 repository.save(test2);
		
		LiaisonTest liaisonTest1 = new LiaisonTest();
		LiaisonTest liaisonTest2 = new LiaisonTest();

		lRepository.save(liaisonTest1);
		lRepository.save(liaisonTest2);
		
		test1.setOnetomanybis(liaisonTest1);
		test2.setOnetomanybis(liaisonTest1);
		
		liaisonTest1.setOnetoone(test1);
		liaisonTest2.setOnetoone(test2);
		
		liaisonTest1.setManytoone(test1);
		liaisonTest2.setManytoone(test1);
		
		repository.save(test1);
		repository.save(test2);
		
		lRepository.save(liaisonTest1);
		lRepository.save(liaisonTest2);

        
    }
	
}
