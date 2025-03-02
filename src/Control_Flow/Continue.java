package Control_Flow;

public class Continue {
    public static void main(String[] args) {

    /*
        int number = 1;
        do {
            number++;
            if (number == 10){
                continue;
            }
            System.out.println("Value of Number: " + number);
            if (number == 20){
                break;
            }
        }while (number > 0);

     */
        ///  label for loop // use outside for loop
        myLabel:
        for (int k=0;k<10;k++){
            for (int i=1;i<10;i++){
                if (i%2==0){
                    break myLabel;
                }
                System.out.println(k + " => " + i);
            }
        }

    }
}
