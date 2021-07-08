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
    @Autowired MoverRepository moverRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverPaymentApproved_ReceivedMovingInfo(@Payload PaymentApproved paymentApproved){

        if(!paymentApproved.validate()) return;

        System.out.println("\n\n##### listener ReceivedMovingInfo : " + paymentApproved.toJson() + "\n\n");

        // Sample Logic //
        Mover mover = new Mover();
        moverRepository.save(mover);
            
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}


}
