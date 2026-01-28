public class Shop {
    String name;
    Product[] productList;

    public Shop(){}
    public Shop(String name, Product[] list){
        this.name = name;
        productList = list;
    }

    public void displayProducts(){
        for(Product p : productList){
            if(p != null)
                System.out.println(p.getInfo());
        }
    }
}
