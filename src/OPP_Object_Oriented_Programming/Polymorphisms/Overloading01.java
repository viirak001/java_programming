package OPP_Object_Oriented_Programming.Polymorphisms;

    class Service {
        public int sum(int a, int b){
            System.out.println("This is sum in parent class.");
            System.out.println("This is result of sum in parent class : " + (a+b));
            return a+b;
        }
    }
    class Service2 extends Service{
        @Override
        // if u can use over... u should write datatype and parameter as some
        public int sum(int a, int b){
            System.out.println("This is sum of child class.");
            System.out.println("This is result of sum : " + (a+b));
            return a+b;
        }
    }

    /*

// run-time polymorphism or overloading
class Animal{
    public void run(){
        System.out.println("Animal is running");
    }
}
class Cat extends Animal{
    @Override
    public void run() {
        System.out.println("Cat is running");
    }
}

     */

public class Overloading01 {
    public static void main(String[] args) {
        // service
        Service service = new Service();
        service.sum(1, 2);

        System.out.println("=".repeat(50));

        // service 2
        Service2 service2 = new Service2();
        service2.sum(3, 4);
    }
}
