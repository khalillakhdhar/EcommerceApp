package com.sec.services.ventes.search;

import java.util.Optional;

import com.sec.model.ventes.Produits;

public interface ProduitSearchInterface {
	
	Optional<Produits> searchByCategorie(String categorie);
	Optional<Produits> searchByDescriptionContaining(String description);

}
