
class A1{
    public static void main(String args[]){
        
        
        int arr[] ={1,5,4,7,9,2};
    
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++)
            {
                int temp;
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
         System.out.print("Sorted array:" );
        for ( int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
                }   
            }
            System.out.println(" shubham has changed someything ");
        }


      //this shubham who n=made the changwe 