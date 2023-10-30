package lk.ijse.carRental.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

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
public class CarPrice {
    @Id
    @Column(name = "cp_id", columnDefinition = "VARCHAR(64)")
    private String cp_id;
    private double month_for_Rate_km;
    private double Day_for_free_Km;
    private double Monthly_rate;
    private double daily_rate;
    private double price_for_extra_km;
}
