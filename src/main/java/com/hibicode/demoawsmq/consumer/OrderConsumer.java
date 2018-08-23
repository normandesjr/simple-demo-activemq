package com.hibicode.demoawsmq.consumer;

import com.hibicode.demoawsmq.model.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import javax.jms.Session;

@Component
public class OrderConsumer {

    private static Logger log = LoggerFactory.getLogger(OrderConsumer.class);

    @JmsListener(destination = "order-queue", containerFactory = "queueListenerFactory")
    public void receiveOrder(@Payload Order order, @Headers MessageHeaders headers,
                             Message message, Session session) {
        log.info("Received <" + order + ">");

        log.info("- - - - - - - - - - - - - - - - - - - - - - - -");
        log.info("######          Message Details           #####");
        log.info("- - - - - - - - - - - - - - - - - - - - - - - -");
        log.info("headers: " + headers);
        log.info("message: " + message);
        log.info("session: " + session);
        log.info("- - - - - - - - - - - - - - - - - - - - - - - -");
    }

}
