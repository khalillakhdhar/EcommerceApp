package com.sec.model.comunication;

import java.util.Date;

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

public class Message {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JsonProperty("id")
    private Long id; 
	
	@Column(nullable = false)
    private String texte;
	
	@Column(nullable = false)
    private Date dateheure;

	@Column(nullable = false)
    private String type;

	public Message(Long id, String texte, Date dateheure, String type) {
		super();
		this.id = id;
		this.texte = texte;
		this.dateheure = dateheure;
		this.type = type;
	}

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

	public Date getDateheure() {
		return dateheure;
	}

	public void setDateheure(Date dateheure) {
		this.dateheure = dateheure;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
