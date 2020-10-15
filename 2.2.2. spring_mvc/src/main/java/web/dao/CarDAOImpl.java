package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO{
    private List<Car> cars;

    public CarDAOImpl() {
    }

    {
        cars = new ArrayList<>();

        cars.add(new Car(1, "Toyota", "G86"));
        cars.add(new Car(2, "Tesla", "X"));
        cars.add(new Car(3, "Appolon", "1"));
        cars.add(new Car(4, "Mercedes", "S600"));
        cars.add(new Car(5, "Lada", "2106"));
    }
    @Override
    public List<Car> getCars(int count) {
        List<Car> carsOfCount = new ArrayList<>();
        if (count <= cars.size()) {
            for (int i = 0; i < count; i++)
                carsOfCount.add(cars.get(i));
            return carsOfCount;
        } else if (count > cars.size() || count <= 0) {
            for (int i = 0; i < cars.size(); i++)
                carsOfCount.add(cars.get(i));
            return carsOfCount;
        }
        return carsOfCount;
    }
}

