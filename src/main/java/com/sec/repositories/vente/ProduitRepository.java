package com.sec.repositories.vente;

import org.springframework.data.repository.CrudRepository;

import com.sec.model.ventes.Produits;

public interface ProduitRepository extends CrudRepository<Produits, Long> {

}
