package Practice_Home.Array;

public class ArrayIntro {
    public static void main(String[] args) {
//        Example   :
        /**
         * Write a program to implement a double type array.
         *
         * Create a double type array named numbers with values: 3.5, 8.9, 1.6, -4.8.
         * Print the values of the array using a for loop.
         */
        /*
        double [] numbers = {3.5,8.9,1.6,-4.8};
        // access array elements using the for loop:
        for (int i=0;i<numbers.length;i++){
            System.out.println("Result: " + numbers[i]);
        }

         */
//        Changing Array Elements   :
        /**
         * Suppose we have an array like this:
         *
         * int[] age = {24, 23, 18, 19, 20};
         * Now, let's try to change the second element from 23 to 28 and the fourth element from 19 to 21.
         *
         * We know that the index of the second element is 1 and the index of the fourth element is 3,
         * so we will assign a new value to that index.
         */
        /*
        int[] ages = {24, 23, 18, 19,20};
        // change the value of second element
        ages[1] = 28;
        ages[3] = 21;
        // access array using for loop
        for (int i=0;i<ages.length;i++){ // i = index (full word)
            System.out.println("Result: " + ages[i]);
        }

         */
//        Change Element of an Array    :
        /**
         * Write a program to change an element of an array.
         *
         * Create an integer array primeNumbers with the elements {2, 3, 5, 7}.
         * Get integer input from the user and store it in the variable number.
         * We will assume the user will only enter prime numbers.
         * Change the fourth element of the array by assigning the value of number to it.
         * Print the array elements.
         */
        /*
        int[] primeNumbers = {2, 3, 5, 7};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        primeNumbers[3] = number;   // {2, 3, 5, 7} : (index: from 1...(number of element-1));and (number of Element is in{1,2,3...})
        for (int i=0;i<primeNumbers.length;i++){
            System.out.println("Result: " + primeNumbers[i]);
        }

         */
//        Length Property of Array  :    Array with Defined Size
        int[] numbers = new int[4];
        // assign value to the array
        numbers[0]=1;
        numbers[1]=2;
        numbers[2]=3;
        numbers[3]=4;
        // access element fo the array using loop
        for (int i=0;i<numbers.length;i++){
            System.out.println("Result: " + numbers[i]);
        }

    }
}
