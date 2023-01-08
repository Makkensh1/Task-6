package controller;


import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.CarServiceImpl;

import java.util.List;

@Controller
@ComponentScan("service")
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false) int count, ModelMap model) {
        List<Car> carList = carService.getCars(count);
        model.addAttribute("cars", carList);
        return "cars";
    }
}
