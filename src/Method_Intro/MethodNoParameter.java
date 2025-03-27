package Method_Intro;

import java.util.Scanner;

// method have return type no para
public class MethodNoParameter {
// Ex_1:


    // int sum : call return type ( public static + datatype: meaning int as datatype)
    public static int sum(){
        Scanner input = new Scanner(System.in);
        System.out.print(" Insert a : ");
        int a = input.nextInt();
        System.out.print(" Insert b : ");
        int b = input.nextInt();
        return a+b;
    }

    public static void main(String[] args) {
        int result = sum();
        System.out.println("Sum : " + result);
    }






}
