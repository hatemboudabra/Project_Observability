package com.example.project_observability_grafana.controller;

import com.example.project_observability_grafana.entity.Produit;
import com.example.project_observability_grafana.repository.ProduitRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProduitController {
    private ProduitRepo produitRepo;

    public ProduitController(ProduitRepo produitRepo) {
        this.produitRepo = produitRepo;
    }


    @GetMapping("/produits")
    public List<Produit> getAllProducts(){
        return produitRepo.findAll();
    }
}
