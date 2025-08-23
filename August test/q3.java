
class Student {
    private String name;
    private int marks;

    public void setname(String name){
        this.name = name;
    }
    public void setmarks(int marks){
        this.marks = marks;
    }
    public String getname(){
        return this.name;
    }
    public int getmarks(){
        return this.marks;
    }
    public char getgrade(){
        if (marks >= 80) {
            return 'A';
        } else if (marks >= 60){
            return 'B';
        } else if (marks >= 40){
            return 'C';
        } else {
            return 'D';
        }
    }
}
class TestMain{
    public static void main(String args[]){
        Student obj1 = new Student();
        Student obj2 = new Student();

        obj1.setname("Ram");
        obj1.setmarks(75);
        obj2.setname("Shyam");
        obj2.setmarks(85);
        Student obj3 = new Student();
        obj3.setname("Ramu");
        obj3.setmarks(35);
        System.out.println("Name: " + obj1.getname() + ", Marks: " + obj1.getmarks() + ", Grade: " + obj1.getgrade());
        System.out.println("Name: " + obj2.getname() + ", Marks: " + obj2.getmarks() + ", Grade: " + obj2.getgrade());
        System.out.println("Name: " + obj3.getname() + ", Marks: " + obj3.getmarks() + ", Grade: " + obj3.getgrade());
    }
}
