package com.sec.services.users;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sec.model.users.User;
import com.sec.repositories.user.UserSearchRepository;


@Service
public class UserSearchImplement implements UserSearchInterface {
@Autowired
UserSearchRepository userSearchRepository;
	@Override
	public Optional<User> searchAdresse(String adresse) {
		// TODO Auto-generated method stub
		return userSearchRepository.findByAdresse(adresse);
	}

	@Override
	public Optional<User> searchTelephone(String telephone) {
		// TODO Auto-generated method stub
		return userSearchRepository.findByTelephone(telephone);
	}

	@Override
	public Optional<User> searchAge(String age) {
		// TODO Auto-generated method stub
		return userSearchRepository.findByAge(age);
	}

	@Override
	public Optional<User> searchNom(String nom) {
		// TODO Auto-generated method stub
		return userSearchRepository.findByNom(nom);
	}

	@Override
	public Optional<User> searchPrenom(String prenom) {
		// TODO Auto-generated method stub
		return userSearchRepository.findByPrenom(prenom);
	}

	@Override
	public Optional<User> searchEmail(String email) {
		// TODO Auto-generated method stub
		return userSearchRepository.findByEmail(email);
	}

	@Override
	public Optional<User> searchEmailAndPassword(String email, String password) {
		// TODO Auto-generated method stub
		return userSearchRepository.findByEmailAndPassword(email, password);
	}

}
