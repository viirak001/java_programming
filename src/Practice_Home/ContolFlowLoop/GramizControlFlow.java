package Practice_Home.ContolFlowLoop;

import java.util.Scanner;

public class GramizControlFlow {
    public static void main(String[] args) {
        /// Boolean:
    /*
        Scanner input = new Scanner(System.in);
        System.out.println("Input Number: ");
        int number = input.nextInt();
        System.out.println("-".repeat(20));
        System.out.println(number % 5 == 0);
    */
        /// ControlFlow: if...Statement
    /*
        Scanner input = new Scanner(System.in);
        System.out.print("Iput His/Her Age: ");
        int age = input.nextInt();
        if (age >= 18){
            System.out.println("The person can vote");
        }
     */
        /// Control Flow: if...else statement
    /*
        Scanner input = new Scanner(System.in);
        System.out.print("Input HIs/Her Age: ");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("The person can vote.");
        }else {
            System.out.println("The person can not vote.");
        }
     */
        /// Control Flow: if...else...statement
    /*
        Scanner input = new Scanner(System.in);
        System.out.print("Input Number 1: ");
        int number1 = input.nextInt();
        System.out.print("Input Number 2: ");
        int number2 = input.nextInt();
        if (number1 < number2) {
            System.out.println("Number 1 is smaller");
        }else {
            System.out.println("Number 2 is smaller");
        }
     */
        /// Control Flow: if...else if...statement
    /*
        /// checking: Positive, Negative and Zero:
        Scanner input = new Scanner(System.in);
        System.out.print("Input Your Number: ");
        int number = input.nextInt();
        if (number>0){
            System.out.println("Positive.");
        } else if (number<0) {
            System.out.println("Negative.");
        }else {
            System.out.println("Zero.");
        }
     */
        ///  Control Flow: if...else if...statement

        /// Checking: Odd/Even
        Scanner input = new Scanner(System.in);
        System.out.print("Input Your Number: ");
        int number = input.nextInt();
        /// for Even:
        if (number % 2 == 0){
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }
}
