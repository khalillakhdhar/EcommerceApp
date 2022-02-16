package com.sec.services.ventes.crud;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sec.model.ventes.Produits;
import com.sec.repositories.vente.crud.ProduitRepository;


@Service
public class ProduitCrudImplement implements ProduitCrudInterface {

	@Autowired
	ProduitRepository produitrepository;

	@Override
	public Produits addProduit(Produits u) {
		// TODO Auto-generated method stub
		return produitrepository.save(u);
	}

	@Override
	public List<Produits> showProduits() {
		// TODO Auto-generated method stub
		return (List<Produits>) produitrepository.findAll();
	}

	@Override
	public Optional<Produits> findProduitByid(long id) {
		// TODO Auto-generated method stub
		return produitrepository.findById(id);
	}

	@Override
	public void deleteProduit(long id) {
		// TODO Auto-generated method stub
		produitrepository.deleteById(id);
	}
		
		
	
	}
