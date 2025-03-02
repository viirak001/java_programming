package Practice_Home.ContolFlowLoop;

import java.util.Scanner;

public class LoopStatements {
    public static void main(String[] args) {
        /// printing number from 1 to 5 (following)
    /*
        int count = 1; // Declare count variable
        while (count <= 5){
            System.out.println("Count = " + count);

            count = count + 1; // it meaning: code ready print after (then) it count..
        }

     */
        ///1 to 5 but count + 1 and print it
    /*
        int count = 1; // Declare count variable
        while (count <= 5){
            count = count + 1; // it Count after it print
            System.out.println("Count = " + count);
        }

     */
        /// Reverse Countdown: number from 5 to 1 (following)
    /*
        int i = 5;
        while (i >= 1){
            System.out.println("i = " + i);
            i = i - 1;
        }

     */
        ///  Sum of Natural Numbers (The positive Integer Starting -
        /// - from 1,2,3,4,...etc. Called Natural Number. Form Sum: total = 1 + 2 + 3 + ... + n)
    /*
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Positive Number: ");

        int n =  input.nextInt();
        int total = 0;
        int i = 1;
        while (i<= n){
            total = total + i;
            i  = i + 1;
        }
        System.out.println("-".repeat(20));
        System.out.println("Result Is: " + total);
        input.close();

     */
        /// Sun of Number Until User Enter 0
    /*
        Scanner input = new Scanner(System.in);
        double total = 0;
        System.out.print("Enter a Number: ");
        double number = input.nextInt();
        while (number != 0){
            total = total + number;
            System.out.print("Enter a Number: ");
            number = input.nextDouble();
        }
        System.out.println("-".repeat(25));
        System.out.println("Result Is: " + total);

     */
        /// Example : Factorial Of a Number (following)
    /*
        Scanner input = new Scanner(System.in);
        int total = 1;
        int i = 1;
        System.out.print("Input a Number: ");
        int number = input.nextInt();
        while (i <= number){
            total = total * i;
            i += 1; // can i++;

        }
        System.out.println("-".repeat(25));
        System.out.println("Result Is: " + total);

     */
        ///  Do...while Loop
    /*
        ///  Create a program to print a number from 1 to 5
        int count = 1;
        do {
            System.out.println("Count: " + count);
            count += 1;
        }while (count <= 5);

     */
        ///  For Loop:
    /*
        ///  print a sentence 3 times
        for (int i = 1; i <= 3; i++){
            System.out.println("-".repeat(35));
            System.out.println("Inside the for loop.");
            System.out.println("for loop.");
        }
        System.out.println("-".repeat(35));

     */
        ///  Printing NUmber from 1 to 5:   (for loop)
    /*
        for (int count = 1; count <= 5; ++count){
            System.out.println("Count = " + count); // This code will run 5 times
        }

     */
        ///  For loop (Example)
    /*
        for (int i = 5; i >= 1; --i){
            System.out.println("-".repeat(25));
            System.out.println("Inside the for loop" + i);
        }

     */
        /// For Loop :  Sum of Natural Numbers
    /*
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Positive Number: ");

        int n = input.nextInt();

        int total = 0;

        for (int i = 1; i <= n; ++i){
            total += i;
        }
        System.out.println("Result: " + total);
        input.close();

     */
        ///  Factorial of a number (for loop)
    /*
        Scanner input = new Scanner(System.in);
        System.out.print("Input a Number: ");

        int n = input.nextInt();

        int factorial = 1;

        for (int i = 1; i <= n; ++i){
            factorial = factorial * i;
        }
        System.out.println("-".repeat(20));
        System.out.println("Factorial of Number Is: " + factorial);

     */
        ///  Using if Statement inside a loop:
    /*
        /// From i = 1 to 9
        for (int i = 1; i < 10; ++i){
            if (i % 2 == 0){    // Check if i is Even
                System.out.println("Even: " + i);   // can add else for check Odd...
            }
        }

     */
        ///  Example : Print Odd Numbers
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Positive Number: ");
        int n = input.nextInt();
        for (int i = 1; i <= n; ++i){
            if (i % 2 != 0){
                System.out.println("Is Odd: " + i);
            }
        }
    }
}
