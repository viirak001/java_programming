package Method_Intro;

import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class SeatBooking {
    // emoji : start + V
    public static void menu(){
        System.out.print("""
                    👉 List Option as below :
                        1. Set up Hall.
                        2. Start Booking.
                        3. Cancel booked Seat.
                        4. View History.
                        5.Exit.
                    """);
    }

//  Checking Option:
    public static void callingOption(){
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("-".repeat(30));
            System.out.print("👉 Input List Option: ");
            int option = input.nextInt();

            switch (option) {
                case 1: {
                    setup();
                    pressKey();
                    break;
                }
                case 2: {
                    booking();
                    pressKey();
                    break;
                }
                case 3:{
                    cancelBooking();
                    pressKey();
                    break;
                }
                case 4:{
                    viewHistory();
                    pressKey();
                    break;
                }
                case 5:{
                    System.out.println("        >> Good 👊👊👊 Bye <<");
                    System.exit(0);
                }
                default:
                    System.out.println(" 😤 Option Invalid 😒😒😒 >> PLease try again <<");
            }
        }

    }

    public static String[][] hall;
    public static int rowNumber;
    public static int columnNumber;

//  Set up the Hall:
    public static void setup(){
        Scanner input = new Scanner(System.in);
        System.out.print(" 👉 Insert Row: ");
        rowNumber = input.nextInt();
        System.out.print(" 👉 Insert Column: ");
        columnNumber = input.nextInt();
        hall = new String[rowNumber][columnNumber];
        char names = 'A';
        for (int i = 0; i < hall.length; i++) {
            int seatcode = 1;
            for (int j = 0; j < hall[i].length; j++) {
                hall[i][j] = names + "-" + seatcode + " : ST";
                seatcode++;
            }
            names++;
        }
        designDisply();
        dateTime();
    }

//  showing design display:
    public static void designDisply(){
        for(int i=0;i<hall.length;i++) {
            for (int j = 0; j < hall[i].length; j++) {
                if (j == 0) {
                    System.out.print("| ");
                }
                System.out.print(hall[i][j] + " | ");
            }
            System.out.println();
        }
    }

//  Start Booking Seat:
    public static void booking(){
            Scanner input = new Scanner(System.in);
            System.out.print(" 👉 Insert name for booking now: ");
            String namess = input.nextLine(); //toUpperCase()

            boolean isFoundSeat = false;
            for (int i=0;i<hall.length;i++){
                for (int j=0;j< hall[i].length;j++){
                    String[] spliteCode = hall[i][j].split(":");
                    if (spliteCode[0].trim().equalsIgnoreCase(namess)){
                        isFoundSeat = true;
                        if (spliteCode[1].trim().equalsIgnoreCase("BK")){
                            System.out.println(" 🙄 This seat has been booked! Please try booking again...");
                            return;
                        }
                        hall[i][j] = spliteCode[0] + ": BK";
//                        break;
                    }
                }
            }
            if (!isFoundSeat){
                System.out.println("This seat invalid 😑 ");
                System.exit(0);
            }
            designDisply();
            dateTime();
    }

//  Cancel Booking Seat:
    public static void cancelBooking(){
        Scanner input = new Scanner(System.in);
        System.out.print(" 👉 Insert seat to cancel booking: ");
        String cancelBooking = input.nextLine();

        boolean cancelBoo = false;
        for (int i=0;i< hall.length;i++){
            for (int j=0;j<hall[i].length;j++){
                String[] spliteCancel = hall[i][j].split(":");
                if (spliteCancel[0].trim().equalsIgnoreCase(cancelBooking)){

                    cancelBoo = true;
                    if (spliteCancel[1].trim().equalsIgnoreCase("ST")){
                        System.out.println("Has been canceled");
                    }
                    hall[i][j] = spliteCancel[0] + ": ST";
                }
            }
        }
        if (!cancelBoo){
            System.out.println("Booking found");
            System.exit(0);
        }
        designDisply();
        dateTime();
    }

//  View History Seat:
    public static void viewHistory(){
//        Scanner input = new Scanner(System.in);
        System.out.println(" 👉 History Booking: ");

        boolean isFoundHistory = false;
        for (String[] row : hall){
            for (String seat : row){
                if (seat.endsWith("BK")){

                    isFoundHistory = true;
                    System.out.println(seat + " " );
                    dateTime();
                }
            }
        }
        if (!isFoundHistory){
            System.out.println(" 🤦‍♀️ Booking history is found");
        }else {
            System.out.println();
        }

    }

//    Datetime:
    public static void dateTime(){
        Date dateTimes = Date.from(Instant.now());
        System.out.println(dateTimes);
    }

//  Key for Continue:
    public static void pressKey(){
        System.out.print(" 👉 >>> Press any key for continue <<<");
        new Scanner(System.in).nextLine();
    }

//  Calling Class:
    public static void main(String[] args) {
        menu();
        callingOption();

    }
}
