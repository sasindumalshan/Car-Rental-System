package lk.ijse.carRental.entity;

import lk.ijse.carRental.utility.types.Fuel;
import lk.ijse.carRental.utility.types.TransmissionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

/**
 * @author Sasindu Malshan
 * @project CarRental
 * @date 10/25/2023
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
public class Car {
    @Id
    @Column(name = "reg_number", columnDefinition = "VARCHAR(64)")
    private String reg_number;
    private String type;
    private String brand;
    @Column(name = "transmission_type", columnDefinition = "VARCHAR(15)")
    @Enumerated(EnumType.STRING)
    private TransmissionType transmission_type;
    private int no_of_passengers;
    @Column(name = "fuel_type", columnDefinition = "VARCHAR(15)")
    @Enumerated(EnumType.STRING)
    private Fuel fuel_type;

    @OneToOne(targetEntity = CarImg.class, cascade = CascadeType.ALL)
    private CarImg carImg;

    @OneToOne(targetEntity = CarPrice.class, cascade = CascadeType.ALL)
    private CarPrice cp_id;
    private String carCode;

}
