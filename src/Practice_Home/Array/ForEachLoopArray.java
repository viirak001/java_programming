package Practice_Home.Array;

public class ForEachLoopArray {
    public static void main(String[] args) {
//        For-each Loop
        /**
         * we have been using the " for " loop to access each element of the array.
         *  in Java, There is another variation(បំរែបម្រួល) of the " for " loop
         *  called the " for - each " loop. (it makes easy?)
         */
        // Example:
        // Create an array:
        /*
        int[] numbers = {35, 42, 56, 62, 67};

        // Access each element using " for-each loop ":
        for (int number:numbers){   // Note: for-each loop >> ( : ) and full syntax:>> for (int number:numbers) <<
            System.out.println("Result: " + number);

         */
            /**
             * Note >> in Create an Array : (Above)
             * for : Syntax of the loop.
             * numbers : name of the array.
             * int number : Temporary(Temp) variable.
             */
//      Example : Using the "for-loop" and "for-each-loop" :
        // Using the "for-loop":
        /*
        // Create data-type array:
        double[] numbers = {13.55, 81.19, 31.6, -44.8};
        // Initial total: (initial = ដំបូង)
        double total=0;

        // Access array element using the "for loop":
        for (int i=0;i<numbers.length;i++){
            // Add each element to total:
            total = total+numbers[i];
        }
        System.out.println("Total: " + total);

         */
//        Example : Using the " for-each loop ":
        /*
         double numbers[] = {13.55, 81.19, 31.6, -44.8};
         double total=0;
         // for each loop:
        for (double number:numbers){
            total = total+number;
        }
        System.out.println("Total: " + total);

         */
        /**
         * Using for each loop:
         * Write a program to find the average of array elements.
         *
         * Create a double array named numbers with elements 4.2, 5.5, 2.0, 8.2, and 9.6.
         * Run a for-each loop to find the sum of all array elements.
         * Outside the loop, divide the sum by the array length using the length property to get the average.
         * Finally, print the average.
         */
        // Start:
        /*
        double[] numbers = {4.2, 5.5, 2.0, 8.2, 9.6};
        double sum=0;
        for (double number:numbers){
            sum=sum+number;
        }
        double avg = sum / numbers.length;
        System.out.println("Average: " + avg);

         */
//  Ex_1:
        /**
         * Finding the largest element in an array:
          */
        /*
        // Create array
        int[] numbers = {55, 64, 75, 80, 65};

        // assign the first value of the array to the largest variable
        int largest = numbers[0];

        // Iteract each element of the array
        for (int i=0;i<numbers.length;i++){
            if (largest<numbers[i]){
                largest=numbers[i];
            }
        }
        System.out.println("The Largest Number Is: " + largest);

         */
//  Ex_2:
        /**
         * Find the smallest of array
          */
    // Start
        /*
        int[] numbers = {3, 5, 8, 9, 1};
        int smallest = numbers[0];
        for (int i=0;i<numbers.length;i++){
            if (smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        System.out.println("The Smallest number is: " + smallest);

         */
//  Ex_3:
        /**
         * Copying One Array to Another:
         */
        /*
        // Start:
        int[] numbers = {3, 6, 2, 9, 1};
        // Declare new array of the same size:
        int[] newNumbers = new int[numbers.length];
        for (int i=0;i<numbers.length;i++){
            newNumbers[i] = numbers[i];
        }
        System.out.println("New Array: ");
        for (int i=0;i<numbers.length;i++){
            System.out.println(newNumbers[i]);
        }

         */
//  Exx_4:
        /**
         * Multiply each Element of Array by 10:
         * ====================================
         * Write a program to multiply each element of an array by 10.
         *
         * Create an integer array named numbers with elements: 43, 78, 23, 45.
         * Create another integer array of the same size named newNumbers.
         * Use a for loop to access each element of numbers.
         * Inside the loop, multiply each element of numbers by 10 and assign it the newNumbers.
         * Print elements of newNumbers.
         */
        /*
        // Start:
        int[] numbers = {43, 78, 23, 45};
        int[] newNumbers = new int[numbers.length];
        for (int i=0; i<numbers.length;i++){
            newNumbers[i]=numbers[i] * 10;
        }
        for (int num:newNumbers){
            System.out.println("Multiply Each Element of Array by 10 : " + num);
        }

         */
        /**
         * ....>>> Recap <<<<
         * 1. Create an Array:
         * An array can only store data of similar type.
         * Ex:======
         * // Create an array
         *         int[] primeNumbers = {2, 3, 5, 7};
         *
         *         System.out.println("Prime Numbers:");
         *         for(int index = 0; index < primeNumbers.length; ++index) {
         *             System.out.println(primeNumbers[index]);
         *         }
         * Note: primeNumbers.length returns the size of the array.
         * ----------------------------------------------
         * 2. Get Array Input:
         * We use the "Scanner" class to take input the size of the array.
         *Ex:========
         * Scanner input = new Scanner(System.in);
         *
         *         // Create an array
         *         int[] primeNumbers = new int[4];
         *
         *         System.out.println("Enter 4 prime numbers:");
         *         for (int index = 0; index < primeNumbers.length; ++index) {
         *             primeNumbers[index] = input.nextInt();
         *         }
         *
         *         System.out.println("Prime Numbers:");
         *         for(int index = 0; index < primeNumbers.length; ++index) {
         *             System.out.println(primeNumbers[index]);
         *         }
         *
         *         input.close();
         * -----------------------------------------------------------------
         * 3. for each loop:
         * The "for-each" loop makes accessing array element so easy.
         * Ex:=======
         *  // Create an array
         *         int[] primeNumbers = {2, 3, 5, 7};
         *
         *         System.out.println("Prime Numbers:");
         *
         *         for (int number : primeNumbers) {
         *             System.out.println(number);
         *         }
         * Note: In each interaction of the "for-each" loop, in element of the
         * "primeNumbers" array is stores in the "number" variable. This is why the array
         * element are printed when we print "number".
         */


    }
}
