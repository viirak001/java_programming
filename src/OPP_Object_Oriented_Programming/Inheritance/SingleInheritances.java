package OPP_Object_Oriented_Programming.Inheritance;

    class Parent {
        protected Integer id;
        protected String name;
        protected Integer age;

        //
        public Parent(){}

        //
        public Parent(Integer id, String name, Integer age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }
    }

    class Son extends Parent{
        static String creditCard;
    }

public class SingleInheritances {
    public static void main(String[] args) {
        // this one...can use...
        Parent son = new Son();
        son.id = 1;
        System.out.println("Son ID : " + son.id);

        /*
        // and or thi one...can use...
        Son sons = new Son();
        sons.id = 1;
        System.out.println("Son ID : " + sons.id);
        // but in class Son : u cannot call the method String creditCard to process
         */
    }
}
