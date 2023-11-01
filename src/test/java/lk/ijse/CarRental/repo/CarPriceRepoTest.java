package lk.ijse.CarRental.repo;

import lk.ijse.carRental.config.WebRootConfig;
import lk.ijse.carRental.entity.CarPrice;
import lk.ijse.carRental.repo.CarPriceRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author Sasindu Malshan
 * @project CarRental
 * @date 10/27/2023
 */

@WebAppConfiguration
@ContextConfiguration(classes = {WebRootConfig.class})
@ExtendWith(SpringExtension.class)

public class CarPriceRepoTest {
    @Autowired
    private CarPriceRepo carPriceRepo;

    @Test
    public void save(){
        CarPrice carPrice=new CarPrice("CP002",100,71390.00 ,2500,3000,35);
        carPriceRepo.save(carPrice);
    }
}
