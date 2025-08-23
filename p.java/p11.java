import java.util.Scanner;
class P12{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter sex (M or F): ");
        char sex = scanner.next().Charat(0);

        System.out.print("Enter marital status (Y or N): ");
        char maritalStatus = scanner.next().Charat(0);

        if (sex == 'F') {
            System.out.println("You will work in urban areas.");
        } else if (sex == 'M') {
            if (age >= 20 && age <= 40) {
                System.out.println("You may work anywhere.");
            } else if (age > 40 && age <= 60) {
                System.out.println("You will work in urban areas only.");
            } else {
                System.out.println("ERROR");
            }
        } else {
            System.out.println("ERROR");
        }

        scanner.close();
    }
}