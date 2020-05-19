package fr.liza.elba;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
       
       System.out.println("==================================");
       System.out.println("========== Créer enfant ==========");
       System.out.println("==================================\n\n");
       
       System.out.println("Conflits d'espèce");
       Random rnd = new Random();
       String[] esp = {"parent 1", "parent 2"};
       System.out.println(esp[rnd.nextInt(2)]);
       
       System.out.println("==================================\n\n");
       
       String[] ori = {"Hétéro","Hétéro","Hétéro","Homo"};
       System.out.println(ori[rnd.nextInt(4)]);
       System.out.println("==================================\n\n");
//       Sim sim = new Sim("aaa", "a", null, null, null, false, false, false, false, false, false, null, null, null, null, null);
//       sim = sRepo.save(sim);
//        
//       Famille famille = new Famille("aa", 1, 0, sim, null, null);
//       famille = repository.save(famille);
//       
//       Tour tour = new Tour(false, 0, 0, famille);
//       tour = tRepo.save(tour);

    }

}
