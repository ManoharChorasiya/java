import java.util.Scanner;

class LowestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter third number: ");
        int num3 = input.nextInt();

        System.out.print("Enter fourth number: ");
        int num4 = input.nextInt();

        int lowest;

        if (num1 <= num2 && num1 <= num3 && num1 <= num4) {
            lowest = num1;
        } else if (num2 <= num1 && num2 <= num3 && num2 <= num4) {
            lowest = num2;
        } else if (num3 <= num1 && num3 <= num2 && num3 <= num4) {
            lowest = num3;
        } else {
            lowest = num4;
        }

        System.out.println("The lowest number is: " + lowest);

        input.close();
    }
}