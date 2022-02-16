package com.sec.services.communication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sec.model.comunication.Message;
import com.sec.repositories.communication.MessageRepository;

@Service
public class MessageCrudImplement implements MessageCrudInterface {
@Autowired
MessageRepository messageRepository;


	@Override
	public Message addMessage(Message m) {
		// TODO Auto-generated method stub
		return messageRepository.save(m);
	}

	@Override
	public List<Message> showListMessage() {
		// TODO Auto-generated method stub
		return (List<Message>) messageRepository.findAll();
	}

	@Override
	public void DeleteMessage(long id) {
		// TODO Auto-generated method stub
		messageRepository.deleteById(id);
	}

}
