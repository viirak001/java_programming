package Practice_Home.Method;

public class VariableInsideMethod {
//    Variables Inside Method:
    /*
    public static void addNUmbers(int a, int b){
        int result = a+b;
        System.out.println(result);
    }

    public static void main(String[] args) {
        addNUmbers(2,5);
    }

     */
    /**
     * >> Has some Question : Now, Instead of printing the "result" variable from
     * inside the method, what will happen if we print the result after the method call.
     */
//
//    Continue form above :
    /*
    public static void addNUmbers(int a, int b){
        int result = a+b;
//        System.out.println(result);
    }

    public static void main(String[] args) {
        addNUmbers(2,5);
        System.out.println(result); // error
    }

     */
    /**
     * >> Note: This is Where the concept of local variable comes into play.
     */
//
//    (Go on):
    /*
    public static void addNUmbers(int a, int b){
        int result = a+b;
//        System.out.println(result);
    }

    public static void main(String[] args) {
        addNUmbers(2,5);
        System.out.println(result);
    }

     */
    /**
     * Here: - When the execution of the "addNumbers()" method ends, all the variable
     * inside it: a , b and result are destroyed.
     * - This is the reason why the above program throw an error because Java think
     * the "result" variable is not defined.
     * >> We can fix it by using a "return" statement:
     *
     * @return
     */
    public static int addNUmbers(int a, int b){
        int result = a+b;
        return result; // using return statement
    }

    public static void main(String[] args) {
        int output = addNUmbers(2,5);
        System.out.println(output);
    }

}
