package com.sec.model.ventes;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Produits {
	

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "titre", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JsonProperty("titre")
	private Categorie cat;
	
	@Column(nullable = false)
	private String photo ;
	@Column(nullable = false)
	
	private String description ;
	@Column(nullable = false)
	private String categorie ;
	
	@Column(nullable = false)
	private double prix;
	
	@Column(name = "id_commande")
	private long idCommande;

}
