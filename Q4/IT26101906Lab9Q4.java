import java.util.Scanner;

public class IT26101906Lab9Q4 {

    static double calcFinalMark(double assignment, double exam) {
        return assignment * 0.30 + exam * 0.70;
    }

    static char findGrades(double mark) {
        if (mark >= 75) return 'A';
        else if (mark >= 60) return 'B';
        else if (mark >= 50) return 'C';
        else return 'F';
    }

    static void printDetails(String name, double finalMark, char grade) {
        System.out.printf("%-16s%-12.2f%c%n", name, finalMark, grade);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 5;
        String[] names = new String[n];
        double[] finalMarks = new double[n];
        char[] grades = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter Name of Student " + (i + 1) + ": ");
            names[i] = input.next();
            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            double assignment = input.nextDouble();
            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            double exam = input.nextDouble();

            finalMarks[i] = calcFinalMark(assignment, exam);
            grades[i] = findGrades(finalMarks[i]);
        }

        System.out.println();
        System.out.printf("%-16s%-12s%s%n", "Name", "Final Mark", "Grade");
        for (int i = 0; i < n; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }
    }
}
