package lk.ijse.carRental.dto;

import lk.ijse.carRental.utility.types.LossDamage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

/**
 * @author Sasindu Malshan
 * @project CarRental
 * @date 10/25/2023
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString


public class BookingDetails {

    private String booking_id;

    private String reg_number;

    private double used_km;
    private double pre_km;
    private LossDamage lossDamage;
    private LocalDate booking_end;
    private LocalDate booking_start;
    private String d_nic;
    private double ex_km;
    private double free_km;

    private Booking booking;

    private CarDTO carDTO;
}
