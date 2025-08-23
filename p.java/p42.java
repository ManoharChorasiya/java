import java.util.Scanner;

class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double units, amount, surcharge, total;

        System.out.print("Enter electricity units consumed: ");
        units = scanner.nextDouble();

        if (units <= 50) {
            amount = units * 0.50;
        } else if (units <= 150) {
            amount = 50 * 0.50 + (units - 50) * 0.75;
        } else if (units <= 250) {
            amount = 50 * 0.50 + 100 * 0.75 + (units - 150) * 1.20;
        } else {
            amount = 50 * 0.50 + 100 * 0.75 + 100 * 1.20 + (units - 250) * 1.50;
        }

        surcharge = amount * 0.20;
        total = amount + surcharge;

        System.out.printf("Electricity Bill = Rs. %.2f\n", total);
        
        scanner.close();
    }
}

