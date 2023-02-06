package fr.perso.testDb.models;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Getter @Setter
@NoArgsConstructor
public class CarEngine {

    @Id
    @GeneratedValue
    private Long id;
    private String ref;
    @ManyToOne
    private Car car;

    public CarEngine(String ref, Car car) {
        this.ref = ref;
        this.car = car;
    }

    @Override
    public String toString() {
        return "CarEngine{" +
            "id=" + id +
            ", ref='" + ref + '\'' +
            ", car=" + car.getId() +
            '}';
    }
}
