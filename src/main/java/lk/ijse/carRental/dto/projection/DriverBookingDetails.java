package lk.ijse.carRental.dto.projection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

/**
 * @author Sasindu Malshan
 * @project CarRental
 * @date 11/3/2023
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class DriverBookingDetails {
    private String booking_id;
    private String userName;
    private String reg_number;
    private String nic;
    private LocalDate booking_start;
    private LocalDate booking_end;
    private String status;


}
