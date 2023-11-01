package lk.ijse.carRental.dto;

import lk.ijse.carRental.entity.User;
import lk.ijse.carRental.utility.types.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

import javax.swing.text.html.parser.Entity;
import java.io.IOException;

/**
 * @author Sasindu Malshan
 * @project CarRental
 * @date 10/25/2023
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString


public class UserDTO {

    private String c_nic;
    private MultipartFile c_nic_f_image;
    private MultipartFile c_nic_b_image;
    private String password;
    private String contact;
    private String mail;
    private String city;
    private String lane;
    private String street;
    private String d_license;
    private MultipartFile d_b_image;
    private MultipartFile d_f_image;
    private Role role;
    private String fistName;
    private String lastName;

   public User toEntity() throws IOException {
        User user = new User();
         user.setC_nic (this.getC_nic());
         try {
             user.setC_nic_f_image (this.getC_nic_f_image().getBytes());
         }catch (NullPointerException nullPointerException){}
       try {
           user.setC_nic_b_image(this.getC_nic_b_image().getBytes());
       }catch (NullPointerException nullPointerException){}

         user.setPassword (this.getPassword());
         user.setContact (this.getContact());
         user.setCity (this.getCity());
         user.setLane (this.getLane());
         user.setMail (this.getMail());
         user.setStreet (this.getStreet());
         user.setD_license (this.getD_license());
       try {
           user.setD_b_image (this.getD_b_image().getBytes());
       }catch (NullPointerException nullPointerException){}
         try {
             user.setD_f_image (this.getD_f_image().getBytes());
         }catch (NullPointerException nullPointerException){
         }

         user.setRole (this.getRole());
         user.setFistName (this.getFistName());
         user.setLastName (this.getLastName());
        return user;
    }

}
