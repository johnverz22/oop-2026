public class Thermostat implements SmartDevice, Comparable<Thermostat>{
    private String room;
    private double temperature;

    
    public Thermostat(String room, double temperature) {
        this.room = room;
        this.temperature = temperature;
    }

    public double getTemperature(){
        return temperature;
    }

    @Override
    public void performAction() {
       System.out.println("Thermostat in " + room + ": Adjusting to " + temperature + "°C");
        
    }
    

    public int compareTo(Thermostat other){
        if(this.temperature != other.temperature)
            return Double.compare(this.temperature, other.temperature); //ascending

        return this.room.compareTo(other.room);
    }

    @Override
    public String toString() {
        return room + "("+temperature+"°C)";
    }
    
}
