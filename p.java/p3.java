import java.util.Scanner;
class P3{
    public static void main(String args[]){
        Scanner input = new Scanner (System.in);
        System.out.println("enter no of year served");
        int year = input.nextInt();
        
        System.out.println("sallry");
        int sallry = input.nextInt();
        double bonus = 0.0;
        if(year>5){

        bonus = sallry*5/100;
        System.out.println("bonus amount :"+ bonus);}
        else
        System.out.println("no bonus");
    }
}