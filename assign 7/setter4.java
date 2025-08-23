class Car{
    private String model;
    private String brand;
    private int yearOfManufacture;

    public void setModel(String model){
        this.model = model;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setYearOfManufacture(int yearOfManufacture){
        this.yearOfManufacture = yearOfManufacture;

    }
    public void printCarInfo() {
        System.out.println("Car Info:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + yearOfManufacture);
    }
} 
class TestMain{
public static void main(String args[]){
    Car car = new Car();
    car.setModel("mrt8");
    car.setBrand("tty");
    car.setYearOfManufacture(2024);
    car.printCarInfo();
}
}