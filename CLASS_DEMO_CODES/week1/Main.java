public class Main{
    public static void main(String[] args){
        Laptop laptop1 = new Laptop();
        //use dot notation to access object's property
        laptop1.brand = "Asus";
        laptop1.model = "TUF Gaming 16";
        laptop1.condition = "New";
        laptop1.dimension = 15.6;
        laptop1.storage = 512;
        laptop1.memory = 12;
        laptop1.price = 42000;

        laptop1.print();

        var laptop2 = new Laptop();
        laptop2.brand = "Dell";
        laptop2.model = "Latitude 7390";
        laptop2.condition = "Old";
        laptop2.dimension = 13.3;
        laptop2.storage = 256;
        laptop2.memory = 8;
        laptop2.price = 35000;

        System.out.println();
        laptop2.print();

        Student s1 = new Student();
        s1.firstName = "Maryx";
        s1.lastName = "Corpuz";

        Student s2 = new Student();
        s2.firstName = "Eliza";
        s2.lastName = "Parchamento";

        System.out.println(s1.getFullName());
        System.out.println(s2.getFullName());

    }
}

