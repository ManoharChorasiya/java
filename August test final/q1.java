class TestMain{
    public static void main(String args []){
        int [] arr = {1, 2, 2, 3, 4, 4, 5};
 
         int n = arr.length;
        
        for ( int i = 0;i = n;i++){
            for(int j= i+1; j = n;j++)
            if(arr [i] == arr [j] ){
            arr[j]='\0';
            }
            else
            System.out.print(arr [j]+" ");
            {
             if (arr[i] != '\0')
            System.out.print("after remove duplicate : ");
        }
      }
    }
}