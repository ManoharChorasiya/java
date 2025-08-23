class CircleGeometry{
    private int radius;
    public void setRadius(int radius){
       this.radius = radius; 
    }
    public void calculate(){
        System.out.println("circumference   "+ 2 * Math.PI *radius);
        System.out.println("area   "+ 2 * Math.PI *radius * radius); 
        System.out.println(radius);
    }

}
class TestMain{
public static void main(String args[]){
    CircleGeometry circleGeometry= new CircleGeometry();
    circleGeometry.setRadius(10);
    circleGeometry.calculate();
}
}