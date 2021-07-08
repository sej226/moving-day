package movingday.external;

public class Payment {

    private Long paymentId;
    private Long movingId;
    private String movingStatus;
    private String phoneNumber;

    public Long getPaymentId() {
        return paymentId;
    }
    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }
    public Long getMovingId() {
        return movingId;
    }
    public void setMovingId(Long movingId) {
        this.movingId = movingId;
    }
    public String getMovingStatus() {
        return movingStatus;
    }
    public void setMovingStatus(String movingStatus) {
        this.movingStatus = movingStatus;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
