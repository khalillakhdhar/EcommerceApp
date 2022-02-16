package com.sec.services.ventes.crud;

import java.util.List;
import java.util.Optional;

import com.sec.model.ventes.Commande;


public interface CommandeCrudInterface {
	Commande addCommande(Commande u);
	List<Commande> showCommandes();
	Optional<Commande> findCommandeByid(long id);
	void deleteCommande(long id);

}
