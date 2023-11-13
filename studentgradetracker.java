import java.util.ArrayList;
import java.util.Scanner;

public class studentgradetracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<Integer> studentGrades = new ArrayList<>();

        // Adding some initial students and grades
        studentNames.add("John Doe");
        studentGrades.add(85);
        studentNames.add("Jane Smith");
        studentGrades.add(90);

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Student Grade Tracker Menu:");
            System.out.println("1. Add a new student");
            System.out.println("2. View list of students and grades");
            System.out.println("3. Calculate and display the average grade");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add a new student and grade
                    System.out.print("Enter student name: ");
                    scanner.nextLine(); // Clear the buffer
                    String newStudent = scanner.nextLine();
                    studentNames.add(newStudent);

                    System.out.print("Enter student grade: ");
                    int newGrade = scanner.nextInt();
                    studentGrades.add(newGrade);
                    break;

                case 2:
                    // View list of students and grades
                    System.out.println("List of Students and Grades:");
                    for (int i = 0; i < studentNames.size(); i++) {
                        System.out.println(studentNames.get(i) + ": " + studentGrades.get(i));
                    }
                    break;

                case 3:
                    // Calculate and display the average grade
                    if (studentGrades.size() > 0) {
                        int total = 0;
                        for (int grade : studentGrades) {
                            total += grade;
                        }
                        double average = (double) total / studentGrades.size();
                        System.out.println("Average grade: " + average);
                    } else {
                        System.out.println("No students in the list.");
                    }
                    break;

                case 4:
                    isRunning = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
        System.out.println("Program exited.");
        scanner.close();
    }
}
