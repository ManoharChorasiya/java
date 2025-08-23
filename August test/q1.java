import java.util.Scanner;
class Test{
    private int a;
    
    public void seta(int a){
        this.a = a;
    }
    public int geta(){
        return a;
    }
    public void CheckPrimeNumber(int a){
        if (a%2 ==0){
            System.out.println("a is not a prime number ");
     }
     else{
        System.out.println("a is  prime number ");
     }
    }
  }


class CheckPrimeNumber{
  public static void main(String args[]){
    Test obj = new Test();
    obj.CheckPrimeNumber(4);

    }

  }
  