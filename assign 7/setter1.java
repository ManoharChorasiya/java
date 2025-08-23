class Employee{
    private int id;
    private String name;
    private int salary; 

    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name =name;
    }
    public String getName(){
        return name;
    }
    public void setSalary(int salary){
        this.salary =salary;
    }
    
        public void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Id : " + + id);
        System.out.println("Salary: $" + salary);
    }
    }

class TestMain{
    public static void main(String args[]){
    Employee obj = new Employee();
    obj.setId(12);
    obj.setName("msr");
    obj.setSalary(50000);
    obj.display();
    
}
}