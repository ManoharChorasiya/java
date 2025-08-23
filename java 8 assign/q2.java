class Person{
    private String name;
    private int age;
    public Person (String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getname(){
            return name;
    }
    public int getage(){
            return age;
    }
    public void display(){
        System.out.println(name+" name "+age+" age ");
    }
}
class PersonTest{
    public static void main(String args[]){
      Person obj= new Person("ms",6);
    Person obj2 = new Person("yo",7);
    obj.display();
    obj2.display(); 
    }
}