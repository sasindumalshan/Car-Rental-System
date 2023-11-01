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
public class CarImg {
    @Id
    @Column(name = "ci_id", columnDefinition = "VARCHAR(64)")
    private String ci_id;
    @Column(name = "images_interior", columnDefinition = "LONGBLOB")
    private byte[] images_interior;
    @Column(name = "images_side", columnDefinition = "LONGBLOB")
    private byte[] images_side;
    @Column(name = "images_back", columnDefinition = "LONGBLOB")
    private byte[] images_back;
    @Column(name = "images_font", columnDefinition = "LONGBLOB")
    private byte[] images_font;


}
