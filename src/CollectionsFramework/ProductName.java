package CollectionsFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ProductName {

//    That Verak

    // Option:
//    public static void listOption(){
//        System.out.print("""
//                ==========Welcome==============
//                1. Add New Product by name
//                2. Search product name by name
//                3. Update product name
//                4. Delete product name
//                5. Exit
//                ===============================
//                """);
//    }

    // product list:
    public static ArrayList<String> productName = new ArrayList<>();

    // 1. Add Product:
    public static void addProduct(){
        System.out.print("👉 Insert number of Product: ");
        int numberOfProduct = new Scanner(System.in).nextInt();

        for (int i=0;i<numberOfProduct;i++){
            System.out.print(" 👉 add name of product: " );
            String nameOfProduct = new Scanner(System.in).nextLine();
            productName.add(nameOfProduct);
        }
        productName.forEach(namePro-> System.out.println("Product name: " + namePro));
    }

    // 2. Search product name by name:
    public static void searchProduct(){
        System.out.print("👉 Insert product name to search: ");
        String searchName = new Scanner(System.in).nextLine().toLowerCase();
        boolean isFoundName = false;
        for (String product : productName) {
            if (product.toLowerCase().equals(searchName)) {
                System.out.println("Product name: " + product);
                isFoundName = true;
                break;
            }
        }
        if (!isFoundName) {
            System.out.println("👉 found");
        }
    }

    // 3.Update product name:
    public static void updateProduct(){
        System.out.print(" 👉 Insert old product to update: ");
        String oldName = new Scanner(System.in).nextLine().toLowerCase();
        // Find the product ignoring case
        for (int i = 0; i < productName.size(); i++) {
            if (productName.get(i).toLowerCase().equals(oldName)) {
                System.out.print("👉 Insert new product name: ");
                String newName = new Scanner(System.in).nextLine();
                productName.set(i, newName);
                System.out.println("Product updated successfully.");
                return;
            }
        }
        System.out.println("👉 Product Invalid");
    }

    // 4. Delete product:
    public static void deleteProduct(){
        System.out.print("👉 Insert product name to delete: ");
        String deleteName = new Scanner(System.in).nextLine().toLowerCase();
        for (int i = 0; i < productName.size(); i++) {
            if (productName.get(i).toLowerCase().equals(deleteName)) {
                productName.remove(i);
                System.out.println("👉 Product deleted successfully.");
                return;
            }
        }
        System.out.println("👉 Product Invalid");
    }

    // 5.Exit:
    public static void exit(){
        System.out.println(">>>...Bye 😒 Bye...<<<");
        System.exit(0);
    }

    // Choose Option:
    public static void numberOption(){
        while (true){
            System.out.print("""
                ==========Welcome==============
                1. Add New Product by name
                2. Search product name by name
                3. Update product name
                4. Delete product name
                5. Exit
                ===============================
                """);

            System.out.print("👉 Choose Option: ");
            int option = new Scanner(System.in).nextInt();
            switch (option){
                case 1:{
                    addProduct();
                    break;
                }
                case 2:{
                    searchProduct();
                    break;
                }
                case 3:{
                    updateProduct();
                    break;
                }
                case 4:{
                    deleteProduct();
                    break;
                }
                case 5:{
                    exit();
                }
                default:
                    System.out.println("👉 Invalid try again");
            }
        }
    }

    // call the method:
    public static void main(String[] args) {
        numberOption();
    }
}
