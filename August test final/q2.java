class TestMain{
    public static void main(String args[]){
        char[]arr ={'j','a','v','a',' ','i','s',' ','v','e','r','y',' ',
                       's','i','m','p','l','e',};
        int start = 0;
        for (int i = 0; i <= arr.length; i++){
            if (i == arr.length || arr[i] == ' '){
                reverse(arr, start, i - 1);
                start = i+1;
        }
        }
        for (char word :arr) {
            System.out.print(word);
        }
       }
    public static void reverse(char[]arr, int left, int right){
        while (left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
    }
    }
}
