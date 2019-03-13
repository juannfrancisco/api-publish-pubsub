package cl.zenta.ar.poc.app.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate;
import org.springframework.stereotype.Service;

@Service
public class PublishMessageServices {


    @Autowired
    private PubSubTemplate pubSubTemplate;


    public void publish( String message ) {

        pubSubTemplate.publish("messages", message);

    }
}
