package com.sec.model.ventes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Taxes {
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY )
private long id;
private double valeur;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public double getValeur() {
	return valeur;
}
public void setValeur(double valeur) {
	this.valeur = valeur;
}



}
