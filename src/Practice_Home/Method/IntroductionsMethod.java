package Practice_Home.Method;

public class IntroductionsMethod {
//
//    Creating a Method :
    /**
     * The General syntax to create a method is:
     * returnType methodName(){
     *     // Your Code...
     * }
     * Note: returnType - represent the type of data returned by the method
     * (for example: 'int' means it returns 'Integer'. 'double' means it returns floating-point number. e.t.c).
     * Note: methodName() - name of our method.
     * and {...} - this is the body of the method.
     */
    // Example:
    /*
    void names() // full: public static void name of method(){}
    // void is a return type that doesn't return any value.
    // names is a name of our method.
    {
        // here is the body of the method
    }
     */

//
//   Calling Method in java
    // solution 1:
    /*
    public static void greet(){
        System.out.println("Hello!");
        System.out.println("How do you do?");
    }

    // Calling method: in main class following:
    public static void main(String[] args) {
        // calling method:
        greet();
    }

     */
    /**
     * we can use solution 2:
     * void greet(){  // this is the Method.
     *     System.out.println("Hello");
     * }
     * public static void main(String[] args){
     *     // how to call method:
     *      - create object of main:
     *      Main obj = new Main();
     *      - then call the method:
     *      obj.greet();
     * }
     * Note: But it is not as clean as solution 1. so, we should use only solution 1.
     * Note: solution 2 cannot in this version.
     * Note: After we have created a method, we can use it as many times as we want.
     */

//  Example: Method:
    /**
     * Write a program to print numbers using a method.
     *
     * Create a method named printNumbers().
     * Inside the method print two numbers 5 and 100.
     * Inside the main() method call the method two times.
     */
    /*
    // create the method:
    public static void printNumbers(){
        System.out.println(5);
        System.out.println(100);
    }
    // calling the method:
    public static void main(String[] args) {
        printNumbers();
    }

     */
//    Example: Find a\square of a number using method
    /*
    public static void findSquare(){
        int a = 12;
        int result = a * a;
        System.out.println("Square of " + a + " is " + result);
    }
    // calling method
    public static void main(String[] args) {
        findSquare();
    }

     */
//    Ex_3: Find Cube of a number:

    /**
     * Write a program to find the cube of a number using a method.
     *
     * Create a method named findCube().
     * Inside the method, create a variable named number with value 5.
     * Find the cube of number and assign it to the result variable.
     * Print the result variable.
     * Call the method using the object of the class.
     */
    /*
    public static void findCube(){
        int number = 5;
        // Cube form: Cube = number*number*number
        int result =number*number*number;
        System.out.println("Cube of " + number + " is " + result);
    }
    // calling method ( method is findNumber();)
    public static void main(String[] args) {
        findCube();
    }

     */
//    Making Method Dynamic:
    /**
     * it is possible to create function that can take 'input' and return 'output'.
     * In programming terms:
     *  - Argument: refer to the input passed to the function.
     *  - Return value: refer to the out[ut produced by the function.
     */
//    Method Arguments:
    //Example:
    /*
    public static void findSquare(int number){
        int result = number*number;
        System.out.println(" Square of " + number + " is " + result);
    }

    public static void main(String[] args) {
        findSquare(2);     // assign the value 2 to a number.
    }

     */
//    Using Different Arguments (args):
    /**
     * Let's use the same method to find the squares of 12, 8 and 21.
     */
    /*
    public static void findSquare(int number){
        int result = number*number;
        System.out.println(" Square of " + number + " is " + result);
    }

    public static void main(String[] args) {
        findSquare(12);
        findSquare(8);
        findSquare(21);
    }

     */
//    Passing (ការឆ្លងកាត់) Multiple Arguments:
    /**
     * We can also pass more than one argument to  a method by separately them
     * with commas " , "
     */
    // Example:
    /*
    public static void addNumbers(int n1, int n2){
        int result=n1+n2;
        System.out.println("Sum is: " + result);
    }

    public static void main(String[] args) {
        addNumbers(5,6);
    }

     */
//    Do Exercise: About Method Arguments
    /**
     *Write a program that adds two floating-point numbers using a method.
     *
     * Create a method named addNumbers().
     * The method must accept two double arguments n1 and n2.
     * Add n1 and n2 inside the method and print the result.
     * Inside main()
     *
     * Get double inputs from the user and store them in number1 and number2 variables.
     * Create an object of the class and use the object to call addNumbers() with arguments number1 and number2.
     */
    /*
    public static void addNumbers(double a1, double a2){
        double result = a1 + a2;
        System.out.println("Sum of number is: " + result);
    }

    public static void main(String[] args) {
        System.out.print("Input Your Number 1: ");
        double number1 = new Scanner(System.in).nextDouble();
        System.out.print("Input Your Number 2: ");
        double number2 = new Scanner(System.in).nextDouble();
        // Call Method:
        System.out.println("-".repeat(20));
        addNumbers(number1, number2);

    }

     */
//
    /**
     * Return Statement:
     * - Immediately ends the function.
     * - Return control of the program to the where the function was called.
     */
//  Ex_1:
    /*
    public static int findSquare(int number){   // change 'void' to 'int' : return value.
        int result = number*number;
        return result;
    }

    public static void main(String[] args) {
        int result = findSquare(2);
        System.out.println("Result is: " + result); // can temp 'result' other name for variable
    }

     */
//
    /**
     * << Adding Numbers Using Method: >>
     * Example: This code to add two numbers:
     */
    /*
    public static void addNumbers(int a, int b){
        int result = a+b;
        System.out.println("Sum is: " + result);
    }

    public static void main(String[] args) {
        addNumbers(5,6);
    }

     */
    // let's modify the code to return the sum from the method.
    /**
     * Return statement:
     */
    /*
    public static int addNumbers(int a, int b){
        int sum = a+b;
//        return sum;
        return a+b;
    }

    public static void main(String[] args) {
        // method calling:
        int result = addNumbers(5,5);
        System.out.println("Result is: " + result);
    }

     */
//  Ex_2: Java Method:
    /**
     * Write a program to find the product of two numbers using a method.
     *
     * Step 1
     *
     * Create a method named getProduct().
     * This method should accept two arguments: number1 and number2.
     * Multiply number1 and number2 and return the result.
     *
     * Step 2
     *
     * Create the main() method.
     * Inside that, get two integer input from the user and store them in n1 and n2.
     * Call the getProduct() method with arguments n1 and n2 respectively and store the value returned in the result variable.
     * Print result.
     */
    /*
    public static int getProduct(int number1, int number2){
        int result = number1*number2;
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input n1: ");
        int n1 = input.nextInt();
        System.out.print("Input n2: ");
        int n2 = input.nextInt();

        // call the method
        int results = getProduct(n1,n2);
        System.out.println("-".repeat(20));
        System.out.println("Results is: " + results);
    }

     */
// Ex_3: The Discount Problem:
    /**
     * wrap the logic of this problem inside a method to make it reusable:
     * ex: the discount was always fixed at 10%, so it was directly embedded in the method.
     */
    /*
    public static double calculateTotalAfterDicount(double total){
        double discountPercent = 10.0;

        // check condition:
        if (total>100){
            double excess = total - 100;
            double discount = (discountPercent / 100) * excess;
            total = total - discount;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // for the first customer:

//        System.out.print("Total: ");
//        double total = scanner.nextDouble();
//        total = calculateTotalAfterDicount(total);
//        System.out.println("The final amount to pay is: $" + total);
//
//        // for the second customer:
//        System.out.print("Total: ");
//        double totals = scanner.nextDouble();
//        totals = calculateTotalAfterDicount(totals);
//        System.out.println("The final amount to pay is: $" + totals);

//        or solution 2:
        System.out.print("Total Customer 1: ");
        double total1 = scanner.nextDouble();
        System.out.print("Total Customer 2: ");
        double total2 = scanner.nextDouble();

        // calling the method:
        total1 = calculateTotalAfterDicount(total1);
        total2 = calculateTotalAfterDicount(total2);

        // print total amount:
        System.out.println("-".repeat(50));
        System.out.println("Total amount to pay for the Customer 1 is: " + total1);
        System.out.println("-".repeat(50));
        System.out.println("Total amount to pay for the Customer 2 is: " + total2);
    }
    */
//
    /**
     *  The Discount Problem with Variable Discount:
     *  ex: let's handle situations where the discount percentage might vary.
     *  In this case, we can modify the method to accept the discount percentage as an argument.
     */
//
     /*
    public static double calculateTotalAfterDicount(double total, double discountPercent){

    // check condition:
    if (total>100){
        double excess = total - 100;
        double discount = (discountPercent / 100) * excess;
        total = total - discount; // or total -= discount
    }
    return total;
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Total Customer 1: ");
        double total1 = scanner.nextDouble();
        System.out.print("Input Discount Percentage Customer 1: ");
        double disPercentage1 = scanner.nextDouble();

        System.out.println("=".repeat(50));

        System.out.print("Total Customer 2: ");
        double total2 = scanner.nextDouble();
        System.out.print("Input Discount Percentage Customer 2: ");
        double disPercentage2 = scanner.nextDouble();

        // calling the method:
        total1 = calculateTotalAfterDicount(total1, disPercentage1);
        total2 = calculateTotalAfterDicount(total2, disPercentage2);

        // print total amount:
        System.out.println("-".repeat(50));
        System.out.println("Total amount to pay for the Customer 1 is: $" + total1);
        System.out.println("-".repeat(50));
        System.out.println("Total amount to pay for the Customer 2 is: $" + total2);
    }

      */
//  =======Case 1==============
    /**
     * >>>   ...Note...   <<<
     *=======================
     * Common Issues that trouble beginners:
     * ===================================
     *  - Mismatch Return Type:
     *  Example:
     *  class Main {
     *
     *     👉 int getProduct(👉 double number1, 👉 double number2) {
     *         👉 double product = number1 * number2;
     *         return product;
     *     }
     *
     *     public static void main(String[] args) {
     *
     *         Main obj = new Main();
     *
     *         👉 int result = obj.getProduct(3.5, 4.6);
     *         System.out.println(result);
     *     }
     * }
     * showing mistake:
     * - its error. Because the method is returning a "double" value
     *   product however, we are using the return type "int". (look on code 👉)
     */
//  ===========Case 2============
    /**
     * >>> ...Note...<<<
     *  Not Using the return value properly:
     * =================
     * Example:
     * class Main {
     *
     *     double getProduct(double number1, double number2) {
     *         double product = number1 * number2;
     *         return product;
     *     }
     *
     *     public static void main(String[] args) {
     *
     *         Main obj = new Main();
     *
     *         obj.getProduct(3.5, 2.4);
     *        👉 // should bee add...
     *          👉 double variableName = obj.getProduct(3.5, 2.4);
     *          👉 then print it.
     *          // note:  If a method returns a value, always assign it to a variable or use it in some other way.
     *          Otherwise, the returned value will be lost.
     *     }
     * }
     *  Mistake:
     *  - However, The return value is not assigned to anything, nor have we printed it.
     *  so, the value will be lost. (look on code (look on code 👉)
     */
//    ============case 3============
    /**
     * >>> ...Note...<<<
     * Wrong Number of Arguments:
     * Example:
     * import java.util.Scanner;
     *
     * class Main {
     *
     *     double getProduct(double number1, double number2) {
     *         double product = number1 * number2;
     *         return product;
     *     }
     *
     *     public static void main(String[] args) {
     *
     *         Main obj = new Main();
     *
     *         double result = obj.getProduct(👉3.5); it only one / have one arguments
     *         System.out.println(result);
     *     }
     * }
     * Mistake:
     *  - its error. here java will complain that the "getProduct();" method takes two arguments,
     *  but we are only supplying one argument during the method call. (look on code 👉)
     */
//  ========================
    /**
     * The main() Method:
     *  public static void main(String[] args){
     *      .......Body Statement........
     *  }
     *  👉 Here :
     *         👉 " main " : name of the method.
     *         👉 " void " : return type of us method.
     *         👉 " String[] args " : method parameter.
     */
//    ===============================
}
