package br.com.iedsonadriano.spring.producer.amqp;

public interface AmqpProducer<T> {

    void producer(T t);

}
