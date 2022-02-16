package com.sec.services.ventes.search;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sec.model.ventes.Produits;
import com.sec.repositories.vente.search.ProduitSearchRepository;

@Service
public class ProduitSearchImplement implements ProduitSearchInterface{
@Autowired
ProduitSearchRepository produitSearchRepository;


	@Override
	public Optional<Produits> searchByCategorie(String categorie) {
		// TODO Auto-generated method stub
		return produitSearchRepository.findByCategorie(categorie);
	}

	@Override
	public Optional<Produits> searchByDescriptionContaining(String description) {
		// TODO Auto-generated method stub
		return produitSearchRepository.findByDescriptionContaining(description);
	}

}
