package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAOImpl;
import web.models.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{


    private CarDAOImpl carDAOImpl;
    @Autowired
    public CarServiceImpl(CarDAOImpl carDAOImpl) {
        this.carDAOImpl = carDAOImpl;
    }

    public CarServiceImpl() {
    }

    public CarDAOImpl getCarDAO() {
        return carDAOImpl;
    }

    public void setCarDAO(CarDAOImpl carDAOImpl) {
        this.carDAOImpl = carDAOImpl;
    }
    @Override
    public List<Car> getCars(int count){
        return carDAOImpl.getCars(count);
    }
}
