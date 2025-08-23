class Student {
    private String name;
    private int mathMarks;
    private int scienceMarks;

    public void setName(String name) {
        this.name = name;
    }

    public void setMathMarks(int mathMarks) {
        this.mathMarks = mathMarks;
    }

    public void setScienceMarks(int scienceMarks) {
        this.scienceMarks = scienceMarks;
    }

    public double getAverage() {
        return (mathMarks + scienceMarks) / 2.0;
    }

    public void printStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Math Marks: " + mathMarks);
        System.out.println("Science Marks: " + scienceMarks);
        System.out.println("Average Marks: " + getAverage());
    }
}

public class StudentResultChecker {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Alice");
        student.setMathMarks(85);
        student.setScienceMarks(90);
        student.printStudentInfo();
    }
}
