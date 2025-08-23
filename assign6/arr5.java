import java.util.Scanner;
class Array{
    public static void main(String args []){
        Scanner sc = new  Scanner(System.in);
        System.out.println("inter the size array");
        int n = sc.nextInt();
        int arr [] = new int [n]; 
       
        for(int i =0; i<arr.length;i++){
            System.out.println("inter the "+(i+1)+" element");
            arr[i] = sc.nextInt();
        }
        //System.out.println("inter which element to be find");
       // for(int i =0; i<arr.length;i++){
        //    int k = sc.nextInt();
       // }
        boolean found = false;
       int count = 1;
        for(int i =0; i<arr.length;i++){
            for(int j =i+1; i<arr.length;j++)
        if(arr[i] == arr[j]){
        found = true;
        count++;
        break;
        }
        if(found){
        System.out.println("times occurence"+count);
        }
        }
    }
}