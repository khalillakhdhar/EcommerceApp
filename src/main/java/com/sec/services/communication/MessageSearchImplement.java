package com.sec.services.communication;

import java.util.Date;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sec.model.comunication.Message;
import com.sec.model.users.User;

@Service
public class MessageSearchImplement implements MessageSearchInterface {

	@Override
	public Optional<Message> SearchDateheur(Date dateheur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Message> SearchEmetteur(User emetteur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Message> SearchRecepteur(User recepteur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Message> SearchRecepteurAndEmetteur(User recepteur, User emetteur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Message> SearchTexteContaining(String texte) {
		// TODO Auto-generated method stub
		return null;
	}


}
