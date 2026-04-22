public class Thermostat implements SmartDevice, Comparable<Thermostat> {
    private String room;
    private double temperature;
    
    public Thermostat(String room, double temperature) {
        this.room = room;
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }



    @Override
    public void performAction() {
        System.out.println("Thermostat in " + room  + ": Adjusting " + temperature + " °C.");
        
    }

    @Override
    public int compareTo(Thermostat o) {
        if(this.temperature != o.temperature){
            return Double.compare(this.temperature, o.temperature); //ascending
        }
        return this.room.compareTo(o.room);
    }

    @Override
    public String toString() {
        return room + " ("+temperature+"°C)";
    }
}
