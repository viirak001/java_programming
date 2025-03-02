package Operator_Intro;

public class OperatorSyntax {
    public static void main(String[] args) {
        /*int a = 2;
        int c = (a++) +(a--);
        System.out.println(a);
        */

                int a = 2;
                int b = a++;
                System.out.println(b++);
                System.out.println(b);
                System.out.println(a);
    }
}
