package com.sec.services.communication;

import java.util.List;

import com.sec.model.comunication.Message;

public interface MessageCrudInterface {
Message addMessage(Message m);
List<Message> showListMessage();
void DeleteMessage(int id);
}
