package Array_Intro;

import java.time.Instant;
import java.util.*;

public class IntroInitializeArray {
    public static void main(String[] args) {

    /*
        String [] names = {"Sok","Jame","Jor","Mew"}; // for each
        for (String name: names){
            System.out.println(name);
        }

     */

    /*
        String[] names = new String[4];
        names[0] = "Jame";
        names[1] = "Josh";
        names[2] = "Bunath";
        names[3] = "Vanra";
        System.out.println("Array Size: " + names.length);
        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

     */

    /*
        System.out.print("[-] Insert Number of Element: ");
        int number = new Scanner(System.in).nextInt();
        String [] names = new String[number];
        for (int i = 0; i < number; i++){
            System.out.print("[-] Insert name [ " + i + " ]: ");
            names[i] = new Scanner(System.in).nextLine();
        }
        System.out.println("All Names.");
        System.out.println(Arrays.toString(names));
//        Update new name:
        System.out.print("[+] Insert old name to update: ");
        String oldName = new Scanner(System.in).nextLine();
        for (int i = 0; i < names.length; i++){
            if (names[i].equals(oldName)){
                System.out.print("[-] Insert new name to update: ");
                String newName = new Scanner(System.in).nextLine();
                names[i] = newName;
            }
        }
        System.out.println(" ==> All Update names: ");
        System.out.println(Arrays.toString(names));

     */

    /*
        System.out.println(" ==> All Numbers: ");
        Integer [] numbers = {1,2,3,4};
        System.out.println(Arrays.toString(numbers));
        System.out.print("Insert any element to delete: ");
        int deleteNumber = new Scanner(System.in).nextInt();
        for (int i=0;i<numbers.length;i++){
            if (numbers[i]==deleteNumber){
                numbers[i] = null;
            }
        }
        System.out.println(">> All element after deleted: ");
        for (Integer n: numbers){
            System.out.println(n);
        }

     */

        System.out.println("=".repeat(30));
        System.out.println("Product Stock management system");
        System.out.println("=".repeat(30));
        String[] productName = new String[30];
        while (true) {
            System.out.println("""
                    1. List all Product 
                    2. Create new Product
                    3. Update Product
                    4. Delete 
                    5. Exit
                    ----------------------------------
                    """);
            System.out.print("[+] Insert option: ");
            int opt = new Scanner(System.in).nextInt();
            switch (opt) {
                case 1 -> {
                    System.out.println("==> List all Products");
                    for (String p : productName) {
                        if (p != null) {
                            System.out.println(p);
                        }
                    }
                }
                case 2 -> {
                    System.out.print("[+] Insert Product name: ");
                    String productN = new Scanner(System.in).nextLine();
                    for (int i = 0; i < productName.length; i++) {
                        if (productName[i] == null) {
                            productName[i] = productN;
                            break;
                        }
                    }
                    System.out.println("😀 Product has been added successfully");
                    System.out.println("📅 Created at " + Date.from(Instant.now()));
                }
                case 3 -> {
                    System.out.println("[+] Update Product: ");
                    for (int i = 0; i < productName.length; i++) {
                        System.out.print(" >> Please Insert old product to update: ");
                        String oldName = new Scanner(System.in).nextLine();
                        if (productName[i].equals(oldName)) {
                            System.out.print(" >> Please Insert new product to update: ");
                            String newName = new Scanner(System.in).nextLine();
                            productName[i] = newName;
                            break;
                        }
                    }
                }
                case 4 -> {
                    System.out.print("[+] Insert any Product name to delete: ");
                    String deleteName = new Scanner(System.in).nextLine();
                    for (int i = 0; i < productName.length; i++) {
                        if (productName[i] != null && productName[i].equals(deleteName)) {
                            productName[i] = null;
                        }
                    }
                    System.out.println("[🔖] Product has been deleted successfully");
                    System.out.println("📅 Deleted at " + Date.from(Instant.now()));
                }
                case 5 ->{
                    System.out.print("[+] Exit");
                    return;
                }
            }
            System.out.print(">> Press any key continue");
            new Scanner(System.in).nextLine();
        }
    }
}