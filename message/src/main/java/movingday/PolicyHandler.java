package movingday;

import movingday.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverMovingCanceld_SendMessage(@Payload MovingCanceld movingCanceld){

        if(!movingCanceld.validate()) return;

        System.out.println("\n\n##### listener SendMessage : " + movingCanceld.toJson() + "\n\n");

        // Sample Logic //
            
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverMovingRegistered_SendMessage(@Payload MovingRegistered movingRegistered){

        if(!movingRegistered.validate()) return;

        System.out.println("\n\n##### listener SendMessage : " + movingRegistered.toJson() + "\n\n");

        // Sample Logic //
            
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverMovingStarted_SendMessage(@Payload MovingStarted movingStarted){

        if(!movingStarted.validate()) return;

        System.out.println("\n\n##### listener SendMessage : " + movingStarted.toJson() + "\n\n");

        // Sample Logic //
            
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverPaymentCanceled_SendMessage(@Payload PaymentCanceled paymentCanceled){

        if(!paymentCanceled.validate()) return;

        System.out.println("\n\n##### listener SendMessage : " + paymentCanceled.toJson() + "\n\n");

        // Sample Logic //
            
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}


}
