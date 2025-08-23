import java.util.Scanner;
class P7{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("enter no of class held :");
        int totalclass = sc.nextInt();

        System.out.println("enter no of class attended :");
        int classattend = sc.nextInt();
        double percentage = double totalclass / classattend * 100;
        System.out.println("pecentage of class attend : %/n"+ percentage);

        if(percentage =< 75){

        System.out.println("not allowed");
        }

        else{
        System.out.println("allow to sit in exam");
        }
    }
}