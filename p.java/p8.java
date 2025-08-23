import java.util.Scanner;

class CharacterCaseChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        if (Character.isLowerCase(ch)) {
            System.out.println("The entered character '" + ch + "' is lowercase.");
        } else if (Character.isUpperCase(ch)) {
            System.out.println("The entered character '" + ch + "' is uppercase.");
        } else {
            System.out.println("The entered character '" + ch + "' is not an alphabet character.");
        }

        scanner.close();
    }
}