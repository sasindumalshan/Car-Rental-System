package lk.ijse.carRental.dto;

import lk.ijse.carRental.utility.types.UserAccess;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

/**
 * @author Sasindu Malshan
 * @project CarRental
 * @date 10/25/2023
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString


public class Booking {
    private String booking_id;
    private byte[] slip;
    private String c_nic;
    private LocalDate date;
    private LocalTime time;
    private UserAccess status;
    private double net_payment;
    private double booking_payment;

    private List<BookingDetails> orderDetails;

    private UserDTO userDTO;

}
