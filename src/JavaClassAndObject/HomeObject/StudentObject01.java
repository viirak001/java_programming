package JavaClassAndObject.HomeObject;

    // Create Class : import from file model > Student
import JavaClassAndObject.modelClass.StudentClass;

// Create Object:
public class StudentObject01 {
    public static void main(String[] args) {
        StudentClass student1 = new StudentClass();
        student1.setStudentInfo(1, "Virak", "virak123@gmail.com");
        StudentClass student2 = new StudentClass();
        student2.setStudentInfo(2, "Verak", "verak123@gamail.com");
        student1.getStudentInfo();
        student2.getStudentInfo();
    }
}
