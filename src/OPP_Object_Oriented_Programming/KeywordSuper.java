package OPP_Object_Oriented_Programming;

// Keyword Super(); call process in extend or interried
    class Parent {
        protected String name;
        protected Integer age;

        // constructor no parameter:
        public Parent(){}

        // constructor have parameter:
        public Parent(String name){
            this.name = name;
        }

        // create method run: ( for display )
        public void run(){
            System.out.println(name + " is running. ");
        }
    }

    // use the method Super();
    class Son extends Parent{
        public Son(String name){
            super(name);
        }
    }

public class KeywordSuper {
    public static void main(String[] args) {
        Parent son = new Son("Virak");
        son.run();
    }
}
