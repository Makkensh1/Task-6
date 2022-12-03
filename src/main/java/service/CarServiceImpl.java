package service;

import model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService{
    @Override
    public List<Car> getCars( int value) {

        List<Car> carList = new ArrayList<>();
        carList.add(new Car(2105, "Vaz5", 0));
        carList.add(new Car(2106, "Vaz6", 500));
        carList.add(new Car(2107, "Vaz7", 100));
        carList.add(new Car(2108, "Vaz8", 8500));
        carList.add(new Car(2110, "Vaz9", 1500));
        carList.add(new Car(2111, "Vaz9", 7500));
        carList.add(new Car(2112, "Vaz9", 64500));
        carList.add(new Car(2113, "Vaz9", 2100));

        if(value >= 5){
            return carList;
        } else {
            return carList.stream().limit(value).collect(Collectors.toList());
        }

    }
}
