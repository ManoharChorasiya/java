import java.util.Scanner;

  class DivisibilityCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (number % 5 == 0 && number % 11 == 0) {
            System.out.println(number + " is divisible by both 5 and 11.");
        } else {
            System.out.println(number + " is not divisible by both 5 and 11.");
        }

        scanner.close();
    }
}

