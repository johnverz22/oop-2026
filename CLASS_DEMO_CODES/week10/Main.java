public class Main {
    public static void main(String[] args) {
        Animal a = new Dog("Angel", "Chiwawa");
        Animal b = a;
        Animal c = new Dog("Angel", "Chiwawa");
        System.out.println(b.equals(c));
        System.out.println(a == c);
       

    }
}
