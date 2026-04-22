import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        //default and static
        Thermostat t1 = new Thermostat("Living Room", 25);
        t1.reportStatus();
        System.out.println("Low battery check (15%): " + SmartDevice.isLowBattery(15));

        //comparable
        Thermostat[] devices = {
            new Thermostat("CR", 15),
            new Thermostat("Bedroom", 20),
            new Thermostat("Kitchen", 33.5),
            new Thermostat("Attic", 23),
            new Thermostat("Garage", 33.5),
        };

        Arrays.sort(devices);
        System.out.println("Sorted thermostat devices");
        for(Thermostat t : devices) System.out.println(t);

        //cloneable
        SmartCamera frontDoor = new SmartCamera("Froot Door");
        frontDoor.record("Robber spotted at 8:00 PM");

        SmartCamera kitchenCam = (SmartCamera) frontDoor.clone();
        kitchenCam.record("Chef got stabbed at 8:20 PM");
        System.out.println("Original Cam");
        frontDoor.showLogs();

        System.out.println("Cloned cam");
        kitchenCam.showLogs();
        

    }
}
