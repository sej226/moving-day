package movingday;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;
import java.util.Date;

@Entity
@Table(name="Moving_table")
public class Moving {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long movingId;
    private String phoneNumber;
    private Long qty;
    private String movingStatus;
    private Date movingDate;

    @PostPersist
    public void onPostPersist(){
        MovingRegistered movingRegistered = new MovingRegistered();
        BeanUtils.copyProperties(this, movingRegistered);
        movingRegistered.publishAfterCommit();

        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.

        movingday.external.Payment payment = new movingday.external.Payment();
        // mappings goes here
        Application.applicationContext.getBean(movingday.external.PaymentService.class)
            .payMoving(payment);


        MovingCanceld movingCanceld = new MovingCanceld();
        BeanUtils.copyProperties(this, movingCanceld);
        movingCanceld.publishAfterCommit();


    }


    public Long getMovingId() {
        return movingId;
    }

    public void setMovingId(Long movingId) {
        this.movingId = movingId;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Long getQty() {
        return qty;
    }

    public void setQty(Long qty) {
        this.qty = qty;
    }
    public String getMovingStatus() {
        return movingStatus;
    }

    public void setMovingStatus(String movingStatus) {
        this.movingStatus = movingStatus;
    }
    public Date getMovingDate() {
        return movingDate;
    }

    public void setMovingDate(Date movingDate) {
        this.movingDate = movingDate;
    }




}
