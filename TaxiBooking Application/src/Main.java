import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        while (true) {
            System.out.println("Welcome to Taxi booking system");
            System.out.println("(1) Book a Taxi");
            System.out.println("(2) Display details");
            System.out.println("(3) Exit");

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            switch (n) {
                case 1 : {
                    System.out.println("Available locations are (A, B, C, D, E, F) \nChoose the Pickup location?");
                    char pickupLocation = sc.next().charAt(0);
                    System.out.println("Enter the Drop Location");
                    char dropLocation = sc.next().charAt(0);
                    System.out.println("Enter the time");
                    int pickupTime = sc.nextInt();
                    System.out.println(TaxiBooking.booking(pickupLocation, dropLocation, pickupTime));
                    break;
                }

                case 2 : {
                    TaxiBooking.display();
                }

                case 3 : {
                    System.out.println("Thank you for using our application");
                    break;
                }
            }
        }
    }
}