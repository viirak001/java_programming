package Practice_Home.ContolFlowLoop;

import java.util.Scanner;

public class Break_ {
    public static void main(String[] args) {

    /*    // Using Break:
        for (int i=1; i<=5;++i){
            System.out.println(i);
            break;
        }

     */
        // Using Break:
    /*
        for (int i=1; i<=5; ++i){
            System.out.println(i);
            if (i==3){
                break;
            }
        }
        System.out.println("This is Outside the loop.");
     */
        // we created an example to calculate the sum of numbers until the user enters 0.
        // Using Break:
    /*
        Scanner input = new Scanner(System.in);
        double total=0;
        double number;
        while (true){
            System.out.print("Enter a Number: ");
            number = input.nextDouble();

            if (number == 0){
                break;
            }

            total = total+number;
        }
        System.out.println("Result Is: " + total);
        input.close();

     */
        // Using Break : Calculate sum until zero input:
        Scanner input = new Scanner(System.in);
        double total=0;
        double number;
        while (true){
            System.out.print("Enter a number: ");
            number = input.nextDouble();

            if (number == 0 || number < 0){
                break;
            }

            total = total+number;
        }
        System.out.println("Result Is: " + total);
    }
}
