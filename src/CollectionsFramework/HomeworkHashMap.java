package CollectionsFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class HomeworkHashMap {
    private static Map<Integer, String> studentInfo = new HashMap<>();

    // Add Student Name...
    private static boolean addNewStudentName(String studentName){
        int key = new Random().nextInt(50);
        studentInfo.put(key, studentName);
        return true;
    }

    // Search Student By ID...
    private static boolean searchStudentId(int id) {
        if(studentInfo.containsKey(id)){
            System.out.println(" 👉 ID: " + id + " Student Name is: " + studentInfo.get(id));
            return true;
        }else {
            System.out.println("found");
            return false;
        }
    }

    //  Remove or Delete Student By ID...
    private static boolean removeStudentById(int id){
        String value = studentInfo.remove(id);

        // check
        if (value != null){
            studentInfo.remove(value, id);
            System.out.println(" 👉 successfully.");
            return true;
        }else {
            System.out.println(" 👉 found.");
            return false;
        }
    }

    //  Update Student By ID...i want to show new student and id
    private static boolean updateStudentById(int id, String newName){
        if (studentInfo.containsKey(id)) {
            studentInfo.put(id, newName);
            System.out.println(" 👉 Student ID " + id + " Name after updated is: " + newName);
            return true;
        } else {
            System.out.println(" 👉 Student ID " + id + " found.");
            return false;
        }
    }

    //  Choose Option...
    private static void home(){
    // loop
    while (true) {
        System.out.print("""
                    ===========Welcome========
                    1. Add student name
                    2. Search by ID
                    3. Delete student by ID
                    4. Update student by ID
                    5. Exit
                    ========================
                    """);

        System.out.print(" 👉 Insert Option: ");
        switch (new Scanner(System.in).nextInt()) {
            case 1 -> {
                System.out.println(" >>>\" Student Record \"<<< ");
                System.out.print(" 👉 Insert student name to add to record: ");
                String name = new Scanner(System.in).nextLine();
                boolean isInserted = addNewStudentName(name);
                System.out.println(studentInfo);
            }
            case 2 -> {
                System.out.println(" >>>\" Search By ID \"<<< ");
                System.out.print(" 👉 Insert student ID to search: ");
                int searchId = new Scanner(System.in).nextInt();
                searchStudentId(searchId);
            }
            case 3 -> {
                System.out.println(" >>>\" Delete student By ID \"<<< ");
                System.out.print(" 👉 Insert Student ID: ");
                int removeId = new Scanner(System.in).nextInt();
                removeStudentById(removeId);
            }
            case 4 -> {
                System.out.println(" >>>\" Update student By ID \"<<<");

                // Old student ID
                System.out.print(" 👉 Insert Old student ID to Update: ");
                int oldId = new Scanner(System.in).nextInt();

                // new student
                System.out.print("Insert new student: ");
                String newNames = new Scanner(System.in).nextLine();

                // Call the method update to passing the Old ID and new name to Update
                updateStudentById(oldId, newNames);
            }
            case 5 -> System.exit(0);
            default -> System.out.println("Good Job??!#$@, \"Please again!!\"");
        }
    }
}

    // Call the method
    public static void main(String[] args) {
        System.out.println(studentInfo);
        home();
    }
}
