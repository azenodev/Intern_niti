import java.util.Scanner;

public class CGPACalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of subjects:");
        int numSubjects = scanner.nextInt();

        double totalCredits = 0;
        double totalGradePoints = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.println("Enter credits for subject " + i + ":");
            double credits = scanner.nextDouble();
            totalCredits += credits;

            System.out.println("Enter grade for subject " + i + ":");
            double grade = scanner.nextDouble();
            totalGradePoints += grade * credits;
        }

        double cgpa = totalGradePoints / totalCredits;

        System.out.println("Your CGPA is: " + cgpa);

        scanner.close();
    }
}