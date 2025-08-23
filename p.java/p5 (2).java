import java.util.Scanner;
class P5{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter age");
        int age = sc.nextInt();
        if(age<20)
        System.out.println("younger");
        else if(age>60)
        System.out.println("oldest");
        else
        System.out.println("none of them");
    }
}
