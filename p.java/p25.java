import java.util.Scanner;
class CheckEvenOdd{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter  number:");
        int n = input.nextInt();
        switch(n%2){
            case 0 : System.out.println("even");break;
            case-1 :
            default: System.out.println("odd");break;
        }
        }
}