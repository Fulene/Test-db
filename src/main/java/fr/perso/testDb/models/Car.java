package fr.perso.testDb.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Getter @Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    @Id
    @GeneratedValue
    private Long id;
    private String mark;
    private String model;
    private Long price;
    @OneToMany(mappedBy = "car", fetch = FetchType.EAGER)
    private Set<CarEngine> engines = new LinkedHashSet<>();

    public Car(String mark, String model, Long price) {
        this.mark = mark;
        this.model = model;
        this.price = price;
    }

}
