package com.sec.services.communication;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sec.model.comunication.Message;
import com.sec.model.users.User;
import com.sec.repositories.communication.MessageSearchRepository;

@Service
public class MessageSearchImplement implements MessageSearchInterface {
	@Autowired
	MessageSearchRepository messageSearchRepository;

	@Override
	public Optional<Message> SearchDateheur(Date dateheur) {
		// TODO Auto-generated method stub
		return messageSearchRepository.findByDateheur(dateheur);
	}

	@Override
	public Optional<Message> SearchEmetteur(User emetteur) {
		// TODO Auto-generated method stub
		return messageSearchRepository.findByEmetteur(emetteur);
	}

	@Override
	public Optional<Message> SearchRecepteur(User recepteur) {
		// TODO Auto-generated method stub
		return messageSearchRepository.findByRecepteur(recepteur);
	}

	@Override
	public Optional<Message> SearchRecepteurAndEmetteur(User recepteur, User emetteur) {
		// TODO Auto-generated method stub
		return messageSearchRepository.findByRecepteurAndEmetteur(recepteur, emetteur);
	}

	@Override
	public Optional<Message> SearchTexteContaining(String texte) {
		// TODO Auto-generated method stub
		return messageSearchRepository.findByTexteContaining(texte);
	}


}
