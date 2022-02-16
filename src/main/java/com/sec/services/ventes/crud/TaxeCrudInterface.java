package com.sec.services.ventes.crud;

import java.util.List;
import java.util.Optional;

import com.sec.model.ventes.Taxes;

public interface TaxeCrudInterface {
	Taxes addProduit(Taxes u);
	List<Taxes> showTaxe();
	Optional<Taxes> findProduitByid(long id);
	void deleteTaxes(long id);

}
