package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarsList;


@Controller
public class CarContr {
    @Autowired
    CarsList serviceCar;

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int x , ModelMap model) {
        model.addAttribute("carsTab", serviceCar.returnCars(x));
        return "car-car";
    }
}