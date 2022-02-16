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
ProduitRepository  produitRepository;

	@Override
	public Produits addProduit(Produits u) {
		// TODO Auto-generated method stub
		return produitRepository.save(u);
	}

	@Override
	public List<Produits> showProduits() {
		// TODO Auto-generated method stub
		return (List<Produits>) produitRepository.findAll();
	}

	@Override
	public Optional<Produits> findProduitsByid(long id) {
		// TODO Auto-generated method stub
		return produitRepository.findById(id);
	}

	@Override
	public void deleteProduits(long id) {
		// TODO Auto-generated method stub
		produitRepository.deleteById(id);
	}

}
