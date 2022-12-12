package web.dao;

import org.springframework.stereotype.Repository;
import web.module.Car;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {
    @Override
    public List<Car> getListCars() {
        List<Car> carList = new ArrayList<>();
        Car car1 = new Car("Ford", "Black", 422);
        Car car2 = new Car("Nissan", "Red", 333);
        Car car3 = new Car("Kia", "Red", 645);
        Car car4 = new Car("BMW", "Black", 566);
        Car car5 = new Car("Honda", "Green", 177);
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        return carList;
    }
}
