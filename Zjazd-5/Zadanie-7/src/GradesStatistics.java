import org.jetbrains.annotations.NotNull;

import java.util.*;

public class GradesStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputValidation inputValidation = new InputValidation();
        int index = inputValidation.getUserInputInt(scanner, "Enter the number of students: ");
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < index; i++) {
            students.add(new Student(inputValidation.getUserInputDouble(scanner, "Enter the grade for student " + (i + 1) + ": ")));
        }
        scanner.close();
        printGrades(index, students);
        printGradesAverage(index, students);
        printGradesMedian(index, students);
        printGradesMinimum(index, students);
        printGradesMaximum(index, students);
        printStandardDeviation(index, students);
    }

    private static void printGrades(int index, ArrayList<Student> students) {
        System.out.print("The grades are: [");
        for (int i = 0; i < index - 1; i++) {
            System.out.print(students.get(i).grade + ", ");
        }
        System.out.print(students.get(index - 1).grade);
        System.out.println("]");
    }

    private static void printGradesAverage(int index, ArrayList<Student> students) {
        System.out.printf("The average is: %.2f%n", getGradesAverage(index, students));
    }

    private static double getGradesAverage(int index, ArrayList<Student> students) {
        double sum = 0;
        for (int i = 0; i < index; i++) {
            sum += students.get(i).grade;
        }
        return sum / index;
    }

    private static void     printGradesMedian(int index, @NotNull ArrayList<Student> students) {
        students.sort(Comparator.comparingDouble(Student::getGrade));
        double median;
        if (index % 2 == 0) {
            median = (students.get(index / 2 - 1).getGrade() + students.get(index / 2).getGrade()) / 2.0;
        } else {
            median = students.get(index / 2).getGrade();
        }
        System.out.printf("The median is: %.2f%n", median);
    }

    private static void printGradesMinimum(int index, ArrayList<Student> students) {
        students.sort(Comparator.comparingDouble(Student::getGrade));
        System.out.println("The minimum is: " + (int) students.getFirst().getGrade());
    }

    private static void printGradesMaximum(int index, ArrayList<Student> students) {
        students.sort(Comparator.comparingDouble(Student::getGrade));
        System.out.println("The maximum is: " + (int) students.getLast().getGrade());
    }

    private static void printStandardDeviation(int index, ArrayList<Student> students) {
        double mean = getGradesAverage(index, students);
        double variance = 0;
        for (int i = 0; i < index; i++) {
            double g = students.get(i).getGrade();
            variance += g * g;
        }
        variance = variance / index - mean * mean;
        System.out.printf("The standard deviation is: %.2f%n", Math.sqrt(variance));
    }
}