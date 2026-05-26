import java.util.Scanner;

// Student class
class Student {
    String name;
    int studentID;
    double[] grades;

    // Constructor
    Student(String name, int studentID, double[] grades) {
        this.name = name;
        this.studentID = studentID;
        this.grades = grades;
    }

    // Method to calculate average
    double calculateAverage() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    // Method to display grades
    void displayGrades() {
        System.out.print("Grades: ");
        for (double grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println();
    }

    // Method to check pass/fail
    String getResult() {
        double avg = calculateAverage();
        return (avg >= 40) ? "Pass" : "Fail";  // assuming 40 is pass mark
    }

    // Display student details
    void displayStudent() {
        System.out.println("\nStudent Name: " + name);
        System.out.println("Student ID: " + studentID);
        displayGrades();
        System.out.println("Average: " + calculateAverage());
        System.out.println("Result: " + getResult());
    }
}

// Main class
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];
        double totalClassAverage = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1));

            sc.nextLine(); // consume newline
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter student ID: ");
            int id = sc.nextInt();

            System.out.print("Enter number of subjects: ");
            int subjects = sc.nextInt();

            double[] grades = new double[subjects];

            for (int j = 0; j < subjects; j++) {
                System.out.print("Enter grade for subject " + (j + 1) + ": ");
                grades[j] = sc.nextDouble();
            }

            students[i] = new Student(name, id, grades);
            totalClassAverage += students[i].calculateAverage();
        }

        // Display all students
        System.out.println("\n--- Student Details ---");
        for (Student s : students) {
            s.displayStudent();
        }

        // Calculate class average
        double classAverage = totalClassAverage / n;
        System.out.println("\nClass Average: " + classAverage);

        sc.close();
    }
}