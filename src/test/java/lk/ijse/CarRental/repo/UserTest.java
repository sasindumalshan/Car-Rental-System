package lk.ijse.CarRental.repo;

import lk.ijse.carRental.config.WebRootConfig;
import lk.ijse.carRental.dto.BookingDTO;
import lk.ijse.carRental.dto.UserDTO;
import lk.ijse.carRental.entity.Booking;
import lk.ijse.carRental.entity.User;
import lk.ijse.carRental.repo.BookingRepo;
import lk.ijse.carRental.repo.UserRepo;
import lk.ijse.carRental.utility.Photo;
import lk.ijse.carRental.utility.types.Role;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import java.io.IOException;
import java.util.List;

/**
 * @author Sasindu Malshan
 * @project CarRental
 * @date 10/30/2023
 */
@WebAppConfiguration
@ContextConfiguration(classes = {WebRootConfig.class})
@ExtendWith(SpringExtension.class)
public class UserTest {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    ModelMapper mapper;
    @Autowired
    private BookingRepo bookingRepo;
    @Test
    public void save() throws IOException {
       /* UserDTO userDTO = new UserDTO(
                "200144367400",
                null,
                null,
                "user1237",
                "0770653200",
                "malshan@gmail.com",
                "galle",
                "wakwalla",
                "hapugala",
                "D023244133",
                null,
                null,
                null,
                "Sadani",
                "Perera"

        );*/

        //userRepo.save(user);

       /* if (userRepo.existsById(userDTO.getC_nic())){
            UserDTO map = mapper.map(userRepo.save(userDTO.toEntity()), UserDTO.class);
            System.out.println(map.toString());
        }else {
            throw new RuntimeException("User Not Exists");
        }*/
        mapper.map( bookingRepo.findByUser("200144367300"), new TypeToken< List<BookingDTO>>(){}.getType());
      //  List<Booking> byUser = bookingRepo.findByUser("200144367300");


        //boolean b = userRepo.existsByPasswordAndC_nic("user1237","");
  //  System.out.println(b);
    }
}
