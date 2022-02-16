package com.sec.particulier.testInterfaces;

import java.util.List;

import com.sec.model.ventes.Produits;

public interface CommandeTestInterface {
boolean validationProduits(List<Produits> produits);
}
