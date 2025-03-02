package Control_Flow;

public class DoWhileLoop {
    public static void main(String[] args) throws InterruptedException {

    /*
        int i = 0;
        do {
            System.out.println("This is Called from do while loop.");
        }while (i > 0);

     */
        // example:
        int i = 0;
        do {
            Thread.sleep(100);
            System.out.println("i value [ "  + i + " ] ");
            i++;
            if (i == 500){
                break;
            }
        }while (i>0);

    }
}
