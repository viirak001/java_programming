package Method_Intro;
// Method no return but have parameter  :

public class MethodHaveParameter {
//    Example_1:
//    public  static  void  thumbnail(){
//        System.out.println("=======================");
//        System.out.println(" Welcome to Khmer Mart ");
//        System.out.println("=======================");
//        System.out.println("""
//                1. List all Product:
//                2. Insert new Product:
//                3. Update Product:
//                4. Delete Product:
//                5. Exit.
//                """);
//    }
//Example_2:
    /*
    public static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number A: ");
        int a = input.nextInt();
        System.out.print("Enter number B: ");
        int b = input.nextInt();

        System.out.println("-------------------");
//        System.out.println("-".repeat(10));
        System.out.print("Sum of a + b = " + (a+b));
//        System.out.print(STR."Sum of a+b: = \{a+b}"); error
    }

     */
// Ex_3:
    /*
    public static void sumNew (int a, int b){
        System.out.println("Sum of a+b = " + (a+b));
    }
    public static void findMax(int a, int b){
        if (a>b){
            System.out.println(a + " > " + b);
        }else {
            System.out.println(a + " < " + b);
        }
    }

     */
//    example_4:

    /**
     *Create a method with no return type and tle one parameter as array datatype of int
     * then find " duplicate " element in the array parameter.
     */
    /*
    public static void duplicate(int[] array){
        for (int i=0;i< array.length;i++){
            for (int j=i+1;j< array.length;j++){
                if (array[i]==array[j]){
                    System.out.println("Duplicate number is: " + array[j]); // arr[i] = arr[j]
                }
            }
        }
    }

     */
//    Vararg   (...a): meaning unlimited = n
    /*
    public static void sumNews(int ...a){
        int sum=0;
        for (int n:a){
            sum+=n;
        }
        System.out.println("Sum: " + sum);
    }
//    no Return type but have parameter all above

    public static void main(String[] args) {
//        thumbnail();
//        sum();
//        sumNew(1,2);
//        findMax(3,4);
//        duplicate(new int[]{1,2,3,4,5,3,5});
        sumNews();
        sumNews(1,2);
        sumNews(1,2,3); // until n number
    }

     */
//
//
    //    Example:
    private static int sum(int a, int b){  // can use public or private because it singles file.
        return a+b;
    }
    public static int sum(int...number){
        int sum=0;
        for (int a:number){
            sum += a;
        }
        return sum;
    }

    public static void main(String[] args) {
        int resultOfSum = sum(2, 3);
        int newSum = sum(1, 4, 8);
        System.out.println("Sum: " + resultOfSum);
        System.out.println("New Sum: " + newSum);
    }
}
