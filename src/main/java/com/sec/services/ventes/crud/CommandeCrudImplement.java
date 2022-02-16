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
CommandeRepository commandeRepository;

	@Override
	public Commande addCommande(Commande u) {
		// TODO Auto-generated method stub
		return commandeRepository.save(u);
	}

	@Override
	public List<Commande> showCommandes() {
		// TODO Auto-generated method stub
		return (List<Commande>) commandeRepository.findAll();
	}

	@Override
	public Optional<Commande> findCommandeByid(long id) {
		// TODO Auto-generated method stub
		return commandeRepository.findById(id);
	}

	@Override
	public void deleteCommande(long id) {
		// TODO Auto-generated method stub
		commandeRepository.deleteById(id);
		
	}

}
