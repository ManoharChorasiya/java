import java.util.Scanner;
class RoadTax{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("cost price of bike:");
        double cost = input.nextDouble();
        double tax;
        if(cost >100000)
        tax = "cost *0.15";
        else if(cost50000>$$cost<=100000)
        tax = "cost * 0.10";
        else (cost <=50000);
        tax = "cost * 0.5";
        System.out.println("Road tax to be paid :"+ tax);

            }
}
