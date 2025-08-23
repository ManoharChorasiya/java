import java.util.Scanner;
class P27{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("enter two number");
      int a = sc.nextInt();
      int b = sc.nextInt();
       switch( a * b ){
        case 0 : ("a*b");
        
        System.out.println(" multiply");break;
        case 1 : ("a/b");

        default : System.out.print("division");
       }

    }
}