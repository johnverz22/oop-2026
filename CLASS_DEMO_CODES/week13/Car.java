public class Car implements Comparable<Car>{
    private String model;
    private int year;

    public Car(String model, int year){
        this.model = model;
        this.year = year;
    }

    @Override
    public int compareTo(Car other) {
        //return negative integer, zero, positive
        /*
         - this car is older
         + this car is newer
         0 same manufacturing year
        */

        return this.year - other.year;
    }

    @Override
    public String toString() {
        return String.format("%s (%d)", model, year);
    }

}
