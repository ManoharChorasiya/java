// \*Write a Java program to create a class called "Student" with a name, grade, 
// and courses attributes, and methods to add and remove courses.



import java.util.ArrayList;

class AddRemoveCourses {
    ArrayList<Student> al = new ArrayList<Student>();

    public void addCourses(Student student) {
        al.add(student);
    }

    public void removeCourses(Student student) {
        al.remove(student);
    }

    public void displayStudentDetails() {
        for (Student s : al) {
            System.out.println(s.getFullCoursesDetails());
        }
    }
}

class Student {
    private String name;
    private String grade;
    private String courses;

    public Student(String name, String grade, String courses) {
        this.name = name;
        this.grade = grade;
        this.courses = courses;
    }

    public String getFullCoursesDetails() {
        return name + " name " + grade + " grade " + courses + " courses";
    }
}

  class TestMain {
    public static void main(String args[]) {
        Student obj1 = new Student("Cheeku :", "b :", "pcm :");
        Student obj2 = new Student("Piku :", "a :", "pcb :");

        AddRemoveCourses university = new AddRemoveCourses();
        university.addCourses(obj1);
        university.addCourses(obj2);
        university.displayStudentDetails();

        university.removeCourses(obj1);
        System.out.println("-----------------");
        university.displayStudentDetails();
    }
}
