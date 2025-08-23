import java.util.Scanner;
class Discount{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("enter unit");
        int unit = input.nextInt();
        int totalbill = unit*100;

        System.out.println("total bill amount"+totalbill);
        if(totalbill>=1000){
            System.out.println("10% discount");
            double P =(10*totalbill)/100;
            double TAAD = totalbill - P;
            
            System.out.println("total amount after discount ="+TAAD);}
            else
            System.out.println("no discount");
        }

    }
