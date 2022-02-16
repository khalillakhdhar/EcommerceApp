package com.sec.services.ventes.crud;

import java.util.List;

import com.sec.model.ventes.Commande;


public interface commandeCrudInterface {
	Commande addCommande(Commande c);
	List<Commande> showCommandes();
}
