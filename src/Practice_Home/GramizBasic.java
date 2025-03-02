package Practice_Home;

import java.util.Scanner;

public class GramizBasic {
    public static void main(String[] args) {

        /// Area of Rectangle: (following)
    /*
        /// formulary Rectangle(Area = Length * Breadth)
        Scanner input = new Scanner(System.in);
        System.out.print("Input Length: ");
        int length = input.nextInt();
        System.out.print("Input Breadth: ");
        int breadth = input.nextInt();
        int area;
        area = length*breadth;
        System.out.println("-".repeat(10));
        System.out.println("Area Of Rectangle: " + area);

        input.close();
    */
        /// Convert Kilometers to Miles (following)
    /*
        ///  form miles = kh / 1.6
        double km;
        double miles;
        Scanner userInput = new Scanner(System.in);
        System.out.print("Input Km: ");
        km = userInput.nextDouble();
        miles = km / 1.6;
        System.out.println("Kilometers to Miles is: " + miles);

        userInput.close();
    */
        /// Calculate Profit / Loss Amount (following)
    /*
        Scanner input = new Scanner(System.in);
        System.out.print("Input Your Selling Price: ");
        int sellingPrice = input.nextInt();
        System.out.print("Input Your Cost Price: ");
        int costPrice = input.nextInt();
        double profitOrLoss = sellingPrice - costPrice;
        System.out.println("Profit OR Loss: " + profitOrLoss);

        input.close();
    */
        /// BMI Calculate (Body Mass Index) (following)
    /*
        /// form BMI(Body Mass Index) = Weight / (Height * Height)
        Scanner input = new Scanner(System.in);
        System.out.print("Input Weight: ");
        double weight = input.nextDouble();
        System.out.print("Input Height: ");
        double height = input.nextDouble();
        double bmi = weight / (height*height);
        System.out.println("-".repeat(10));
        System.out.println("BMI (Body Mass Index): " + bmi);

        input.close();
    */
        /// Convert Fahrenheit to Celsius (following)
    /*
        /// form is : Celsius = (fahrenheit - 32) * 5 / 9 OR Celsius = ((fahrenheit-32)*5)/9
        Scanner input = new Scanner(System.in);
        System.out.print("Input Fahrenheit: ");
        double fadhrenheit = input.nextDouble();
        double celsius;
        celsius = ((fadhrenheit-32)*5)/9;
        System.out.println("-".repeat(30));
        System.out.println("Celsius Is: " + celsius);

        input.close();
    */
        /// Find Volume of a Cube   (following)
    /*
        /// form is : Volume of Cube = Length * Length * Length
        Scanner input = new Scanner(System.in);
        int length;
        System.out.print("Input Length: ");
        length = input.nextInt();
        int cube;
        cube = length*length*length;
        System.out.println("-".repeat(30));
        System.out.println("Volume Of Cube Is: " + cube);

        input.close();
    */
        /// Swap Two Number     (following)
    /*
        ///  In swap two number is using: ( temp or temporary to equal variable object )
        int x;
        int y;
        Scanner input = new Scanner(System.in);
        System.out.print("Input X: ");
        x = input.nextInt();
        System.out.print("Input Y: ");
        y = input.nextInt();
        int temporary;  // or temp
        temporary = x;
        x = y;
        y = temporary;
        System.out.println("-".repeat(20));
        System.out.println("Number After Swapping Is: ");
        System.out.println(x);
        System.out.println(y);

        input.close();
    */
        /// Calculate Simple Interest (following)
    /*
        ///  from: Interest = (Principal * Time * Rate) / 100 OR Interest=(P*T*R)/100
        double principal;
        double time;
        double rate;
        Scanner input = new Scanner(System.in);
        System.out.print("Input Principal: ");
        principal = input.nextDouble();
        System.out.print("input Time: ");
        time = input.nextDouble();
        System.out.print("Input Rate: ");
        rate = input.nextDouble();

        double interest = principal * time * rate;
        System.out.println("-".repeat(20));
        System.out.println("Interest Is: " + interest);
        System.out.println("-".repeat(20));

        double totalAmount = principal + interest;
        System.out.println("Total Amount Is: " + totalAmount);

        input.close();
    */
        /// Maximum Possible Handshakes (Following)
    /*
        /// Form: Combination(Calculate) = (n * (n - 1)) / 2
        int student; /// for student = n = number = total number of student
        Scanner input = new Scanner(System.in);
        System.out.print("Input Total of Student: ");
        student = input.nextInt();
        int calculateOfStudent = (student * (student - 1)) / 2;
        System.out.println("-".repeat(20));
        System.out.println("Number of Possible Handshakes Is: " + calculateOfStudent);

        input.close();
    */
        /// Divide N Chocolates Among M Children (following)
    /*
        ///Find the number of chocolates each child gets after division and print it.
        //Find the number of remaining chocolates and print it.
        Scanner input = new Scanner(System.in);
        System.out.print("Number of Chocolate: ");
        int numChocolate = input.nextInt();
        System.out.print("Number of Children: ");
        int numChildren = input.nextInt();
        /// find the number of chocolates child get
        int chocolateChildGet = numChocolate / numChildren;
        ///  find number of remaining chocolates
        int numOfRemain = numChocolate % numChildren;
        System.out.println("-".repeat(20));
        System.out.println("Number of Chocolate each Child get Is: " + chocolateChildGet);
        System.out.println("-".repeat(20));
        System.out.println("Number of Remaining Chocolate Is: " + numOfRemain);

        input.close();
    */
        /// Convert Pound to Kilogram (Following)

        /// Formula to convert Pound to Kilogram: Kg = Pound * 0.453592
    /*
        Scanner input = new Scanner(System.in);
        System.out.print("Input Pound: ");
        double pound = input.nextDouble();
        double kg = pound * 0.453592; /// kg = Kilogram
        System.out.println("-".repeat(20));
        System.out.println("Value of Weight in Kilogram Is: " + kg);

        input.close();

     */
//        Print Numbers:
        /*
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            if (number < 1 || number > 100){
                break;
            }
            System.out.println("Number is: " + number);
        }

         */
//        Check Even or Odd
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


    }
}
