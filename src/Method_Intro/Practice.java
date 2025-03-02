package Method_Intro;

import javax.swing.text.html.StyleSheet;
import java.util.Scanner;

public class Practice {
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
//
    public static void callingOption(){
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("-".repeat(30));
            System.out.print("👉 Input List Option: ");
            int option = input.nextInt();

            switch (option) {
                case 1: {
                    System.out.print("Insert Row: ");
                    int rowNumber = input.nextInt();
                    System.out.print("Insert Column: ");
                    int columnNumber = input.nextInt();
                    String[][] hall = new String[rowNumber][columnNumber];
                    char names = 'A';
                    for (int i = 0; i < hall.length; i++) {
                        int seatcode = 1;
                        for (int j = 0; j < hall[i].length; j++) {
                            hall[i][j] = names + ":" + seatcode + "A";
                            seatcode++;
                        }
                        names++;
                    }
                    for(int i=0;i<hall.length;i++){
                        for(int j=0;j<hall[i].length;j++){

                            // condition: to showing |  :
                            if(j==0){
                                System.out.print("| ");
                            }
                            System.out.print(hall[i][j] + " | ");
                        }
                        System.out.println();
                    }
                    break;
                }
                case 2: {
                    System.out.print("Booking: ");
                    String name = input.nextLine();
                    boolean booked = false;


                }
            }
        }

    }


    public static void pressKey(){
        System.out.print(">>> Press any key for continue <<<");
        new Scanner(System.in).nextLine();
    }


    public static void main(String[] args) {
        menu();
        callingOption();
        pressKey();



    }
}
