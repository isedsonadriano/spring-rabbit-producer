package br.com.iedsonadriano.spring.producer.service;

import br.com.iedsonadriano.spring.producer.amqp.AmqpProducer;
import br.com.iedsonadriano.spring.producer.dto.Message;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class AmqpServiceImpl implements  IAmqpService {

    @Inject
    private AmqpProducer<Message> amqp;

    @Override
    public void sendToConsumer(Message message) {
        amqp.producer(message);
    }
}
