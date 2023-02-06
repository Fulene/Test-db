package fr.perso.testDb.services;

import fr.perso.testDb.dao.CarEngineRepository;
import fr.perso.testDb.models.CarEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarEngineService {

    @Autowired
    private CarEngineRepository repository;

    public CarEngine save(CarEngine engine) {
        return repository.save(engine);
    }

}
