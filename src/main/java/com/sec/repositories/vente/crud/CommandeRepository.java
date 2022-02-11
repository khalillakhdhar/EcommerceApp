package com.sec.repositories.vente.crud;

import org.springframework.data.repository.CrudRepository;

import com.sec.model.ventes.Commande;

public interface CommandeRepository extends CrudRepository<Commande, Long> {

}
