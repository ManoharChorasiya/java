class Library{
    private String title;
    private String name;
    private int price;
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setName(String name){
        this.name =name;
    }
    public String getName(){
        return name;
    }
    public void setPrice(int price){
        this.price =price;
    }
    public void display(){
        System.out.println("title"+ title);
    
        System.out.println("name"+ name);
        System.out.println("price" + price);
    }
    
}
class TestMain{
    public static void main(String args[]){
    Library obj = new Library();
    obj.setTitle("the power");
    obj.setName("msr");
    obj.setPrice(500);
    obj.display();
}
}