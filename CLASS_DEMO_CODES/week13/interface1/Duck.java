public class Duck implements Flyable, Swimmable{
    
    @Override
    public void takeOff() {
        System.out.println("Duck: Splashing water and taking flight...");
    }

    @Override
    public void land() {
        System.out.println("Duck: Skidding onto the land...");
    }

    @Override
    public void fly() {
        System.out.println("Duck: Flying in V-formation...");
    }

    @Override
    public void swim() {
        System.out.println("Duck: Paddling webbed-feet underwater...");
        
    }
}
