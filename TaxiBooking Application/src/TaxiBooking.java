import java.util.ArrayList;

public class TaxiBooking {

    private static ArrayList<Taxi> taxiList = new ArrayList<>();
    private static ArrayList<Taxi> taxiBookedHistory = new ArrayList<>();
    private static int limit = 2;
    private static int customerId = 1;

    public static String booking (char pickupLocation, char dropLocation, int pickupTime) throws CloneNotSupportedException{

        if (taxiList.size() < limit) {
            taxiList.add(new Taxi());
        }

        Taxi taxiReady = null;
        int min = Integer.MAX_VALUE;

        for (Taxi t : taxiList) {
            if (t.getDropTime() <= pickupTime && Math.abs(pickupLocation - t.getCurrentLocation()) < min) {
                taxiReady = t;
                min = pickupLocation - t.getCurrentLocation();
            }
        }

        if(taxiReady != null) {
            taxiReady.setCustomerId(customerId++);
            taxiReady.setPickupLoaction(pickupLocation);
            taxiReady.setDropLocation(dropLocation);
            taxiReady.setPickupTime(pickupTime);
            taxiReady.setTaxiId(taxiList.indexOf(taxiReady) + 1);
            taxiReady.setCurrentLocation(dropLocation);
            taxiReady.setDropTime(pickupTime + (dropLocation - pickupLocation));
            taxiReady.setEarings((taxiReady.getEarings() + Math.abs(dropLocation - pickupLocation)*15-5)*10 + 100);
            taxiBookedHistory.add((Taxi)taxiReady.clone());
        }

        return (taxiReady != null) ? "Taxi " + taxiReady.getTaxiId() + " Booked Successfully" : "Taxis are not available now";

    }

    public static void display () {
        System.out.println("------------------------------------------------");
        for (Taxi t : taxiBookedHistory) {
            System.out.println(t.toString());
        }
    }
 }
