package com.sec.services.ventes.search;

import java.util.Optional;

import com.sec.model.ventes.Produits;

public interface ProduitSearchInterface {
	Optional<Produits> searchCategorie(String categorie);
	Optional<Produits> searchDescriptionContaining(String description);

}
