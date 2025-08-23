
import java.util.Scanner;

  class ChoiceBasedOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your choice (+, >, ==): ");
        String choice = scanner.next();

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        if (choice.equals("+")) {
            int sum = num1 + num2;
            System.out.println("Sum = " + sum);
        } else if (choice.equals(">")) {
            if (num1 > num2) {
                System.out.println(num1 + " is greater.");
            } else if (num2 > num1) {
                System.out.println(num2 + " is greater.");
            } else {
                System.out.println("Both numbers are equal.");
            }
        } else if (choice.equals("==")) {
            if (num1 == num2) {
                System.out.println("Both numbers are equal.");
            } else {
                System.out.println("Numbers are not equal.");
            }
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}

