package lk.ijse.carRental.entity;

import lk.ijse.carRental.utility.types.Role;
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

@Entity
public class User {

    @Id
    @Column(name = "c_nic", columnDefinition = "VARCHAR(64)")
    private String c_nic;
    @Column(name = "c_nic_f_image", columnDefinition = "LONGBLOB")
    private byte[] c_nic_f_image;
    @Column(name = "c_nic_b_image", columnDefinition = "LONGBLOB")
    private byte[] c_nic_b_image;
    private String password;
    private String contact;
    private String mail;
    private String city;
    private String lane;
    private String street;
    private String d_license;
    @Column(name = "d_b_image", columnDefinition = "LONGBLOB")
    private byte[] d_b_image;
    @Column(name = "d_f_image", columnDefinition = "LONGBLOB")
    private byte[] d_f_image;
    @Column(name = "role", columnDefinition = "VARCHAR(15)")
    @Enumerated(EnumType.STRING)
    private Role role;

}
