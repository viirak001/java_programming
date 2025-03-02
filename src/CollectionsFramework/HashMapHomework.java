package CollectionsFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class HashMapHomework {
    private static Map<Integer, String> studentInfo = new HashMap<>();

    // Add Student Name...
    private static boolean addNewStudentName(String studentName){
        int key = new Random().nextInt(999999);
        studentInfo.put(key, studentName);
        return true;
    }

//    Search Student By ID...
//    private static boolean searchStudentId(int id, String student) {
//        int searchId
//
//    }

//  Remove or Delete Student By ID...
    private static boolean removeStudentById(int id){
        String value = studentInfo.remove(id);

        // check
        if (value != null){
            return true;
        }
        return false;
    }

//  Update Student By ID...
    private static boolean updateStudentById(int id, String newName){
        String value = studentInfo.put(id, newName);

        // check
        if (value != null){
            return true;
        }
        return false;
    }

//  Choose Option...
    private static void home(){

        // loop
        while (true) {
            System.out.print("""
                    ========================
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
                    System.out.println(" >>> Student Record <<< ");
                    System.out.print(" 👉 Insert student name to add to record: ");
                    String name = new Scanner(System.in).nextLine();
                    boolean isInserted = addNewStudentName(name);
                    System.out.println(studentInfo);
                }
                case 2 -> {
                    System.out.println(" >>> Search By ID <<< ");
                    System.out.print(" 👉 Insert student ID to search: ");
                    int searchId = new Scanner(System.in).nextInt();

                    //check
                    boolean foundId = false;
                    for (int i=0;i<=searchId;i++){

                    }
                }
                case 3 -> {}
                case 4 -> {}
                case 5 -> System.exit(0);

            }
        }
    }

    // Call the method
    public static void main(String[] args) {
        System.out.println(studentInfo);
        home();
    }
}
