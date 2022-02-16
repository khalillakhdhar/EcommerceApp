package com.sec.particulier;

import java.util.List;

import com.sec.model.ventes.Produits;
import com.sec.particulier.testInterfaces.CommandeTestInterface;

public class CommandeTestImplement implements CommandeTestInterface {

	@Override
	public boolean validationProduits(List<Produits> produits) {
		// TODO Auto-generated method stub
		return produits.isEmpty();
	}

}
