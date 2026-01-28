public class Main {
    public static void main(String[] args) {
        Shop shopee = new Shop();
        shopee.name = "Louise Sari-sari Store";

        Product product1 = new Product("Condensed", 71.00, 10);
        Product product2 = new Product();
        product2.name = "Egg";
        product2.price = 12;
        product2.stock = 12;
        Product product3 = new Product("Camera lense", 15000, 1);

        shopee.productList = new Product[50];
        shopee.productList[0] = product1;
        shopee.productList[1] = product2;
        shopee.productList[2] = product3;


        System.out.println("This are the products of " + shopee.name);
        shopee.displayProducts();

    }
}
