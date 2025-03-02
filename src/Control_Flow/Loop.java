package Control_Flow;

import javax.swing.plaf.TableHeaderUI;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) throws InterruptedException {        // FROM Thread.sleep
    /*
        for (int i = 0; i < 5; i++){
            try {
                Thread.sleep(800);          // try / Thread.sleep use for ange reply on console
                System.out.println("Hello World");
            }catch (Exception ignore){}
        }

     */
        ///  example:
    /*
        System.out.print("Insert Number of Loop: ");
        int a = new Scanner(System.in).nextInt();
        for (int i=0;i<a;i++){
            System.out.println("My name [ " + (i+1) + " ] ");
            Thread.sleep(500);
        }

     */
        ///  Find a number Odd and Even (for loop)
    /*
        System.out.print("Insert Number: ");
        int number = new Scanner(System.in).nextInt();
        int numberOfOdd = 0;
        int numberOfEven = 0;
        for (int i = 1; i <= number; i++){
            if (i % 2 == 0){
                numberOfEven++;
            }else {
                numberOfOdd++;
            }
        }
        System.out.println("-".repeat(30));
        System.out.println("Even : " + numberOfEven);
        System.out.println("Odd : " + numberOfOdd);

     */
        ///  while Loop:
    /*
        while (true) {
            System.out.print("""
                    ========== Welcome to my Mart ==========
                    1. All Products.
                    2. New Products.
                    3. Search Products.
                    4. Delete Products.
                    5. Exit.
                    ================== Ending ==============
                    """);
            System.out.print("Insert Options: ");
            int a = new Scanner(System.in).nextInt();
            switch (a) {
                case 1 -> System.out.println("All Products.");
                case 2 -> System.out.println("New Products.");
                case 3 -> System.out.println("Search Products.");
                case 4 -> System.out.println("Delete Products.");
                default -> System.exit(0);
            }
            System.out.println("==> Press any key for continue: ");
            new Scanner(System.in).nextLine();
        }

     */
        ///  example:
    /*
        while (true){
            System.out.print("""
                ==========================
                -------- Food Panda-------
                ==========================
                1. View All Products.
                2. View Cart.
                3. Start Order
                4. View Ordered History.
                5. Exit.
                ==========================
                """);
            System.out.println("Insert Option: ");
            int number = new Scanner(System.in).nextInt();
            switch (number){
                case 1 -> System.out.println("View All Products.");
                case 2 -> System.out.println("View Cart.");
                case 3 -> System.out.println("Start Order.");
                case 4 -> System.out.println("View Ordered History.");
                default -> System.exit(0);
            }
            System.out.println(" ==> Press any key fo continue...");
            new Scanner(System.in).nextLine();
        }

     */
        for(int i=0;i<10;i++){
            System.out.print("=".repeat(i));
            Thread.sleep(200);
        };
        System.out.println();
        for(int i=0;i<6;i++){
            System.out.print("-".repeat(i));
            Thread.sleep(200);
        };
        System.out.print(" Food Panda ");
        for(int i=0;i<6;i++){
            System.out.print("-".repeat(i));
            Thread.sleep(200);
        };
        System.out.println();
        for(int i=0;i<10;i++){
            System.out.print("-".repeat(i));
            Thread.sleep(200);
        };
        while (true){
            System.out.println("\n1. View All Products");
            System.out.println("2. View Cart");
            System.out.println("3. Start Order");
            System.out.println("4. View Order History");
            System.out.println("5. Exit :");
            System.out.print("[+] Insert option: ");
            int opt = new Scanner(System.in).nextInt();
            switch (opt){
                case 1-> System.out.println("View all Products");
                case 5-> {
                    System.out.println("Exit :");
                    System.exit(0);
                }
            }
            System.out.print(">> Press any key to continue");
            new Scanner(System.in).nextLine();
        }
    }
}
