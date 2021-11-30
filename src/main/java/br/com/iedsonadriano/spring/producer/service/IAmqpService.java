package br.com.iedsonadriano.spring.producer.service;

import br.com.iedsonadriano.spring.producer.dto.Message;

public interface IAmqpService  {

    void sendToConsumer(Message message);
}
