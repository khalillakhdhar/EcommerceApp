package com.sec.services.ventes.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sec.model.ventes.Taxes;
import com.sec.repositories.vente.crud.TaxesRepository;


@Service
public class TaxeCrudImplement {
@Autowired
TaxesRepository taxerepository;


public Taxes addTaxes(Taxes t) {
	return taxerepository.save(t);
	
}

public List<Taxes> showTaxes() {
	// TODO Auto-generated method stub
	return (List<Taxes>) taxerepository.findAll();

}

}
