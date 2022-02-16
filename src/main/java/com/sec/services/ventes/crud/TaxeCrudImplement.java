package com.sec.services.ventes.crud;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sec.model.ventes.Taxes;
import com.sec.repositories.vente.crud.TaxesRepository;

@Service
public class TaxeCrudImplement implements TaxeCrudInterface{
@Autowired
TaxesRepository taxesRepository;
	@Override
	public Taxes addProduit(Taxes u) {
		// TODO Auto-generated method stub
		return taxesRepository.save(u);
	}

	@Override
	public List<Taxes> showTaxe() {
		// TODO Auto-generated method stub
		return (List<Taxes>) taxesRepository.findAll();
	}

	@Override
	public Optional<Taxes> findProduitByid(long id) {
		// TODO Auto-generated method stub
		return taxesRepository.findById(id);
	}

	@Override
	public void deleteTaxes(long id) {
		// TODO Auto-generated method stub
		taxesRepository.deleteById(id);
	}

}
