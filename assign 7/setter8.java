class Mobile{
    private String model;
    private String brand;
    private int price;

    public void setModel(String model){
        this.model = model;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setPrice(int price){
        this.price = price;

    }
    public void affordable(){
        if(price<20000)
        System.out.println("affordable");
        else
        System.out.println("not affordable");

    }
    
    public void printMobileInfo() {
        System.out.println("mobile Info:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}
class TestMain{
public static void main(String args[]){
    Mobile mymobile = new Mobile();
    mymobile.setModel("mrt8");
    mymobile.setBrand("tty");
    mymobile.setPrice(2020);
    mymobile.printMobileInfo();
    mymobile.affordable();
}
}