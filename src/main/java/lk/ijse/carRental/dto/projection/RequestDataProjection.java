package lk.ijse.carRental.dto.projection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * @author Sasindu Malshan
 * @project CarRental
 * @date 11/2/2023
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class RequestDataProjection {
   private String nic;
   private double netTotal;
   private List<BookingProjectionDTO> carBooking;
}
