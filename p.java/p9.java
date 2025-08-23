import java.util.Scanner;

    class ExamAttendance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of classes held: ");
        int totalClasses = scanner.nextInt();

        System.out.print("Enter the number of classes attended: ");
        int attendedClasses = scanner.nextInt();

        double attendancePercentage = (double) attendedClasses / totalClasses * 100;
        System.out.printf("Percentage of classes attended: %.2f%%\n", attendancePercentage);

        System.out.print("Do you have a medical cause? (Y/N): ");
        String medicalCause = scanner.next();

        if (attendancePercentage >= 75 || medicalCause.equalsIgnoreCase("Y")) {
            System.out.println("Student is allowed to sit in the exam.");
        } else {
            System.out.println("Student is not allowed to sit in the exam.");
        }

        scanner.close();
    }
}
