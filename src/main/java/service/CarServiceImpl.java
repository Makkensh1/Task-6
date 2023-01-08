package service;

import DAO.CarDAO;
import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private CarDAO carDAO;

    @Autowired
    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> getCars(int value) {
        if (value >= 5) {
            return carDAO.getCars();
        } else {
            return carDAO.getCars().stream().limit(value).collect(Collectors.toList());
        }
    }
}
