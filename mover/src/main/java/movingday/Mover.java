package movingday;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;
import java.util.Date;

@Entity
@Table(name="Mover_table")
public class Mover {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long moverId;
    private Long movingId;
    private String phoneNumber;
    private Date moverDate;
    private Long paymentId;

    @PostPersist
    public void onPostPersist(){
        MovingStarted movingStarted = new MovingStarted();
        BeanUtils.copyProperties(this, movingStarted);
        movingStarted.publishAfterCommit();


    }


    public Long getMoverId() {
        return moverId;
    }

    public void setMoverId(Long moverId) {
        this.moverId = moverId;
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
    public Date getMoverDate() {
        return moverDate;
    }

    public void setMoverDate(Date moverDate) {
        this.moverDate = moverDate;
    }
    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }




}
