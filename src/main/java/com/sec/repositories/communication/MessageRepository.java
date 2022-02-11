package com.sec.repositories.communication;

import org.springframework.data.repository.CrudRepository;

import com.sec.model.comunication.Message;

public interface MessageRepository extends CrudRepository<Message, Long> {

}
