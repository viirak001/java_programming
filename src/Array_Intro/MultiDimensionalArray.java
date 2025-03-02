package Array_Intro;

import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
    /*
         Integer [][] matrix = {{1,2},{3}};
        System.out.println("Row of matrix: " + matrix.length);
        System.out.println("Column number of first row: "+ matrix[0].length);
        System.out.println("Column number of second row: " + matrix[1].length);

     */
//        Example:
        /**
         * Creating an array 2D of string that has the following:
         * First row has no column
         * Second row has 3 column
         * Third row has 1 column
         */
        /*
        String [][] arr = {{},{"a","b","c"},{"d"}};
        System.out.println("Total row: " + arr.length);
        System.out.println("First row has no column: " + arr[0].length);
        System.out.println("Second row has 3 column: " + arr[1].length);
        System.out.println("Third row has 1 column: " + arr[2].length);

         */
//        Example:
        /**
         * Create a 2D array of Double that has 0 row
         * first row has two column
         */
        /*
        Double [][] empty = {};
        System.out.println(empty.length);

         */
//
         /*
        Character [][] colorValue =
                {
                        {'A', 'B'},
                        {'C', 'D'},
                        {'E','F','G','H'}
                };
        for(int i=0;i<colorValue.length;i++){
            for(int j=0;j<colorValue[i].length;j++){
                System.out.print(colorValue[i][j] + " | ");
            }
            System.out.println();
        }

          */
        System.out.print("[+] Insert number of row: ");
        int rowNumber = new Scanner(System.in).nextInt();
        System.out.print("[+] Insert number of column: ");
        int columnNumber = new Scanner(System.in).nextInt();
        String [][]  hall = new String[rowNumber][columnNumber];
        // generate seat code
        char characterSeat = 'A';
//        int seatCode;
        //
        for(int i=0;i<hall.length;i++){
           int seatCode=1;
            for(int j=0;j<hall[i].length;j++){
                hall[i][j] = characterSeat + "-" + seatCode + " :AV";
                seatCode++;
            }
            characterSeat++;
        }
        while (true){
            // showing hall list after insert:
            for(int i=0;i<hall.length;i++){
                for(int j=0;j<hall[i].length;j++){

                    // condition: showing | :
                    if(j==0){
                        System.out.print("| ");
                    }
                    System.out.print(hall[i][j] + " | ");
                }
                System.out.println();
            }

            // start booking
            System.out.print("[+] Insert seat code to book (A-1, B-1): ");
            String code = new Scanner(System.in).nextLine();

            // start checking entered seat code
            boolean isFoundSeat = false;
            for(int i=0;i<hall.length;i++){
                for(int j=0;j<hall[i].length;j++){

                    // we use split for broken
                    String [] splitCode = hall[i][j].split(":");
                    if(splitCode[0].trim().equalsIgnoreCase(code)){   // using trim() for space

                        // checking user booked
                        isFoundSeat = true;
                        if (splitCode[1].trim().equalsIgnoreCase("BO")){
                            System.out.print("This seat has been booked.");
                            System.exit(0);
                        }
                        hall[i][j] = splitCode[0] + ":BO";
                    }
                }
            }
            // checking seat found
            if (!isFoundSeat){
                System.out.print("Seat you booked has not been found.");
                System.exit(0);
            }

            // showing hall list after booking:
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
            System.out.println(">>> Press any key for continue <<<");
            new Scanner(System.in).nextLine();
        }
//        Date.from(Instant.now()); // release date time
/// homework date 23 - 24
/**
 * List option as below
 * 1. set up hall
 * 2. start booking
 * 3. cancel booking seat : show list want cancel then ...
 * 4. view history : note date , time, seat number
 * 5. Exit
 */



    }
}
