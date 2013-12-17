/**
 * Created by hsbacot on 12/16/13.
 */
import java.util.Scanner;

public class ReservationApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What time do you want to eat?");
        int time = scanner.nextInt();

        System.out.println("What is your name?");
        String name = scanner.next();

        System.out.println("How many people are in your party?");
        int party = scanner.nextInt();

        Reservation reso = new Reservation();
        reso.setName(name);
        reso.setParty(party);
        reso.setTime(time);

        System.out.print(reso.getParty());
    }

}
