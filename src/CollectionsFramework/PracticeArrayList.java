package CollectionsFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class PracticeArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        System.out.print(" 👉 Insert number of name to add product: ");
        int n = new Scanner(System.in).nextInt();
        for (int i=0; i<n;i++){
            System.out.print(" 👉 Insert name of product  [" + (i+1) + "]: ");
            String name = new Scanner(System.in).nextLine();

            // add name to arraylist:
            names.add(name);
        }
        System.out.println("================");
        names.forEach(e-> System.out.println("name: " + e));
//
//  Want ot Remove :
//
        /*
        // Start remove
        System.out.print(" 👉 Insert name to delete: ");
        String name = new Scanner(System.in).nextLine();

        // Find index of element:
        int index = names.indexOf(name);

        // check
        if (index>=0){
            // remove index:
            names.remove(index);
            System.out.println(" 👉 Remove name " + name + "Sucessfully");
            names.forEach(System.out::println);
        }else {
            System.out.println(" 👉 Not found name.");
        }
         */
//
//  Want to Update :
//
        // Start Update:
        System.out.print(" Insert old name to update: ");
        String name = new Scanner(System.in).nextLine();
        int index = names.indexOf(name);

        // check
        if (index>=0){
            System.out.print(" Insert new name: ");
            String newName = new Scanner(System.in).nextLine();

            // Update:
            names.set(index, newName);
            names.forEach(e-> System.out.println("Name: " + e));
//            names.forEach(System.out::println);
        }else {
            System.out.println("Not found name.");
        }
//
        /**
         * >>> HomeWork <<
         * DateLine : at night : Time: 12 : 12 AM
         */


    }
}
