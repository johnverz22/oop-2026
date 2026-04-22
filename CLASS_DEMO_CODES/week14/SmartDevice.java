public interface SmartDevice{
    void performAction();

    default void reportStatus(){
        System.out.println("[Status]: Device is operational.");
    }

    static boolean isLowBattery(int level){
        return level < 20;
    }
}