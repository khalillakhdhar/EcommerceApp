package com.sec.services.communication;

import java.util.Date;
import java.util.Optional;

import com.sec.model.comunication.Message;
import com.sec.model.users.User;

public interface MessageSearchInterface  {
	Optional<Message> SearchDateheur(Date dateheur);
	Optional<Message> SearchEmetteur(User emetteur);
	Optional<Message> SearchRecepteur(User recepteur);
	Optional<Message> SearchRecepteurAndEmetteur(User recepteur,User emetteur);
	Optional<Message> SearchTexteContaining(String texte);
}
