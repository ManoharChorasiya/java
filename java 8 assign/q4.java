class Rectangle{
    private int height;
    private int width;

    public Rectangle(int height,int width){
        this.height = height;
        this.width = width;
    }
    public int calculateArea(){
     return width* height;   
    }
    public int calculatePerimeter(){
        return 2 * (width*height);
    }
}
class TestMain{
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(34,6);
        System.out.println("area of rectangle  " +rec.calculateArea());
        System.out.println("perimeter of reactangle  "+ rec.calculatePerimeter());
}
}