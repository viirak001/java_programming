package Practice_Home.ContolFlowLoop;

import java.util.Scanner;

public class Switch_ {
    public static void main(String[] args) {

//        Switch Statement:
    /*
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Case 1 to 7:
        switch (number){
            case 1 : {
                System.out.println("Sunday");
                break;
            }
            case 2 : {
                System.out.println("Monday");
                break;
            }
            case 3 : {
                System.out.println("Tuesday");
                break;
            }
            case 4 : {
                System.out.println("Wednesday");
                break;
            }
            case 5: {
                System.out.println("Thursday");
                break;
            }
            case 6: {
                System.out.println("Friday");
                break;
            }
            case 7: {
                System.out.println("saturday");
                break;
            }
            default : System.out.println("This is Switch.");

        }

     */
//        Example: Using Switch Statement : Find the name of Month: using Break:
    /*
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of month: ");
        int month = input.nextInt();
        switch (month){
            // u can use ( case 1 -> {} or case 1: {} / for switch)
            case 1:{
                System.out.println("January");
                break;
            }
            case 2:{
                System.out.println("February");
                break;
            }
            case 3:{
                System.out.println("March");
                break;
            }
            case 4:{
                System.out.println("April");
                break;
            }
            case 5:{
                System.out.println("May");
                break;
            }
            case 6:{
                System.out.println("June");
                break;
            }
            case 7:{
                System.out.println("July");
                break;
            }
            case 8:{
                System.out.println("August");
                break;
            }
            case 9:{
                System.out.println("September");
                break;
            }
            case 10:{
                System.out.println("October");
                break;
            }
            case 11:{
                System.out.println("November");
                break;
            }
            case 12:{
                System.out.println("December");
                break;
            }
            default:
                System.out.println("a Year.");
        }

     */
//        Example: Removing " break " from each Case:
        /*
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of month: ");
        int month = input.nextInt();
        switch (month){
            case 1:{
                System.out.println("January");
            }
            case 2:{
                System.out.println("February");
            }
            case 3:{
                System.out.println("March");
            }
            case 4:{
                System.out.println("April");
            }
            case 5:{
                System.out.println("May");
            }
            case 6:{
                System.out.println("June");
            }
            case 7:{
                System.out.println("July");
            }
            case 8:{
                System.out.println("August");
            }
            case 9:{
                System.out.println("September");
            }
            case 10:{
                System.out.println("October");
            }
            case 11:{
                System.out.println("November");
            }
            case 12:{
                System.out.println("December");
            }
            default:
                System.out.println("a Year.");
        }

         */
//        Switch with Multiple Cases:
        /*
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number (1 to 7): ");
        int number = input.nextInt();
        switch (number){
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Weekday");
                break;
            case 7:
            case 1:
                System.out.println("Weekend");
                break;
            default : System.out.println("Invalid number.");
        }

         */
//        Example: Identify Even and Odd Numbers(1 to 10)=>(Using Switch Statement):
//      find a number from 1 to 10: which one are Even or Odd:
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: "); // number from 1 to 10
        int number = input.nextInt();
        switch (number){
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
                System.out.println("Odd.");
                break;
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
                System.out.println("Even.");
                break;
            default:
                System.out.println("Invalid number");
        }
    }
}
