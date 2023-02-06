package fr.perso.testDb;

import fr.perso.testDb.models.Car;
import fr.perso.testDb.models.CarEngine;
import fr.perso.testDb.services.CarEngineService;
import fr.perso.testDb.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestDbApplication implements CommandLineRunner {

    @Autowired
    CarService carService;
    @Autowired
    CarEngineService carEngineService;

    public static void main(String[] args) {
        SpringApplication.run(TestDbApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        testDb();
        testUpdate();
    }

    private void testDb() {
        var car = carService.save(new Car("BMW", "Série 1", 50000L));
        var engine = carEngineService.save(new CarEngine("HJFRJ", car));

        System.out.println(carService.getAll().get(0));
    }

    private void testUpdate() {
        var car = new Car("BMW", "Série 2", 60000L);
        car.setId(1L);
        carService.save(car);
        System.out.println(carService.getAll().get(0));
    }

}
