package OPP_Object_Oriented_Programming;

// private can not use in the class but use public proteted and defualt and static can use
    class Person{
        Integer id;
        String email;
        String name;
    }

    class Teacher extends Person{}
    class Student extends Person{
        String studentCardNumber;
    }

public class InheritanceIntro {
    public static void main(String[] args) {
        // from class Teacher ... create object...called teacher
        Teacher teacher = new Teacher();
        teacher.id = 1;
        teacher.email = "virak123@gamil.com";
        teacher.name = "Virak";

        // from class Student ... create object ... called student
        Student student = new Student();
        student.id = 1;
        student.email = "Vireak123@gmail.com";
        student.name = "Vireak";
        student.studentCardNumber = "A1-B2-AB-CD";

    }
}
