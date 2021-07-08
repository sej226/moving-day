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
    @Autowired MovingRepository movingRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverMovingStarted_MovingModified(@Payload MovingStarted movingStarted){

        if(!movingStarted.validate()) return;

        System.out.println("\n\n##### listener MovingModified : " + movingStarted.toJson() + "\n\n");

        // Sample Logic //
        Moving moving = new Moving();
        movingRepository.save(moving);
            
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverPaymentCanceled_MovingModified(@Payload PaymentCanceled paymentCanceled){

        if(!paymentCanceled.validate()) return;

        System.out.println("\n\n##### listener MovingModified : " + paymentCanceled.toJson() + "\n\n");

        // Sample Logic //
        Moving moving = new Moving();
        movingRepository.save(moving);
            
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}


}
