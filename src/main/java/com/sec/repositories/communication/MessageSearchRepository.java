package com.sec.repositories.communication;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sec.model.comunication.Message;
import com.sec.model.users.User;

public interface MessageSearchRepository extends JpaRepository<Message, Long> {
Optional<Message> findByDateheur(Date dateheur);
Optional<Message> findByEmetteur(User emetteur);
Optional<Message> findByRecepteur(User recepteur);
Optional<Message> findByRecepteurAndEmetteur(User recepteur,User emetteur);
Optional<Message> findByTexteContaining(String texte);

}
