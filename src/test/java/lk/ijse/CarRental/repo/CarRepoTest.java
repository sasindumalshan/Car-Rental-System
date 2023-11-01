package lk.ijse.CarRental.repo;

import lk.ijse.carRental.config.WebRootConfig;
import lk.ijse.carRental.dto.CarDTO;
import lk.ijse.carRental.entity.Car;
import lk.ijse.carRental.entity.CarImg;
import lk.ijse.carRental.entity.CarPrice;
import lk.ijse.carRental.repo.CarImagRepo;
import lk.ijse.carRental.repo.CarPriceRepo;
import lk.ijse.carRental.repo.CarRepo;
import lk.ijse.carRental.utility.types.Fuel;
import lk.ijse.carRental.utility.types.TransmissionType;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Sasindu Malshan
 * @project CarRental
 * @date 10/27/2023
 */
@WebAppConfiguration // create testing context
@ContextConfiguration(classes = {WebRootConfig.class}) //load configurations which wanted for test context
@ExtendWith(SpringExtension.class) //We have to use Jupiter with Spring Test as a vendor
public class CarRepoTest {
    @Autowired
    private CarRepo carRepo;
    @Autowired
    private CarPriceRepo carPriceRepo;
    @Autowired
    private CarImagRepo imagRepo;
    @Autowired
    private ModelMapper mapper;

    // @Test
    public void save() {
        Optional<CarPrice> byId = carPriceRepo.findById("CP002");
        CarPrice carPrice = mapper.map(byId, CarPrice.class);
        //System.out.println(carPrice.toString());

        Optional<CarImg> ci001 = imagRepo.findById("CI002");
        CarImg carImg = mapper.map(ci001, CarImg.class);
        Car car = new Car(
                "1235",
                "General Cars",
                "Suzuki",
                TransmissionType.MANUAL,
                5,
                Fuel.PETROL,
                carImg,
                carPrice,
                "1111"
        );
        carRepo.save(car);
    }

    @Test
    public void get() {
        List<Car> all = carRepo.findAll();

        List<CarDTO> map = mapper.map(all, new TypeToken<List<CarDTO>>() {
        }.getType());
        for (CarDTO d:map){
            System.out.println(d.getCarCode());
        }
    }

    @Test
    public void getCategory() {
        List<String> type = carRepo.findType();

        List<Car> carList=new ArrayList<>();
        for (String s:type) {
            List<Car> byType = carRepo.findByType(s);
            for (Car c : byType) {
                carList.add(c);
            }
        }

        for (Car c:carList) {
            System.out.println(c.toString());
        }

    }


}
