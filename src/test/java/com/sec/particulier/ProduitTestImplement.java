package com.sec.particulier;

import java.util.List;

import com.sec.particulier.testInterfaces.ProduitTestInterface;

public class ProduitTestImplement implements ProduitTestInterface {

	@Override
	public boolean validationCategorie(String categorie, List<String> listCat) {
		// TODO Auto-generated method stub
		return listCat.contains(categorie);
	}

	@Override
	public boolean validationPrix(float prix) {
		// TODO Auto-generated method stub
<<<<<<< Updated upstream
		return prix>0;
=======
		return prix > 0 ;
>>>>>>> Stashed changes
	}

	@Override
	public boolean validationStock(int stock) {
		// TODO Auto-generated method stub
<<<<<<< Updated upstream
		return stock>0;
=======
		return stock > 0;
>>>>>>> Stashed changes
	}

}
