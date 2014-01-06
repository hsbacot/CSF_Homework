/**
 * Created by hsbacot on 1/6/14.
 */
public class WebReservation extends Reservation {
    private String contactNumber;
    private String sourceWebsite;

    public String getSourceWebsite() {
        return sourceWebsite;
    }

    public void setSourceWebsite(String sourceWebsite) {
        this.sourceWebsite = sourceWebsite;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
