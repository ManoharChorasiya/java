import java.util.Scanner;

class RoadTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Cost price of bike: ");
        double cost;
        try {
          cost = input.nextDouble();
        } catch (java.util.InputMismatchException e) {
          System.out.println("Invalid input. Please enter a number.");
          return;
        }

        double tax;
        if (cost > 100000) {
            tax = cost * 0.15;
        } else if (cost > 50000 && cost <= 100000) {
            tax = cost * 0.10;
        } else {
            tax = cost * 0.05;
        }
        System.out.println("Road tax to be paid: " + tax);
    }
}