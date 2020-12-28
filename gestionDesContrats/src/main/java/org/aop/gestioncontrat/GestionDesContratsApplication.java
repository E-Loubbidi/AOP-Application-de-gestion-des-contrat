package org.aop.gestioncontrat;

import org.aop.gestioncontrat.entity.Contrat;
import org.aop.gestioncontrat.service.IContratService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.aop.gestioncontrat.service.ContratRepository;

import java.util.Date;

@SpringBootApplication
public class GestionDesContratsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionDesContratsApplication.class, args);
	}

	@Bean
	CommandLineRunner start(IContratService contratService, RepositoryRestConfiguration restConfiguration){
		return args -> {
			restConfiguration.exposeIdsFor(Contrat.class);
			contratService.ajouterContrat(new Contrat(null, "Location Maison", new Date(), Math.random() * 100000 + 1000, "Ahmed", "BB157574"));
			contratService.ajouterContrat(new Contrat(null, "Club Sport", new Date(), Math.random() * 100000 + 1000, "Ahmed", "BB157574"));
			contratService.ajouterContrat(new Contrat(null, "Achat voiture", new Date(), Math.random() * 100000 + 1000, "Mustapha", "BB5478963"));
			contratService.ajouterContrat(new Contrat(null, "Travail", new Date(), Math.random() * 100000 + 1000, "Sara", "BB471258"));
			contratService.ajouterContrat(new Contrat(null, "Voyage", new Date(), Math.random() * 100000 + 1000, "Ali", "BB951753"));
			contratService.ajouterContrat(new Contrat(null, "Travail CDD", new Date(), Math.random() * 100000 + 1000, "Ali", "BB951753"));
			contratService.ajouterContrat(new Contrat(null, "Location Voiture", new Date(), Math.random() * 100000 + 1000, "Ali", "BB951753"));
		};
	}

}
