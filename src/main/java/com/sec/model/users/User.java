package com.sec.model.users;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;

public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
	@Column(nullable = false)
     private String nom;
	@Column(nullable = false)
    private String prenom;

	@Column(nullable = false)
    @Email
    private String email;
	@Column(nullable = false)
    private String password;
	@Column(nullable = false)
    private String age;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Long id, String nom, String prenom, @Email String email, String password, String age, String adresse,
			String telephone, Grade grade) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.age = age;
		this.adresse = adresse;
		this.telephone = telephone;
		this.grade = grade;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	@Column(nullable = false)
    private String adresse;
	@Column(nullable = false)
    private String telephone;
	@Column(nullable = false)
	private Grade grade;
}
