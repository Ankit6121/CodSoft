import java.util.*;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter the total number of the subject!: ");
        int total_marks = 0;
        float percentage = 0;

        int numberOfsubject = sc.nextInt();
        int marks[] = new int[numberOfsubject];
        System.out.println("enter the marks!");
        for (int i = 0; i < numberOfsubject; i++) {
            marks[i] = sc.nextInt();
        }
        for (int i = 0; i < numberOfsubject; i++) {
            total_marks = total_marks + marks[i];
        }
        percentage = total_marks / numberOfsubject;
        System.out.println("total obtained marks: " + total_marks);
        System.out.println("percentage " + percentage);
        if (percentage >= 91 && percentage <= 100) {
            System.out.println("grade " + "A1");
        } else if (percentage >= 81 && percentage <= 90) {
            System.out.println("grade " + "A2");
        }

        else if (percentage >= 71 && percentage <= 80) {
            System.out.println("grade " + "B1");
        } else if (percentage >= 61 && percentage <= 70) {
            System.out.println("grade " + "B2");
        } else if (percentage >= 51 && percentage <= 60) {
            System.out.println("grade " + "C1");
        } else if (percentage >= 41 && percentage <= 50) {
            System.out.println("grade " + "C2");
        } else if (percentage >= 33 && percentage <= 40) {
            System.out.println("grade " + "D");
        } else if (percentage >= 21 && percentage <= 32) {
            System.out.println("grade " + "D");
        } else if (percentage >= 20 && percentage <= 32) {
            System.out.println("grade " + "E1");
        } else if (percentage >= 0 && percentage <= 20) {
            System.out.println("grade " + "E2");
        }
    }
}
