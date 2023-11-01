package lk.ijse.carRental.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Sasindu Malshan
 * @project CarRental
 * @date 10/25/2023
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookingDetails_PK implements Serializable {
    private String booking_id;
    private String reg_number;
    private String d_id;
}
