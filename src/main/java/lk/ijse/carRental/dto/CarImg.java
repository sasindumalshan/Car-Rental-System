package lk.ijse.carRental.dto;

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
 * @date 10/26/2023
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class CarImg {
    private String ci_id;
    private byte[] images_interior;
    private byte[] images_side;
    private byte[] images_back;
    private byte[] images_font;


}
