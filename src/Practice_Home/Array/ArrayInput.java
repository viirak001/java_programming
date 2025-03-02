package Practice_Home.Array;

import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        /*
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[4];
        System.out.print("Enter the first element: ");
        numbers[0] = input.nextInt();

        System.out.print("Enter the second element: ");
        numbers[1] = input.nextInt();

        System.out.print("Enter the third element: ");
        numbers[2] = input.nextInt();

        System.out.print("Enter the fourth element: ");
        numbers[3] = input.nextInt();

        for (int index=0;index<numbers.length;index++){ // index = i
            System.out.println("Result: " + numbers[index]);
        }
        input.close();

         */
//        Array Input Using for Loop    :
        /**
         * Here's how we can use a for loop to reduce redundancy in our previous code.
         */
        /*
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[4];

//        System.out.print("Enter Array Element: ");

        // Array input using for loop:
        for (int i=0;i<numbers.length;i++){
            System.out.print("Enter Array Element: ");
            numbers[i] = input.nextInt();
        }
        for (int i=0;i<numbers.length;i++){
            System.out.println("Result: " + numbers[i]);
        }

         */
//        Finding Sum of Array Elements :
        /**
         * In this example, we will create an array of size 5.
         * Here, we will take input values for the array elements and find the sum of all the elements.
         */
        /*
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

//        System.out.print("Enter Array Element: ");
        for (int i=0;i<numbers.length;i++){
            System.out.print("Enter Array Element: ");
            numbers[i] = input.nextInt();
        }

        // fid=nd sum of all the elements:
        int total=0;

        // add all array element:
        for (int i=0;i<numbers.length;i++){
            total = total + numbers[i];
        }
        System.out.println("Sum of all the element is: " + total);
        input.close();

         */

//
        /**
         *  ...>>> Find Average of Elements <<<...
         *  Write a program to find the average of array elements.
         *
         * Create a double array named numbers with size 5.
         * Get input value for the array.
         * Create a sum variable with initial value 0.0.
         * Run a for loop to find the sum of each element of the array and store it to the sum variable.
         * Outside the loop, divide the sum by the total number of array elements to find the average.
         * Print the average.
         */
        /*
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[5];

        // get input value for the array:
        for (int i=0;i<numbers.length;i++){
            System.out.print("Enter number: ");
            numbers[i] = input.nextDouble();
        }
        double sum = 0.0;
         // add all array element:
        for (int i=0;i<numbers.length;i++){
            sum = sum + numbers[i];
        }
        // find the average:
        double avg = sum / numbers.length;
        System.out.println("AVG: " + avg);

         */
//        >>> More on Arrays <<<
        /**
         * >>> Assign less elements than size of the array:
         * We can also create an array of size 5 and assign only 2 elements to it.
         * In this case, the remaining array elements will be filled with default value.
         */
//        Example:II
        /*
        int[] numbers = new int[5];

        // Assign element:
        numbers[0] = 5;
        numbers[1] = 3;
        // Note: Remaining element equal 0 value or default value of int: please print result.

        // Access array element:
        for (int i=0;i< numbers.length;i++){
            System.out.println("Result: " + numbers[i]);
        }

         */
//        >> Morw on Arrays: Declare and Define Array Size Separately:(separately = doay lek pi knea)
//      Example: III
        /*
        // Declare array:
        int[] numebers;

        // Define array Size:
        numebers = new int[5];

        // or Use [] After array name like:>> (int numbers[])

        // Declare array:
        int numbers[] = {1, 2, 3, 4, 5};


        // Access array element:
        for (int i=0;i<numbers.length;i++){
            System.out.println("Result: " + numbers[i]);
        }

         */
//        Common Mistake in Array:
        /**
         * in Java, we cannot Declare and Initialize an array separately.
         * Example:
         * // Invalid Code: No:
         * int[] numbers = new int[5];
         * numbers = {1, 2, 3, 4, 5};
         *
         * // Valid Code: Yes:
         * int[] numbers = {1, 2, 3, 4, 5};
         */








    }
}
