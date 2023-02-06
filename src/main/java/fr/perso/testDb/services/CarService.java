package fr.perso.testDb.services;

import fr.perso.testDb.dao.CarRepository;
import fr.perso.testDb.models.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    @Autowired
    private CarRepository repository;

    public Car save(Car car) {
        return repository.save(car);
    }

    public List<Car> getAll() {
        return repository.findAll();
    }

    public Optional<Car> findById(Long id) {
        return repository.findById(id);
    }

}
