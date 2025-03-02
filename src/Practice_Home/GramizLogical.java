package Practice_Home;

import java.util.Scanner;

/// learning about: Logical Operators: &&   ,   ||  ,   !()
public class GramizLogical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ///  Use && Operators:  ( && = AND or and ) (Example following)
    /*
        ///  Find the Smallest Number (following)
        System.out.print("Input Your Number 1: ");
        int number1 = input.nextInt();
        System.out.print("Input Your Number 2: ");
        int number2 = input.nextInt();
        System.out.print("Input Your NUmber 3: ");
        int number3 = input.nextInt();
        System.out.println("-".repeat(20));
        if (number3<number1 && number3<number2){
            System.out.println("It is True");
        }else {
            System.out.println("It is False");
        }
        System.out.println("-".repeat(20));
        ----------------------------------------------
        ///  OR Other Solution: But not show Print: String (ex: Is True or false as above)
        System.out.print("Input Your Number 1: ");
        int number1 = input.nextInt();
        System.out.print("Input Your Number 2: ");
        int number2 = input.nextInt();
        System.out.print("Input Your NUmber 3: ");
        int number3 = input.nextInt();
        System.out.println("-".repeat(20));
        System.out.println((number3<number1) && (number3<number2));
     */
        /// Logical Operator: || ( || = OR ) (Example following)
        /// The || "OR" operator is also used with two boolean expressions. It returns
        /// true - if either one of the boolean expressions is true
        /// false - if both expressions are false
    /*
        double purchaseAmount = 800.0;
        boolean hasMembership = true;
        // Check if the customer is eligible for a discount
        if (purchaseAmount > 1000 || hasMembership) {
            System.out.println("Congratulations! You are eligible for a discount.");
        } else {
            System.out.println("Sorry, you are not eligible for a discount.");
        }
     */

        ///  Logical Operator: !()  (Example following)
        /// The ! "NOT" operator is used with only one boolean expression. It returns
        /// true - if the boolean expression is false
        /// false - if the boolean expression is true
    /*
        int age = 22;
        // false because (age > 21) is true
        System.out.println(!(age > 21)); // false

        // true because (age > 25) is false
        System.out.println(!(age > 25)); // true
     */

    }
}
