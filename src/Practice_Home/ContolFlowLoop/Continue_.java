package Practice_Home.ContolFlowLoop;

import java.util.Scanner;

public class Continue_ {
    public static void main(String[] args) {

    /*
        // Example: Print Even number:
        for (int i=1; i<=10; ++i){
            // Condition to Check Odd number:
            if (i % 2 != 0){
                continue;
            }
            System.out.println("Even Number is: " + i);
        }

     */
        // Using Continue : Print Odd number:
    /*
        for (int i=1;i<=10;i++){
            if (i % 2 == 0){
                continue;
            }
            System.out.println("Odd Number is: " + i);
        }

     */
//         solution : Print Even and Odd number :
    /*
        System.out.println("Even numbers:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Odd numbers:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

     */
//        solution 2
    /*
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is Even");
            } else {
                System.out.println(i + " is Odd");
            }
        }

     */
//        Solution 3
    /*
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is Even");
                continue; // Skip to next iteration
            }
            System.out.println(i + " is Odd");
        }

     */
//        Using Continue Statement : Example : Print Odd number between 1 and n:
//        System.out.print("Input a number: ");
//        int n = new Scanner(System.in).nextInt();  or u can:
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: "); // number = n
        int n = input.nextInt();
        for (int i=1;i<=n;i++){
            // Check Even number:
            if (i % 2 == 0){
                continue;
            }
            System.out.println("Odd Number is: " + i);
        }
    }
}
