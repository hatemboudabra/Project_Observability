package com.example.project_observability_grafana.repository;

import com.example.project_observability_grafana.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepo extends JpaRepository<Produit,Long> {
}
