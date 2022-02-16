package com.sec.particulier.testInterfaces;

import java.util.List;

public interface ProduitTestInterface {
boolean validationCategorie(String categorie, List<String> listCat);
boolean validationPrix(float prix);
boolean validationStock(int stock);
}
