
package movingday;

public class PaymentCanceled extends AbstractEvent {

    private Long paymentID;
    private Long movingID;
    private String paymentStatus;
    private String phoneNumber;

    public Long getId() {
        return paymentID;
    }

    public void setId(Long paymentID) {
        this.paymentID = paymentID;
    }
    public Long getMovingId() {
        return movingID;
    }

    public void setMovingId(Long movingID) {
        this.movingID = movingID;
    }
    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

