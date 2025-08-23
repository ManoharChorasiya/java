import java.util.Scanner;

 class GrossSalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double basicSalary, hra, da, grossSalary;

        System.out.print("Enter basic salary: ");
        basicSalary = input.nextDouble();

        if (basicSalary <= 10000) {
            hra = 0.20 * basicSalary;
            da = 0.80 * basicSalary;
        } else if (basicSalary <= 20000) {
            hra = 0.25 * basicSalary;
            da = 0.90 * basicSalary;
        } else {
            hra = 0.30 * basicSalary;
            da = 0.95 * basicSalary;
        }

        grossSalary = basicSalary + hra + da;

        System.out.println("Gross Salary: " + grossSalary);
        
        input.close();
    }
}
