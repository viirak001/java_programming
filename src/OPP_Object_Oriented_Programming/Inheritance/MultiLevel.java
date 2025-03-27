package OPP_Object_Oriented_Programming.Inheritance;

// Multi-level inheritance
class A{protected Integer id;}
class B extends A{}
class C extends B{}

public class MultiLevel {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        a.id = 1;
        b.id = 2;
        c.id = 3;
    }
}
