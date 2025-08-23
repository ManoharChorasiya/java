class RectangleAreaCalculator{
    private int length;
    private int width;

    public void setLength(int length){
        this.length = length;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public void calculate(){
        System.out.println(length);
        System.out.println(width);

        System.out.println("area of rectangle  " +  length * width);
    }
}
class TestMain{
public static void main(String args[]){
    RectangleAreaCalculator rectangleAreaCalculator  =  new RectangleAreaCalculator();
    
    rectangleAreaCalculator.setLength(20);
    rectangleAreaCalculator.setWidth(20);
    rectangleAreaCalculator.calculate();
}  
}