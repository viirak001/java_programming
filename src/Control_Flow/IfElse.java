package Control_Flow;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

    /*
        Scanner insert = new Scanner(System.in);
        System.out.print("[-] Insert Math: ");
        double math = insert.nextDouble();

        System.out.print("[-] Insert Khmer: ");
        double khmer = insert.nextDouble();

        //System.out.print("[-] Insert English: ");
        //double english = insert.nextDouble();

        //System.out.print("[-] Insert Physic: ");
        //double physic = insert.nextDouble();

        double avg;
        ///avg = (khmer+math+physic+english)/3;
        avg = (math + khmer) / 2;
        System.out.println("-".repeat(20));
        System.out.println("AVG :" + avg);

        if (avg<=100 && avg>90){
            System.out.println("Grade A");
        } else if (avg<=90 && avg>80) {
            System.out.println("Grade B");
        } else if (avg<=80 && avg>70) {
            System.out.println("Grade C");
        }else {
            System.out.println("Grade D");
        }
        System.out.println("-".repeat(20));

     */
        ///  if...else
    /*
        System.out.print("Insert Your Age: ");
        int age = new Scanner(System.in).nextInt();
        if (age > 18){
            System.out.println("You are able  to Vote.");
        }else {
            System.out.println("You are too young.");
        }

     */
        System.out.print("Insert Your name: ");
        String name = new Scanner(System.in).nextLine();
        if (name.equalsIgnoreCase("Vi")){       // (.)equalsIgnoreCase : use for String(can insert: A or a....)
            System.out.println(name + " has been allowed. ");
        }
    }
}
