import java.util.Scanner;
class P6{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int number = sc.nextInt();
    int absolutenumber;
    if(number>0)
    absolutenumber = number;
    else 
    absolutenumber = - number;
    System.out.println("the absolute value is:"+ absolutenumber);
}
}
