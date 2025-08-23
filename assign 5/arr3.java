import java.util.Scanner;
class A1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter data size");
        int n = sc.nextInt();

        int arr[] = new int[n]; 
        int sum = 0;
        int sumodd = 0;
        for(int i = 0;i<n; i++){
            System.out.println("enter "+(i+1)+" element");
            arr[i] = sc.nextInt();
        }
        System.out.println("given data... ");
        for(int i=0;i<n;i++)
        if(arr[i] % 2==0){
        sum += arr[i];
        }
        else
        {
        sumodd += arr[i];
        }

         System.out.println("Sum of even numbers: " + sum);
        System.out.println("Sum of odd numbers: " + sumodd);
    }
}
