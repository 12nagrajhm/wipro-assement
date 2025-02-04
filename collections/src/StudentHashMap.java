import java.util.HashMap;
import java.util.Map;

public class StudentHashMap {
    public static void main(String[] args) {
        // Create a HashMap to store student roll numbers and names
        HashMap<Integer, String> students = new HashMap<>();

        // Insert five student records
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");
        students.put(104, "Diana");
        students.put(105, "Ethan");

        // Retrieve and display the name of a student using a specific roll number
        int rollNumberToFind = 103;
        String studentName = students.get(rollNumberToFind);
        if (studentName != null) {
            System.out.println("Student with roll number " + rollNumberToFind + ": " + studentName);
        } else {
            System.out.println("Student with roll number " + rollNumberToFind + " not found.");
        }

        int rollNumberToRemove = 104;
        String removedStudent = students.remove(rollNumberToRemove);
        if (removedStudent != null) {
            System.out.println("Removed student with roll number " + rollNumberToRemove + ": " + removedStudent);
        } else {
            System.out.println("Student with roll number " + rollNumberToRemove + " not found.");
        }

        // Display all student records
        System.out.println("\nAll student records:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Roll Number: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
