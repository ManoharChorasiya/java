import java .util.Scanner;
class Prog{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("length");
        double length = sc.nextDouble();
         System.out.println("width");
        double width = sc.nextDouble(); 
         System.out.println("cost");
        double cost = sc.nextDouble();
        double a = cost/width;
        double b =a/length;
        double perimeter = 2*(length+b);
        System.out.println("perimeter of park :"+perimeter);
    }
}
