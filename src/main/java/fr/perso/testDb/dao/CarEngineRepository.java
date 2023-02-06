package fr.perso.testDb.dao;

import fr.perso.testDb.models.CarEngine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarEngineRepository extends JpaRepository<CarEngine, Long> {
}
