package com.sec.model.ventes;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.sec.model.users.User;

@Entity
public class Commande {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)

	private long id;
	
	private Produits[] produits;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "userid", nullable = false)
	private User user;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	

	public Produits[] getProduits() {
		return produits;
	}

	public void setProduits(Produits[] produits) {
		this.produits = produits;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	} 
	
	
	
	
	
	
	
}
