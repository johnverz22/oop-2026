public class Product {
    String name;
    double price;
    int stock;
    static int productCount ;

    public Product(){}

    public Product(String name, double price, int stock){
        Product.productCount = 0;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getInfo(){
        return name + ": " + price + "/pc | Available - " +  stock;
    }
}
