package com.sec.services.ventes.crud;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sec.model.ventes.Commande;

import com.sec.repositories.vente.crud.CommandeRepository;

@Service
public class CommandeCrudImplement implements CommandeCrudInterface {
	@Autowired
	CommandeRepository commanderepository;
	
	@Override
	public Commande addCommande(Commande c) {
		// TODO Auto-generated method stub
		return commanderepository.save(c);
	}

	@Override
	public List<Commande> showCommandes() {
		// TODO Auto-generated method stub
		return (List<Commande>) commanderepository.findAll();
	}

	@Override
	public Optional<Commande> findCommandeByid(long id) {
		// TODO Auto-generated method stub
		return commanderepository.findById(id);
	}

	@Override
	public void deleteCommande(long id) {
		// TODO Auto-generated method stub
		commanderepository.deleteById(id);
	}

}
