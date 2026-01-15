public class Main {
    public static void main(String[] args){
        Laptop obj1 = new Laptop();
        obj1.brand = "Asus";
        obj1.storage = 512;
        obj1.memory = 12;
        obj1.dimension = 16;
        obj1.model = "TUF Gaming 16";
        obj1.condition = "New";
        obj1.price = 42000;

        var obj2 = new Laptop();
        obj2.brand = "Dell";
        obj2.model = "Latitude 7390";
        obj2.memory = 8;
        obj2.storage = 256;
        obj2.dimension = 13.3;
        obj2.condition = "Old";
        obj2.price = 35000;

        obj1.printDetails();
        obj2.printDetails();


        Student student1 = new Student();
        student1.firstName = "Ira";
        student1.lastName = "Palabay";

        Student student2 = new Student();
        student2.firstName = "Kian";
        student2.lastName = "Estigoy";

        System.out.println(student1.getFullName());
        System.out.println(student2.getFullName());
    }
}



