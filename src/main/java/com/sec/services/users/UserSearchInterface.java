package com.sec.services.users;

import java.util.Optional;

import com.sec.model.users.User;

public interface UserSearchInterface {
	Optional<User> searchAdresse(String adresse);
	Optional<User> searchTelephone(String telephone);
	Optional<User> searchAge(String age);
	Optional<User> searchNom(String nom);
	Optional<User> searchPrenom(String prenom);

	Optional<User> searchEmail(String email);
	Optional<User> searchEmailAndPassword(String email,String password);
}
