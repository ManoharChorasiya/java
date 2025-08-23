public class ArrayReverser {

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        
        int start = 0;
        int end = originalArray.length - 1;

        while (start < end) {
            int temp = originalArray[start];
            originalArray[start] = originalArray[end];
            originalArray[end] = temp;
            start++;
            end--;
        }

        for (int num : originalArray) {
            System.out.print(num + " ");
        }
    }
}