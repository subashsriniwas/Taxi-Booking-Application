import java.util.Objects;

public class Taxi implements Cloneable{

    private char currentLocation = 'A';
    private int customerId;
    private int taxiId;
    private char pickupLoaction;
    private char dropLocation;
    private int pickupTime;
    private int dropTime;
    private int earings;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public char getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(char currentLocation) {
        this.currentLocation = currentLocation;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getTaxiId() {
        return taxiId;
    }

    public void setTaxiId(int taxiId) {
        this.taxiId = taxiId;
    }

    public char getPickupLoaction() {
        return pickupLoaction;
    }

    public void setPickupLoaction(char pickupLoaction) {
        this.pickupLoaction = pickupLoaction;
    }

    public char getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(char dropLocation) {
        this.dropLocation = dropLocation;
    }

    public int getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(int pickupTime) {
        this.pickupTime = pickupTime;
    }

    public int getDropTime() {
        return dropTime;
    }

    public void setDropTime(int dropTime) {
        this.dropTime = dropTime;
    }

    public int getEarings() {
        return earings;
    }

    public void setEarings(int earings) {
        this.earings = earings;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Taxi{" +
                ", taxiId=" + taxiId +
                ", currentLocation=" + currentLocation +
                ", customerId=" + customerId +
                ", pickupLoaction=" + pickupLoaction +
                ", dropLocation=" + dropLocation +
                ", pickupTime=" + pickupTime +
                ", dropTime=" + dropTime +
                ", earings=" + earings +
                '}';
    }
}
