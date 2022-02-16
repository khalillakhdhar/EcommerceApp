package com.sec.services.ventes.crud;

import java.util.List;
import java.util.Optional;

import com.sec.model.ventes.Taxes;

public interface TaxeCrudInterface {
	Taxes addTaxes(Taxes u);
	List<Taxes> showTaxess();
	Optional<Taxes> findTaxesByid(long id);
	void deleteTaxes(long id);
}
