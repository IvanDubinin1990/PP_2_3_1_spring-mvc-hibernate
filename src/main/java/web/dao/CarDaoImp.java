package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImp implements CarDao {

    private final List<Car> cars = new ArrayList<>(Arrays.asList(
            new Car("Lada", "white", 1),
            new Car("Mercedes", "black", 2),
            new Car("Volkswagen", "green", 3),
            new Car("Renault", "blue", 4),
            new Car("Peugeot", "red", 5)));

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
