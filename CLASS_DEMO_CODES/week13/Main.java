import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Toyota Corolla Altis", 2005));
        cars.add(new Car("Toyota Avanza", 2020));
        cars.add(new Car("Tesla Model 3", 2023));
        cars.add(new Car("Ford Mustang", 1980));
        cars.add(new Car("Toyota Vios", 2010));
        cars.add(new Car("Mitsubishi Montero", 2019));
        
        System.out.println("Before sorting: " + cars);

        Collections.sort(cars);

        System.out.println("After sorting: " + cars);


    }
}
