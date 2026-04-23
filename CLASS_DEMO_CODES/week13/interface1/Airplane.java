public class Airplane implements Flyable{
    

    @Override
    public void takeOff() {
        System.out.println("Airplane: Engines at full thrust. Taking off...");
    }

    @Override
    public void land() {
        System.out.println("Airplane: Lowering landing gear. Touching down...");
    }

    @Override
    public void fly() {
        System.out.println("Airplane: Cruising at 30000 feet.");
    }
}
