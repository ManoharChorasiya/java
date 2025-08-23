import java.util.Scanner;
class NumberToWord {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 5: ");
        int number = input.nextInt();

        if (number == 1) {
            System.out.println("One");
        } else if (number == 2) {
            System.out.println("Two");
        } else if (number == 3) {
            System.out.println("Three");
        } else if (number == 4) {
            System.out.println("Four");
        } else if (number == 5) {
            System.out.println("Five");
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 5.");
        }

        input.close();
    }
}