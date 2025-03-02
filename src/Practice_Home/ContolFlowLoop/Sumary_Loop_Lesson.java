package Practice_Home.ContolFlowLoop;

import java.util.Scanner;

public class Sumary_Loop_Lesson {
    public static void main(String[] args) {
//        The if statement:
        /**
         * The " if " statement is used to create program that can make a choice -
         * among two or more alternative.
         */
//       Example :
        /*
        String car = "Tesla";
        if (car == "Bugatti"){
            System.out.println("U have Bugatti.");
        }else {
            System.out.println("U don't have a Bugatti.");
        }

         */
//        The While Loop
        /**
         * The " while " loop is used to repeat a block of code until -
         * the boolean expression of the loop is false.
         */
//        Please looks Example:
        /*
        // Declare variable:
        int i=1;
        int n=5;
        // while loop from 1 to 5
        while (i<=5){
            System.out.println(i);
            i++;
        }

         */
//        The For Loop:
        /**
         * The " for " loop is used to run a block of code -
         * for a certain number of times
         */
//      Example:
        /*
        // loop iterate from 1 to 3:
        for (int i=1;i<=3;i++){
            System.out.println(i);
        }

         */
//      The break statement
        /**
         * The " break " statement is used to terminate the loop immediately -
         * when it's encountered. It is usually used inside an -
         * if...else statement.
         */
//        Example:
        /*
        for (int i=1;i<=100;i++){
            if (i==3){
                break;
            }
            System.out.println(i);
        }

         */
//        The Continue Statement:
        /**
         * The " continue " statement skip the code the loop for current iteration.
         * The loop will not terminate but continue on with the text iteration.
         * It is also usually used an if...else statement.
         */
//        Example:
        /*
        for (int i=1;i<=5;i++){
            if (i==3){
                continue;
            }
            System.out.println(i);
        }

         */
//        The Switch Statement:
        /**
         * The " switch " statement can be used as a replacement for -
         * if...else when we have o choice from multiple alternatives.
         */
//        Example:
    /*
        int number = 3;
        switch (number){
            case 1: {
                System.out.println("One");
                break;
            }
            case 2:{
                System.out.println("Two");
                break;
            }
            case 3:{
                System.out.println("Three");
                break;
            }
            default:
                System.out.println("Invalid Number.");
        }

     */
//  ==============================Practice Ending Loop===============================
        Scanner input = new Scanner(System.in);
//  Ex_1:      Check Even or Odd
        /**
         * Create a program to check if a number is even or odd.
         * Get an integer input for the number variable.
         * Check if the number is exactly divisible by 2.
         * If the number is divisible, print Even. Otherwise, print Odd.
         */
        /*
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Check Even or Odd
        if (number % 2 == 0){
            System.out.println(" 👉 " + number + " NUmber is Even.");
        }else {
            System.out.println(" 👉 " + number + " Number is Odd");
        }

         */
//  Ex_2:   Check Pass, Fail or Invalid:
        /**
         * Program Description
         * Create a program to check if a student passed, failed, or entered invalid marks.
         * Get integer input for marks.
         * Check if the marks is less than 0 or greater than 100. If it's true, print Invalid Marks.
         * Check if the marks is greater than 40. If it's true, print Pass.
         * Else, print Fail.
         */
        /*
        System.out.println("Input Your Marks: ");
        int marks = input.nextInt();
        if (marks<0 || marks>100){
            System.out.println("Invalid.");
        } else if (marks>40) {
            System.out.println("Pass.");
        }else {
            System.out.println("Fail");
        }

         */
//  Ex_3:   Check Eligibility for Voting
        /**
         * Create a program to check the voting eligibility.
         * Get age (integer) input and store it in the age variable.
         * If age is greater than or equal to 18, he/she can vote.
         * If the person can vote, print Can Vote. Otherwise, print Cannot Vote.
         */
        /*
        System.out.print("Enter your Age: ");
        int age = input.nextInt();
        if (age>=18){
            System.out.println("He/She can vote.");
        }else {
            System.out.println("He/She Can not vote.");
        }

         */
//  Ex_4:   Print FizzBuzz Based on Input
        /**
         * Create a program to print FizzBuzz based on user input.
         * Get an integer input from the user and assign it to the number variable.
         * If the number is a multiple of 3, print Fizz.
         * If the number is a multiple of 5, print Buzz.
         * If the number is a multiple of both 3 and 5, print FizzBuzz.
         * Else print the original number.
         */
        /*
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if (number % 3 == 0){
            System.out.println("Fizz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        }else if (number % 3 == 0 && number % 5 == 0){
            System.out.println("Fizz_Buzz");
        }else {
            System.out.println("The Original number is: " + number);
        }

         */
//  Ex_5:   Calculate Employee Bonus:
        /**
         * Create a program to find the bonus of employees based on their year of service.
         * Zara decides to give a bonus of 5% to employees if their year of service is more than 5 years.
         * Take salary and year of service in year as input.
         * Print the bonus amount.
         */
        /*
        System.out.print("Enter salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter Service Year: ");
        double serviceYear = input.nextDouble();
        if (serviceYear > 5){
            Double bonus = (salary * 5) / 100;
            System.out.println("Bonus Amount is: " + bonus);
        }

         */
//  Exx_6: Check leap year:
        /**
         * Create a program to check if a year is a leap year or not.
         *
         * A leap year is exactly divisible by 4 except for century years (years ending by 00). The century year is a leap year only if it is perfectly divisible by 400.
         *
         * Get an integer year input for the year variable.
         * Use the if condition to check if the year is perfectly divisible by 400. If true, print Leap Year.
         * Use an else if condition to check if the year is perfectly divisible by 4 and doesn't end with 00 (not divisible by 100). If true, print Leap Year.
         * Otherwise, print Not a Leap Year.
         */
        /*
//        Scanner input = new Scanner(System.in);
        // Get input value for year:
        System.out.print("Enter a year: ");
        int years = input.nextInt();

        // Check if year is divisible by 400:
        if (years % 400 == 0){
            System.out.println("Leap Year.");

        // Check if the year is divisible by 4 and doesn't end with 00:
        }else if(years % 4 == 0 && years % 100 != 0){
            System.out.println("leap year.");
        }else {
            System.out.println("Not leap year.");
        }

         */
//  Ex_7: Compute Grade of Students:
        /**
         * Create a program to find the grade of a student based on the marks.
         *
         * Get a double input from the user and assign it to the marks variable.
         * Check the value of marks and assign grades based on that.
         * If marks is greater than or equal to 90, print A.
         * If marks is greater than or equal to 80, print B.
         * If marks is greater than or equal to 70, print C.
         * Otherwise, print D.
         */
        /*
        System.out.print("Input Year Marks: ");
        double marks = input.nextDouble();
        if (marks>=90){
            System.out.println("A");
        } else if (marks>=80) {
            System.out.println("B");
        } else if (marks>=70) {
            System.out.println("C");
        }else {
            System.out.println("D");
        }

         */
//  Ex_8: Find Youngest Brother:
        /**
         * Create a program to find the youngest brother among 3 based on their ages.
         *
         * Get integer age input for three brothers: jack, roman and johnny.
         * Compare the values of jack, roman and johnny.
         * If jack is the smallest, print Jack.
         * If roman is the smallest, print Roman.
         * If johnny is the smallest, print Johnny.
          */
        /*
        System.out.print("Input jack age: ");
        int jack = input.nextInt();
        System.out.print("Input roman age: ");
        int roman = input.nextInt();
        System.out.print("input johnny age: ");
        int johnny = input.nextInt();
        if (jack<roman && jack<johnny){
            System.out.println("Jack");
        }else if (roman<jack && roman<johnny){
            System.out.println("Roman");
        }else {
            System.out.println("Johnny");
        }

         */
//  Ex_9: Print a sentence 3 time:
        /**
         * Create a program to print a sentence 3 times using a loop.
         *
         * Run a for loop from i = 0 to i < 3.
         * Inside the loop, print Java Programming is fun.
         */
        /*
        for (int i=0;i<3;i++){
            System.out.println("Jva Programming is Fun.");
        }

         */
//  Ex_10: Sum of natural Number:
        /**
         * Create a program to find the sum of N natural numbers.
         *
         * Get an integer input for a variable n.
         * Run a loop from 1 to n.
         * Inside the loop, find the sum of all numbers from 1 to n.
         * Print the sum.
          */
        /*
        System.out.print("Input n value: ");
        int n = input.nextInt();
        int sum=0;
        for (int i=1;i<n;i++){
            sum = sum + i;
        }
        System.out.println("Sum is: " + sum);

         */
//  Ex_11: Print Multiplication(*) Table:
        /**
         * Create a program to print a multiplication table of a number.
         *
         * Get an integer input and store it in the number variable.
         * Run a while loop from 1 to 10.
         * Inside the loop, print the multiplication table in format: 8 * 1 = 8.
          */
        /*
        System.out.print("Input a Number: ");
        int number = input.nextInt();
        int count=1; // u can use i = 0;
        while (count<=10){ // can i<=10;
            System.out.println(number + " * " + count + " = " + (number * count));
            count++;
        }

         */
//  Ex_12: Factorial of a number:
        /**
         * Create a program to find the factorial of a number.
         *
         * A factorial of a number N is the product of all numbers from 1 to N. For example,
         *
         * Factorial of 6 = 6 * 5 * 4 * 3 * 2 * 1
         * Get an integer input for the variable number.
         * Initialize an integer variable factorial with value 1.
         * Run a for loop from i = 1 to i <= number.
         * Inside the loop, multiply factorial by i.
         * Print the value of factorial.
         */
        /*
        System.out.print("Enter a number N: ");
        int number = input.nextInt();
        int factorial = 1;
        for (int i=1;i<=number;i++){
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " = " + factorial);

         */
//  Ex_13: Add number until user Enter 0:
        /**
         * Create a program to find the sum of all the user inputs until the user enters 0.
         *
         * Create an integer variable named sum with initial value 0.
         * Run a while loop that is always true.
         * Inside the loop, get an integer input value from the user and store it in a variable.
         * Check if the value is 0.
         * If the input value is 0, terminate the loop. Otherwise, add the input value to the sum variable.
         * Print the sum.
          */
        /*
        int sum=0;
        while (true){
            System.out.print("Input Value: ");
            int inputValue = input.nextInt();
            if (inputValue==0){
                break;
            }else {
                sum=sum+inputValue;
            }
        }
        System.out.println("Sum is: " + sum);

         */
//  Ex_14:    Check Prime number;
        /**
         * Create a program to check whether a number is prime or not.
         *
         * A prime number is a number that is only divisible by either 1 or itself. For example, 7, 5, 19, etc.
         *
         * Get an integer input for the variable number.
         * Create a flag variable with initial value 0.
         * Run a loop from 2 to number - 1 and check if number is divisible by any number between 2 to number - 1.
         * If the number is divisible, change the value of flag to 1 and break the loop.
         * Outside the loop, check if the value of flag is 1. If true, print Not a Prime Number. Otherwise, print Prime Number.
         */
        System.out.print("Input Number: ");
        int number = input.nextInt();
        int flag=0;
        for (number=1;number<=2;number--){
            if (number % 2 == 0){

            }
        }
    }
}
