public class Main {
    public static void main(String[] args) {
        //default and static
        Thermostat t1 = new Thermostat("Living Room", 0);
        t1.reportStatus();
        System.out.println("Battery Level is true (15%): " + SmartDevice.isLowBattery(15));
    }
}
