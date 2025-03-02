package CollectionsFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class testt {

    class Student {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

        public void main(String[] args) {
            // Creating a HashMap with student ID as key and Student object as value
            Map<Integer, Student> studentMap = new HashMap<>();
            studentMap.put(101, new Student(101, "Alice"));
            studentMap.put(102, new Student(102, "Bob"));
            studentMap.put(103, new Student(103, "Charlie"));

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Student ID to search: ");
            int searchId = scanner.nextInt();

            Student foundStudent = searchStudentById(studentMap, searchId);

            if (foundStudent != null) {
                System.out.println("Student Found: " + foundStudent.getName());
            } else {
                System.out.println("Student not found.");
            }

            scanner.close();
        }

        public static Student searchStudentById(Map<Integer, Student> studentMap, int id) {
            return studentMap.get(id); // Direct lookup in HashMap (O(1) time complexity)
        }

}
