package lk.ijse.carRental.dto.projection;

import lk.ijse.carRental.utility.types.UserAccess;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author Sasindu Malshan
 * @project CarRental
 * @date 11/2/2023
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class BookingProjectionDTO {
    private String carCode;
    private double carRentPrice;
    private String start;
    private String endDate;


    private String booking_id;
    private String nic;
    private LocalDate date;
    private LocalTime time;
    private UserAccess status;
    private double net_payment;
    private double booking_payment;
    private int carCount;
}
