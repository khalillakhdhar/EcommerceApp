package com.sec.repositories.vente;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sec.model.ventes.Produits;

public interface ProduitSearchRepository extends JpaRepository<Produits, Long> {


}
