import java.time.LocalDate;
class Employee{
    private String name;
    private int Day ;
    private int month;
    private int year;
    private int salary;
    public Employee(String name,int Day,int month,int year,int salary){
        this.name = name;
        this.day = day;
        this.salary = salary;
        this.year = year;
        this.month = month;
        
    }
    public String getname(){
            return name;
    }
    public String getday(){
            return day;
    }

    public int getsalary(){
            return salary;
    }

    public void display(){
        System.out.println(name+" name "+day+" day"+salary+" salary ");
    }
    public void yearOfService(int year){
        if()
    }
}
class TestMain{
    public static void main(String args[]){
      Employee obj= new Employee("ms","vp",10000);
    
    obj.display();
   
    }
}
// import java.time.LocalDate;

// public class Employee {
//     private int hireYear;
//     private int hireMonth;
//     private int hireDay;
//     private double salary;

//     // Constructor
//     public Employee(double salary, int hireYear, int hireMonth, int hireDay) {
//         this.salary = salary;
//         this.hireYear = hireYear;
//         this.hireMonth = hireMonth;
//         this.hireDay = hireDay;
//     }

//     // Method to calculate years of service without using Period
//     public int getYearsOfService() {
//         LocalDate currentDate = LocalDate.now();
//         int currentYear = currentDate.getYear();
//         int currentMonth = currentDate.getMonthValue();
//         int currentDay = currentDate.getDayOfMonth();

//         int years = currentYear - hireYear;

//         // Adjust if current month/day is before hire month/day
//         if (currentMonth < hireMonth || (currentMonth == hireMonth && currentDay < hireDay)) {
//             years--;
//         }

//         return years;
//     }

//     // Method to display employee details (only numeric output)
//     public void displayEmployeeInfo() {
//         System.out.println("Salary: $" + salary);
//         System.out.println("Hire Date: " + hireYear + "/" + hireMonth + "/" + hireDay);
//         System.out.println("Years of Service: " + getYearsOfService());
//     }

//     // Main method for testing
//     public static void main(String[] args) {
//         Employee emp = new Employee(55000.0, 2015, 9, 1);
//         emp.displayEmployeeInfo();
//     }
// }
