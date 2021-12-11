package web.service;

import org.springframework.stereotype.Service;
import web.cars.Cars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarsList {
    private List<Cars> auto = new ArrayList<>();

    public Cars create(String color, String engine, int dors) {
        return new Cars(color, engine, dors);
    }
    {

        auto.add(create("green", "V8", 3));
        auto.add(create("orange", "V4", 2));
        auto.add(create("white", "V16", 4));
        auto.add(create("gold", "V8", 3));
        auto.add(create("black", "V6", 4));
    }

    public List<Cars> returnCars(int x) {
        return auto.stream().limit(x).collect(Collectors.toList());
    }
}
