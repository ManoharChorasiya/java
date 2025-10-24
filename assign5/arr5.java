import java.util.Scanner;
class A1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter data size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i= 0;i<n;i++){
            System.out.println("entere element"+(i+1));
            arr[i] = sc.nextInt();
        }
            System.out.println("given data...");
            for(int i= 0;i<n;i++)
            {
                if(arr[i]%5==0)
                arr[i] = 0;
                
            }
            for (int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
        }
    }
    