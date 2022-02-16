package com.sec.particulier;

import java.util.List;

import com.sec.particulier.testInterfaces.ProduitTestInterface;

public class ProduitTestImplement implements ProduitTestInterface {

	@Override
	public boolean validationCategorie(String categorie, List<String> listCat) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validationPrix(float prix) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validationStock(int stock) {
		// TODO Auto-generated method stub
		return false;
	}

}
