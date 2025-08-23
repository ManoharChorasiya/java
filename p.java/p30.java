import java.util.Scanner;

 class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'c' to convert Fahrenheit to Celsius or 'f' to convert Celsius to Fahrenheit:");
        char choice = scanner.next().charAt(0);

        if (choice == 'c' || choice == 'C') {
            System.out.println("Enter temperature in Fahrenheit:");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println(fahrenheit + " Fahrenheit is " + celsius + " Celsius");
        } else if (choice == 'f' || choice == 'F') {
            System.out.println("Enter temperature in Celsius:");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
        } else {
            System.out.println("Invalid choice.");
        }
        scanner.close();
    }
}


