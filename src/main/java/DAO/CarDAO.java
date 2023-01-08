package DAO;

import model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {
    private static List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(2105, "Vaz5", 0));
        cars.add(new Car(2106, "Vaz6", 500));
        cars.add(new Car(2107, "Vaz7", 100));
        cars.add(new Car(2108, "Vaz8", 8500));
        cars.add(new Car(2110, "Vaz9", 1500));
        cars.add(new Car(2111, "Vaz9", 7500));
        cars.add(new Car(2112, "Vaz9", 64500));
        cars.add(new Car(2113, "Vaz9", 2100));
    }

    public List<Car> getCars() {
        return cars;
    }
}
