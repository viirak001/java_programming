package Control_Flow;

public class Practice {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < (5 - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("-".repeat(10));
        for (int i = 1; i <= 5; i++){
            for (int j = 0; j < (5 - i); j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }
        System.out.println("-".repeat(10));

        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < (5 - i); j++) {
                System.out.print(" ");
            }
            int total = 1;
            for (int k = 1; k <= i; k++) {
                System.out.print(total + " ");
                total++;
            }
            System.out.println();
        }
        System.out.println("-".repeat(10));
        for (int i = 1; i <= 5; i++){
            for (int j = 0; j < (5 - i); j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("-".repeat(18));
    }
}
