package Array_Intro;

import java.util.Scanner;

public class InitializeArray {
    public static void main(String[] args) {
    /*
        int [] numbers = {6,3,5,4,1,2};
        System.out.println(Arrays.toString(numbers));
        for (int i=0;i<numbers.length;i++){
            for (int j=0;j<numbers.length-1;j++){
                if (numbers[j]>numbers[j+1]){
                    int temp = numbers[j];  // Temp to swap
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
//        using Sort :
        Arrays.sort(numbers);
        System.out.println("Result..... ");
        System.out.println(Arrays.toString(numbers));

     */
//        Find Duplicate of numbers:
    /*
        Integer [] ages = {20,2,5,18,10,19,21,21,23,20};
        for (int i=0;i<ages.length;i++){
            for (int j=i+1;j<ages.length;j++){
                if (ages[i]==ages[j]){
                    System.out.println("Duplicate of number is: " + ages[j]);
                }
            }
        }

     */
//        Find Duplicate of names:
    /*
        String [] names = {"Vi","Dara","Vi","Luna","Luna"};
        for (int i=0;i<names.length;i++){
            for (int j=i+1;j<names.length;j++){
                if (names[i].equalsIgnoreCase(names[j])){       // using equalsIgnoreCase: ( with String )
                    System.out.println("duplicate of name is: " + names[j]);
                }
            }
        }

     */
//        find maximum number :
        System.out.print("[+] Insert length of array: ");
        int n = new Scanner(System.in).nextInt();
        Integer [] numbers = new Integer[n];
        // insert each array's element
        for(int i=0;i<numbers.length;i++){
            System.out.print("[+] Insert element [" + i + "]: ");
            numbers[i] = new Scanner(System.in).nextInt();
        }
        int max = numbers[0];
        for(Integer a: numbers){
            if(max<a){
                max = a;
            }
        }
        System.out.println("This is maximum of above array: " + max);



    }
}
