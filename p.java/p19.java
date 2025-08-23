import java.util.Scanner;
class ExchngeValue{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

       System.out.println("enter two number");
       int a = input.nextInt();
       int b = input.nextInt();
       a = a+b;
       b = a-b;
       a = a-b;
       System.out.println("a exchange value :"+a);
       System.out.println("b exchange value :"+b);
    }
}