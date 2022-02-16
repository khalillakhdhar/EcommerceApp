package com.sec.services.ventes.crud;

import java.util.List;
import java.util.Optional;

import com.sec.model.ventes.Produits;


public interface ProduitCrudInterface {
	Produits addProduit(Produits u);
	List<Produits> showProduits();
	Optional<Produits> findProduitByid(long id);
	void deleteProduit(long id);

}