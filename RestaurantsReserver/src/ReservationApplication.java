/**
 * Created by hsbacot on 12/16/13.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ReservationApplication {

    public static void main(String[] args) {

        boolean moreReservations = true;
        boolean source = false;
        ArrayList<Object> reservations = new ArrayList<Object>();

        while (moreReservations) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Would you like to make a reservation? (Y/n)");
            String again = scanner.next();
            if (again == "n") {
                moreReservations = false;
            } else {
//                Scanner scanner = new Scanner(System.in);
                System.out.println("Would you like make your reservation by phone or online? (phone/online)");
                String type = scanner.next();
                if (type == "phone") {
                    source = true;
                }

                    if (source) {
                        System.out.println("What time do you want to eat?");
                        int time = scanner.nextInt();

                        System.out.println("What is your name?");
                        String name = scanner.next();

                        System.out.println("How many people are in your party?");
                        int party = scanner.nextInt();

                        System.out.println("What phone number can we reach you at?");
                        String phone = scanner.next();

                        PhoneReservation reso = new PhoneReservation();
                        reso.setName(name);
                        reso.setParty(party);
                        reso.setTime(time);
                        reso.setPhoneNumber(phone);
                        reservations.add(reso);
                    } else {
                        System.out.println("What time do you want to eat?");
                        int time = scanner.nextInt();

                        System.out.println("What is your name?");
                        String name = scanner.next();

                        System.out.println("How many people are in your party?");
                        int party = scanner.nextInt();

                        System.out.println("What phone number can we reach you at?");
                        String phone = scanner.next();

                        System.out.println("What is the source address of the restaurant's website?");
                        String url = scanner.next();

                        WebReservation reso = new WebReservation();
                        reso.setName(name);
                        reso.setParty(party);
                        reso.setTime(time);
                        reso.setContactNumber(phone);
                        reso.setSourceWebsite(url);
                        reservations.add(reso);
                    }
                System.out.println(reservations);
            }
        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What time do you want to eat?");
//        int time = scanner.nextInt();
//
//        System.out.println("What is your name?");
//        String name = scanner.next();
//
//        System.out.println("How many people are in your party?");
//        int party = scanner.nextInt();
//
//        Reservation reso = new Reservation();
//        reso.setName(name);
//        reso.setParty(party);
//        reso.setTime(time);
//
//        System.out.print(reso.getParty());
    }

}
