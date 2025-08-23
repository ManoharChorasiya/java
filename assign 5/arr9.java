import java.util.Scanner;

class TestMain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter data size:");
        int n = sc.nextInt();
        int arr[] = new int[n]; 

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Enter position to delete:");
        int position = sc.nextInt();

        if (position > n || position < 1) {
            System.out.println("Invalid position");
        } else {
            
            for (int i = position - 1; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }

            n = n - 1;

            System.out.println("After deletion:");
            for (int i = 0; i < n; i++)
                System.out.println(arr[i]);
        }

        sc.close();
    }
}
