package br.com.iedsonadriano.spring.producer.api;

import br.com.iedsonadriano.spring.producer.dto.Message;
import br.com.iedsonadriano.spring.producer.service.IAmqpService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
public class AmqpApi {

    @Inject
    private IAmqpService service;

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PostMapping("/send")
    public void sendToConsumer(@RequestBody Message message){
        this.service.sendToConsumer(message);
    }

}
