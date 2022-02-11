package com.sec.model.comunication;

import java.util.Date;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

import com.sec.model.users.User;

public class Message {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
	@NotBlank
     private String texte;
	@NotBlank
    private String type;
	@NotBlank
    private Date dateheur;
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "id", nullable = false)
	private User user ;
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTexte() {
		return texte;
	}
	public void setTexte(String texte) {
		this.texte = texte;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getDateheur() {
		return dateheur;
	}
	public void setDateheur(Date dateheur) {
		this.dateheur = dateheur;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	


}
