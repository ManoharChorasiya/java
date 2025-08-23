import java.util.Scanner;

class GradeCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the percentage: ");
        double percentage = input.nextDouble();

        String grade;

        if (percentage > 90) {
            grade = "A";
        } else if (percentage > 80 && percentage <= 90) {
            grade = "B";
        } else if (percentage >= 60 && percentage <= 80) {
            grade = "C";
        } else { // percentage < 60
            grade = "D";
        }

        System.out.println("The grade is: " + grade);

        input.close();
    }
}