package com.sec.repositories.vente.search;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sec.model.ventes.Produits;

public interface ProduitSearchRepository extends JpaRepository<Produits, Long> {
Optional<Produits> findByCategorie(String categorie);
Optional<Produits> findByDescriptionContaining(String description);
}
