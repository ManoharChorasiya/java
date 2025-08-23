import java.util.Scanner;
class P13{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("inputnumber");
        int daynumber = scanner.nextInt();
        String dayname;
        if(daynumber ==1)
        dayname = Monday;
        else if(daynumber ==2)
        dayname = tuesday;
        else if (daynumber ==3)
        dayname = wednesday;
        else if(daynumber == 4)
        dayname = thursday;
        else if(daynumber == 5)
        dayname = friday;
        else if(dayname == 6)
        dayname = saturday;
        else if(dayname == 7)
        dayname = sunday;
        else
        dayname = "invalid day range";
        System.out.println("dayname");
    }
}
