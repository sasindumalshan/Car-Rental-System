package lk.ijse.carRental.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Sasindu Malshan
 * @project CarRental
 * @date 10/31/2023
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class img {
        private MultipartFile c_nic_f_image;
        private MultipartFile c_nic_d_image;

}
