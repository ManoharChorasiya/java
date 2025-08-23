import java.util.Scanner;
class P4{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter mark: ");
        int mark = sc.nextInt();
        if(mark<25)
        System.out.println("f");
        else if(mark<45)
        System.out.println("e");
        else if(mark<50)
        System.out.println("d");
        else if(mark<60)
        System.out.println("c");
        else if(mark<80)
        System.out.println("b");
        else
        System.out.println("a");
    }
}