package Practice_Home.Method;

import java.util.Scanner;

public class StanderdLibraryMethods {
//
//     Library Method Introduction:
    /*
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
     */
    /**
     * Note: >> Here, " println() " and " System.out.println() " is a "Standard Library Method"
     * that prints the text on the screen.
     */
//
//    Mathematical Library Method:
    /**
     * Java provide various library method that can be used to inform different mathematical operator.
     * example: " sqrt() " : is used to  find the square root of a number.
     *  All the mathematical-based library method are defined inside the " Math " class,
     *  so we will be using it while calling those method.
      */
//
//    Finding the square Root: >> sqrt() <<
    /**
     * The " sqrt() " method is used to find the square root of a number:
     * lets see an example:
     */
    /*
    public static void main(String[] args) {
        int number = 25;

        // find the square root:
        double squareRoot = Math.sqrt(number);

        System.out.println("Square Root of " + number + " is " + squareRoot);
    }
     */
    /**
     * >> Note << : The "sqrt()" method is defined inside the "Math" class,
     * that why we are using "Math.sqrt()".
     *              The "sqrt()" method returns a floating-point value,
     * so we have assigned the "sqrt()" method.
     * we can simply pass a number and get the square root od that number.
     */
//
//    Find the Cube Root of a NUmber: >>> cbrt() <<<
    /**
     * Write a program to find the cube root of a number.
     * - get an integer input and assign ot to the number variable.
     * - Use the " cbrt() " method to find the cube root of the number.
     */
    /*
    public static void main(String[] args) {
        // Declare variable:
        Scanner input = new Scanner(System.in);
        System.out.print("Ënter a number: ");
        int number = input.nextInt();

        // Use the cbrt() method tp find the cube root:
        double cubeRoot = Math.cbrt(number);
        System.out.println("The Cube Root of " + number + " is " + cubeRoot);
    }

     */
//
//    Finding the Power of a Number:
    /**
     * meaning: n^x : - n = base number
     *                - x = power number
     *         note : n and x , it only own temp.
     */
    /*
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input value of base: ");
        int base = input.nextInt();
        System.out.print("Input value of power: ");
        int power = input.nextInt();

        // find the power of number:
        double result = Math.pow(base, power);
        System.out.println(base + " ^ " + power + " is: " + result);
    }

     */
//
//    Getting Random Numbers: random() method:
    /**
     * Note: Meaning >> Getting random numbers : we use the " random() " method to get a random from 0.0 to less than 1.0.
     *.> let's see an example:
     */
    /*
    public static void main(String[] args) {
        System.out.println(Math.random());
        System.out.println(Math.random());
    }

     */
    /**
     * Example: We can modify this program to generate random numbers from 0.0 to less than 5.0 .
     * - Let's see an Example:
     */
    /*
    public static void main(String[] args) {
        // Random number 0.0 to 4.999
        double randomNumber = Math.random() * 5;  // * 5 or 6... meaning that we can generate a number.
        System.out.println(randomNumber);
    }

     */
//
//    Getting Integer Random Numbers: (int) before method random
    /**
     * We can also modify the " random() " method to get a random integer number
     * between any two intervals.
     * .Example.let's see an example to generate random numbers between 1 and 10:
     */
//
     /*
    public static void main(String[] args) {
        // random number from 1 to 10 ; meaning *10 + 1
        int randomNumber = (int)(Math.random() * 10 + 1);
        System.out.println(randomNumber);
    }

      */
    /**
     * >> Notice the Line: int randomNumber = (int)(Math.random()*10+1);
     * >> Here <<
     * - " Math.random() " : Generate random numbers from 0.0 to less than 1.0.
     * - " Math.random()*10 " : Generate random numbers from 0.0 t0 less than 10.0.
     * - " Math.random()*10+1 " : Generate numbers from 1.0 to 10.0.
     * - " (int) " Convert the random numbers to Integer (i.e. 1 to 10)
     */

//    ===================================
//    Last Example: Print a Random Number:
//    ====================================
    /**
     * Write a program to generate number between 1 to 100.
     * - Use " Math.random() " method to generate random numbers from 0.0 to less than 1.0.
     * - Modify the method to get random integer value from 1 to 100.
     */
//
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random()*100+1);
        System.out.println(randomNumber);
    }
}
