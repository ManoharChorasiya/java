import java.util.Scanner;
class A1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i=0;i<arr.length;i++){
            System.out.println("enter "+(i+1)+" element");
            arr[i] = sc.nextInt();
        }

        System.out.println("enter element to be search");
        int element = sc.nextInt();
        boolean found = false;

        for (int i=0; i < arr.length; i++){
            if(arr[i] == element){
                found = true;
                break;
            }
        }
        if(found)
            System.out.println("element found");
        else
            System.out.println("element not found");
    }
}
