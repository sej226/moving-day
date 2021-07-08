
package movingday;

public class MovingRegistered extends AbstractEvent {

    private Long movingID;
    private String phoneNumber;
    private Long qty;
    private String movingStatus;
    private Date movingDate;

    public Long getId() {
        return movingID;
    }

    public void setId(Long movingID) {
        this.movingID = movingID;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Long getMovingCnt() {
        return qty;
    }

    public void setMovingCnt(Long qty) {
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

