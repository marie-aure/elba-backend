package fr.liza.elba;

import java.awt.print.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.liza.elba.repository.TestRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {

	 @Autowired
	    private TestRepository repository;


	public static void main(String[] args) {
		 SpringApplication.run(Application.class, args);

	}

	@Override
    public void run(String... args) {

      
        System.out.println("ça démarre");
        

    }
	
}
