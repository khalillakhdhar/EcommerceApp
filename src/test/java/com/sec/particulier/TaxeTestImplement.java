package com.sec.particulier;

import com.sec.particulier.testInterfaces.TaxeTestInterface;

public class TaxeTestImplement implements TaxeTestInterface {

	@Override
	public boolean validationTaxe(double taxes) {
		// TODO Auto-generated method stub

		return taxes>0;
	}

}
