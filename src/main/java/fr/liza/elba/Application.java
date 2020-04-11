package fr.liza.elba;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.liza.elba.model.Famille;
import fr.liza.elba.model.Sim;
import fr.liza.elba.model.Tour;
import fr.liza.elba.repository.FamilleRepository;
import fr.liza.elba.repository.SimRepository;
import fr.liza.elba.repository.TourRepository;

@SpringBootApplication
@EnableAutoConfiguration
public class Application implements CommandLineRunner {
	
	@Autowired
	private FamilleRepository repository;
	
	@Autowired
	private SimRepository sRepo;
	
	@Autowired
	private TourRepository tRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

	@Override
    public void run(String... args) {
    
       System.out.println("ça démarre");
       Sim sim = new Sim("aaa", "a", null, null, null, false, false, false, false, false, false, null, null, null, null, null);
       sim = sRepo.save(sim);
        
       Famille famille = new Famille("aa", 1, 0, sim, null, null);
       famille = repository.save(famille);
       
       Tour tour = new Tour(false, 0, 0, famille);
       tour = tRepo.save(tour);

    }

}
