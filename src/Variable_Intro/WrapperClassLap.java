package Variable_Intro;

import java.util.Scanner;

public class WrapperClassLap {
    public static void main(String[] args) {
        System.out.print("[-] Student Name: ");
        Scanner scanner = new Scanner(System.in);
        String studentName = scanner.nextLine();
        System.out.print("[-] Student Math Score: ");
        Double mathScore = scanner.nextDouble();
        System.out.print("[-] Student Khmer Score: ");
        Double khmerScore = scanner.nextDouble();
        System.out.print("[-] Student English Score: ");
        Double englishScore = scanner.nextDouble();

        Double avg = (mathScore + khmerScore + englishScore) / 3; // avg formula (form)
        System.out.println("=".repeat(20));
        System.out.println("Student Name: " + studentName);
        System.out.println("Average: " + avg);
    }
}
