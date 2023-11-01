package lk.ijse.CarRental.repo;

import lk.ijse.carRental.config.WebRootConfig;
import lk.ijse.carRental.entity.CarImg;
import lk.ijse.carRental.repo.CarImagRepo;
import lk.ijse.carRental.utility.Photo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import java.io.IOException;

/**
 * @author Sasindu Malshan
 * @project CarRental
 * @date 10/27/2023
 */
@WebAppConfiguration
@ContextConfiguration(classes = {WebRootConfig.class})
@ExtendWith(SpringExtension.class)
public class CarImgRepoTest {

    @Autowired
    CarImagRepo imagRepo;

    @Test
    public void save(){
        try {
           // Photo.getImage("C:\\Users\\Sasindu Malshan\\Downloads\\pngwing.com (6).png");

            CarImg img=new CarImg("CI002",
                    Photo.getImage("C:\\Users\\Sasindu Malshan\\Downloads\\image-removebg-preview (3).png") ,
                    Photo.getImage("C:\\Users\\Sasindu Malshan\\Downloads\\image-removebg-preview (5).png") ,
                    Photo.getImage("C:\\Users\\Sasindu Malshan\\Downloads\\image-removebg-preview (6).png") ,
                    Photo.getImage("C:\\Users\\Sasindu Malshan\\Downloads\\image-removebg-preview (4).png")
                    );
            imagRepo.save(img);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
