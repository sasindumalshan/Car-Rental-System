package lk.ijse.carRental.dto;

import lk.ijse.carRental.utility.types.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Sasindu Malshan
 * @project CarRental
 * @date 10/25/2023
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString


public class User {

    private String c_nic;
    private byte[] c_nic_f_image;
    private byte[] c_nic_b_image;
    private String password;
    private String contact;
    private String mail;
    private String city;
    private String lane;
    private String street;
    private String d_license;
    private byte[] d_b_image;
    private byte[] d_f_image;
    private Role role;

}
