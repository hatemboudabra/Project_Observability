package com.example.project_observability_grafana.controller;

import com.example.project_observability_grafana.entity.Produit;
import com.example.project_observability_grafana.model.Post;
import com.example.project_observability_grafana.repository.ProduitRepo;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

import java.util.List;

@RestController
public class ProduitController {
    private ProduitRepo produitRepo;
    private RestClient restClient;

    public ProduitController(ProduitRepo produitRepo,RestClient.Builder restClient) {
        this.produitRepo = produitRepo;
        this.restClient = restClient
                .baseUrl("https://jsonplaceholder.typicode.com")
                .build();
    }


    @GetMapping("/produits")
    public List<Produit> getAllProducts(){
        return produitRepo.findAll();
    }
    @GetMapping("/posts")
    public List<Post> allPosts(){
        return restClient.get()
                .uri("/posts")
                .retrieve()
                .body(new ParameterizedTypeReference<List<Post>>() {});
    }
}
