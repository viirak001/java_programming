package JavaClassAndObject;
 // Create Class:
class Math{
    private int sum ;
    public int sum(int ...numbers){
        for (int n: numbers){
            sum += n;
        }
        return sum;
    }
}
    // Create Object:
public class IntroClassObject {
    public static void main(String[] args) {
        Math math = new Math();
        int resultOfSum = math.sum(1, 2, 5, 6);
        System.out.println("Result Of Sum : " + resultOfSum);
    }
}
