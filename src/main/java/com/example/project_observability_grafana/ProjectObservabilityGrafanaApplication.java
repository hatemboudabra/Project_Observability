package com.example.project_observability_grafana;

import com.example.project_observability_grafana.entity.Produit;
import com.example.project_observability_grafana.repository.ProduitRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProjectObservabilityGrafanaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectObservabilityGrafanaApplication.class, args);
	}


	@Bean
	CommandLineRunner commandLineRunner(ProduitRepo produitRepo){
		return args -> {
			produitRepo.save(Produit.builder().name("Computer").price(23000).build());
			produitRepo.save(Produit.builder().name("Smart Phone").price(1200).build());
			produitRepo.save(Produit.builder().name("Labtop").price(300).build());
			produitRepo.findAll().forEach(System.out::println);
		};
	}
}
