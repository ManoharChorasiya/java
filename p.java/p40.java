import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int physics, chemistry, biology, mathematics, computer;
        int totalMarks;
        double percentage;
        char grade;

        
        System.out.print("Enter marks for Physics: ");
        physics = input.nextInt();

        System.out.print("Enter marks for Chemistry: ");
        chemistry = input.nextInt();

        System.out.print("Enter marks for Biology: ");
        biology = input.nextInt();

        System.out.print("Enter marks for Mathematics: ");
        mathematics = input.nextInt();

        System.out.print("Enter marks for Computer: ");
        computer = input.nextInt();

        
        totalMarks = physics + chemistry + biology + mathematics + computer;
        percentage = (totalMarks / 500.0) * 100;

        
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("Total Marks: " + totalMarks + "/500");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        input.close();
    }
}

