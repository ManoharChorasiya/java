 class Product {
    private String productId;
    private String name;
    private int quantity;
    private double price;

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double calculateTotalValue() {
        return quantity * price;
    }
    class TestMain{
    public static void main(String[] args) {
        Product product = new Product();
        product.setProductId("P01");
        product.setName("Laptop");
        product.setQuantity(5);
        product.setPrice(799.00);
        System.out.println("Total Value: $" + product.calculateTotalValue());
    }
}

}