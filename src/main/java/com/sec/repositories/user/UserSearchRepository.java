package com.sec.repositories.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sec.model.users.User;

public interface UserSearchRepository extends JpaRepository<User, Long> {
Optional<User> findByAdresse(String adresse);
Optional<User> findByTelephone(String telephone);
Optional<User> findByAge(String age);
Optional<User> findByNom(String nom);
Optional<User> findByPrenom(String prenom);

Optional<User> findByEmail(String email);
Optional<User> findByEmailAndPassword(String email,String password);
}
