package CollectionsFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class LastTess {

        // Product list to store the current products
        public static ArrayList<String> productName = new ArrayList<>();

        // Product history to store actions on products (addition, update, deletion)
        public static ArrayList<String> productView = new ArrayList<>();

        // 1. Add Product:
        public static void addProduct(){
            System.out.print("👉 Insert number of Product: ");
            int numberOfProduct = new Scanner(System.in).nextInt();

            for (int i = 0; i < numberOfProduct; i++) {
                System.out.print(" 👉 Add name of product: ");
                String nameOfProduct = new Scanner(System.in).nextLine();
                productName.add(nameOfProduct);
                productView.add("Added: " + nameOfProduct); // Record the addition in product history
            }

            productName.forEach(namePro -> System.out.println("Product name: " + namePro));
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
                System.out.println("👉 Product not found.");
            }
        }

        // 3. Update product name (case-insensitive):
        public static void updateProduct(){
            System.out.print("👉 Insert old product to update: ");
            String oldName = new Scanner(System.in).nextLine().toLowerCase();  // Convert to lowercase for case-insensitive comparison

            // Find the product ignoring case
            for (int i = 0; i < productName.size(); i++) {
                if (productName.get(i).toLowerCase().equals(oldName)) {
                    System.out.print("👉 Insert new product name: ");
                    String newName = new Scanner(System.in).nextLine();
                    productName.set(i, newName);  // Update the product name in the list
                    productView.add("Updated: " + productName.get(i) + " -> " + newName); // Record the update in history
                    System.out.println("Product updated successfully.");
                    return;
                }
            }
            System.out.println("👉 Product not found.");
        }

        // 4. Delete product (case-insensitive):
        public static void deleteProduct(){
            System.out.print("👉 Insert product name to delete: ");
            String deleteName = new Scanner(System.in).nextLine().toLowerCase();  // Convert to lowercase for case-insensitive comparison

            // Remove the product ignoring case
            for (int i = 0; i < productName.size(); i++) {
                if (productName.get(i).toLowerCase().equals(deleteName)) {
                    productView.add("Deleted: " + productName.get(i));  // Record the deletion in history
                    productName.remove(i);  // Remove the product from the list
                    System.out.println("👉 Product deleted successfully.");
                    return;
                }
            }
            System.out.println("👉 Product not found.");
        }

        // 5. View product history (All product actions):
        public static void viewProduct(){
            if (productView.isEmpty()) {
                System.out.println("👉 No product history available.");
            } else {
                System.out.println(">>> Product History <<<");
                for (String proHistory : productView) {
                    System.out.println(proHistory);
                }
            }
        }

        // 6. Exit:
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
                4. View product history
                5. Delete product name
                6. Exit
                ===============================
                """);

                System.out.print("👉 Choose Option: ");
                int option = new Scanner(System.in).nextInt();
                switch (option){
                    case 1: {
                        addProduct();
                        break;
                    }
                    case 2: {
                        searchProduct();
                        break;
                    }
                    case 3: {
                        updateProduct();
                        break;
                    }
                    case 4: {
                        viewProduct();
                        break;
                    }
                    case 5: {
                        deleteProduct();
                        break;
                    }
                    case 6: {
                        exit();
                        break;
                    }
                    default:
                        System.out.println("👉 Invalid option, please try again.");
                }
            }
        }

        // Main method to call the numberOption method
        public static void main(String[] args) {
            numberOption();
        }


}