import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        //creating the object of scanner class
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numOfStudents = input.nextInt();
        // Arrays to store marks, percentages, and grades
        int[] physicsMarks = new int[numOfStudents];
        int[] chemistryMarks = new int[numOfStudents];
        int[] mathsMarks = new int[numOfStudents];
        double[] percentages = new double[numOfStudents];
        char[] grades = new char[numOfStudents];
        // loop to take input marks for each student from user
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            // Input Physics marks
            physicsMarks[i] = getPositiveMarks(input, "Physics", i);
            // Input Chemistry marks
            chemistryMarks[i] = getPositiveMarks(input, "Chemistry", i);
            // Input Maths marks
            mathsMarks[i] = getPositiveMarks(input, "Maths", i);
            // Calculate percentage
            percentages[i] = (physicsMarks[i] + chemistryMarks[i] + mathsMarks[i]) / 3.0;
            // Calculate grade
            grades[i] = calculateGrade(percentages[i]);
        }

        // Display results
        System.out.println("\nStudent Results:");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s\n", "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        for (int i = 0; i < numOfStudents; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.2f %-10c\n",
                    (i + 1), physicsMarks[i], chemistryMarks[i], mathsMarks[i], percentages[i], grades[i]);
        }
    }

    // function to get positive marks input and decrement index if input is invalid
    public static int getPositiveMarks(Scanner input, String subject, int studentIndex) {
        int marks;
        while (true) {
            System.out.print("Enter " + subject + " marks for Student " + (studentIndex + 1) + " (0-100): ");
            marks = input.nextInt();
            if (marks >= 0 && marks <= 100) {
                break; // Valid input, exit loop
            } else {
                System.out.println("Invalid marks! Please enter a value between 0 and 100.");
            }
        }
        return marks;
    }

    // function to calculate grade based on percentage
    public static char calculateGrade(double percentage) {
        if (percentage >= 80) {
            return 'A';
        } else if (percentage >= 70) {
            return 'B';
        } else if (percentage >= 60) {
            return 'C';
        } else if (percentage >= 50) {
            return 'D';
        } else if (percentage >= 40) {
            return 'E';
        } else {
            return 'R';
        }
    }
}