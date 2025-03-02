package Practice_Home.Method;

import java.util.Scanner;

public class ThinkMethods {
// Note:>> Back to the Basic :
    /**
     * When you think of methods, think of two things:
     *  - arguments : What value the method might take.
     *   - return value : What value tge method will return.
     */
//  ==============================
//    Example: Sum of Natural Numbers From 1 to n:
    /**
     * Note >> - Arguments : We are finding the sum from 1 to n. Our method will
     * take only one argument "n". it's because the first number will always be the same value 1.
     *     - Return Value : The method should return the sum of number.
     */
    /*
    public static int computeSum(int number){
        int total=0;
        for (int i=0;i<=number;i++){
            total+=i;
        }
        return total;
    }

    public static void main(String[] args) {
        int total=computeSum(10);
        System.out.println("Sum of number 1 is: " + total);
        total=computeSum(100);
        System.out.println("Sum of number 2 is: " + total);
    }

     */
    /**
     * >> Notice line >> Focus on how we have used the method argument and return value.
     */
//  ===========================
//    Factorial of a Number:
    /**
     * Write a program to compute the factorial of a number.
     *
     * The factorial of a positive integer n is equal to:
     *
     * factorial = 1 * 2 * 3 * .... * n
     * Step 1
     *
     * Create a method named computeFactorial().
     * This method takes only one argument, n, and computes the factorial.
     * Return the factorial.
     * Step 2
     *
     * Create the main() method.
     * Inside that, get an integer input from the user and store it in the number variable.
     * Call the computeFactorial() with number as an argument, and assign the returned value to the total variable.
     * Print the total variable.
     * We will assume that the user will enter a non-negative integer.
     */
    /*
    public static int computeFactorial(int number){
        int factorial=1;
        for (int i=1;i<=number;i++){
//            int factorial=1; // if it inside loop we cannot return value
            factorial = factorial*i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        System.out.print("Enter a Number: ");
        int number = new Scanner(System.in).nextInt();

        // call the method:
        int sum = computeFactorial(number);
        System.out.println("Factorial of a number is: " + sum);
    }

     */
//  ============================================
//    Finding Largest Number Among Three Numbers:
    /**
     * Program Summary:
     *
     * We will create a program that finds the largest number among three numbers by creating a method. The method should work for any three numbers.
     *
     * Arguments:
     *
     * Since we are finding the largest number among three numbers, the method should take three arguments.
     *
     * Return Value:
     *
     * The method should return the largest number among the three numbers.
     */
    /*
    public static int getLargestNumber(int number1, int number2, int number3){
        // checking to comparing number:
        if (number1>=number2 && number1>=number3){
            return number1;
        } else if (number2>=number1 && number2>=number3) {
            return number2;
        }else {
            return number3;
        }
    }

    public static void main(String[] args) {
        int largestNumbers = getLargestNumber(3, 55, -5);
        System.out.println("Largest Number Among Three Numbers is: " + largestNumbers);
        // we want to add another number:
        largestNumbers = getLargestNumber(2, 5, 20);
        System.out.println("Largest number is: " + largestNumbers);

    }

     */
    /**
     * >>> Note <<<
     * However, only one of the return statements is executed.
     * If any one of the return statements is executed,
     * the program's control returns immediately to the calling method with the largest value.
     *
     * So, it seems like adding 3 return statements is not a good practice.
     * Let's see how we can modify this.
     */
    /*
    public static int getLargestNumber(int number1, int number2, int number3){
        // 👉 we should do this to create new variable:
        int largestNumber;

        // checking to comparing number:
        if (number1>=number2 && number1>=number3){
//            return number1; // 👉 don't that:
            // 👉 we should do this: call the variable "largestNumber":
            largestNumber = number1;

        } else if (number2>=number1 && number2>=number3) {
//            return number2; // 👉 don't that:
            // 👉 we should do this: call the variable "largestNumber":
            largestNumber = number2;
        }else {
//            return number3; // 👉 don't that:
            // 👉 we should do this: call the variable "largestNumber":
            largestNumber = number3;
        }
        // 👉 return value largestNumber:
        return largestNumber;
    }

    public static void main(String[] args) {
        int largestNumbers = getLargestNumber(3, 55, -5);
        System.out.println("Largest Number is: " + largestNumbers);
        // we want to add another number:
        largestNumbers = getLargestNumber(2, 5, 20);
        System.out.println("Largest number is: " + largestNumbers);
    }

     */
    /**
     * >> Note <<
     *  - In this program, the largest number is assigned to the "largestNumber" variable
     *  inside the method. And, the value of "largestNumber" is returned. (Look at note 👉)
     */
//    ===============
//    Checking Odd / Even :
    /**
     * Program Summary:
     * We will create a program to check whether a number is odd or even by creating a method.
     *
     * Arguments:
     * Our method will take a single argument (a number that we need to check whether it's even or odd).
     *
     * Return Value:
     * If the number is even, our method will return true. If the number is odd, it will return false.
     */
    /*
    public static boolean findOddEven(int number){ // type boolean can return true and false:

        if (number % 2 == 0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.print("Insert an number: ");
        int numbers = new Scanner(System.in).nextInt();

        // checking and print
        boolean result = findOddEven(numbers);
         if (result){
             System.out.println("Number of " + numbers + " is Odd");
         }else {
             System.out.println("Number of " + numbers + " is Even");
         }
        findOddEven(numbers);

     */
    /**
     *  Solution 2:
     */
    public static int findOddEven(int number){
        if (number % 2 == 0){
            return 1; // 1 equals true :
        }else {
            return 0; // 0  equals false :
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter an Number: ");
        int numbers = new Scanner(System.in).nextInt();

        // check and print:
        int result = findOddEven(numbers);
        if (result != 0){
            System.out.println("Number of " + numbers + " is Even.");
        }else {
            System.out.println("Number of " + numbers + " is Odd.");
        }
    }







}
