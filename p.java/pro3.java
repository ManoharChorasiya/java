import java .util.Scanner;
class Prog{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter length");
        int l=sc.nextInt();
        System.out.println("enter w");
        int w=sc.nextInt();
        System.out.println("enter cost");
        int c=sc.nextInt();
        int a = l*w;
        double p = a/100*6;
        System.out.println("cost :"+ p);
    }
}