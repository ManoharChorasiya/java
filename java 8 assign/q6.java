class Employee{
    private String name;
    private String title;
    private int salary;
    public Employee(String name,String title,int salary){
        this.name = name;
        this.title = title;
        this.salary = salary;
        
    }
    public String getname(){
            return name;
    }
    public String gettitle(){
            return title;
    }
    public int getsalary(){
            return salary;
    }

    public void display(){
        System.out.println(name+" name "+title+" title "+salary+" salary ");
    }
}
class TestMain{
    public static void main(String args[]){
      Employee obj= new Employee("ms","vp",10000);
    Employee obj2 = new Employee("yo","pd",700000);
    obj.display();
    obj2.display(); 
    }
}