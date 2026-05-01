package Finals.Exceptions.Activity;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GradeCalculator {
    public static double calculateAverage(double[] grades) throws InvalidGradeException {
        double total = 0;

        for (int i = 0; i < grades.length; i++) {
            double grade = grades[i];

            if (grade >= 0 && grade <= 100) {
                total = total + grade;
            }
            else {
                throw new InvalidGradeException(grade, "Invalid grade: " + grade + ". Grade must be between 0 and 100.");
            }
        }
        return total / grades.length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] grades = new double[5];

        try {
            for (int i = 0; i < grades.length; i++) {
                System.out.print("Enter grade " + (i + 1) + ": ");
                grades[i] = input.nextDouble();
                calculateAverage(grades);
            }
            double average = calculateAverage(grades);
            System.out.println("The average grade is: " + average);
        } catch (InvalidGradeException e) {
            System.out.println("Error: " + e.getMessage());
            input.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numeric grades.");
            input.nextLine();
        } finally {
            System.out.println("Process complete.");
        }
        input.close();
    }
}
