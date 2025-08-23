import java.util.Scanner;
class NumberReverser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 4-digit number: ");
        int number = scanner.nextInt();

        int reversedNumber = 0;
        int originalNumber = number;

        if (originalNumber >= 1000 && originalNumber <= 9999) {
            while (number > 0) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                number /= 10;
            }
            System.out.println("Reversed number: " + reversedNumber);
        } else {
            System.out.println("Invalid input. Please enter a 4-digit number.");
        }

        scanner.close();
    }
}
