package lk.ijse.carRental.dto;

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


public class CarDTO {

    private String reg_number;
    private String type;
    private String brand;
    private TransmissionType transmission_type;
    private int no_of_passengers;
    private Fuel fuel_type;
    private CarImg carImg;
    private CarPrice cp_id;
    private String carCode;


}
