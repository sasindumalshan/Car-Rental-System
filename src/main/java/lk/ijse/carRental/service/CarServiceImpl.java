package lk.ijse.carRental.service;

import lk.ijse.carRental.dto.CarDTO;
import lk.ijse.carRental.entity.Car;
import lk.ijse.carRental.repo.CarImagRepo;
import lk.ijse.carRental.repo.CarPriceRepo;
import lk.ijse.carRental.repo.CarRepo;
import lk.ijse.carRental.service.impl.CarService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Sasindu Malshan
 * @project CarRental
 * @date 10/27/2023
 */
@Service
@Transactional
public class CarServiceImpl implements CarService {
    @Autowired
    ModelMapper mapper;
    @Autowired
    private CarRepo carRepo;
    @Autowired
    private CarPriceRepo carPriceRepo;
    @Autowired
    private CarImagRepo imagRepo;


    @Override
    public List<CarDTO> getCars(int pageNo) {
        System.out.println(pageNo);
//        PageRequest request= PageRequest.of(pageNo,6, Sort.by("reg_number").descending());
        List<Car> car = carRepo.findAll();
        car.forEach( cars -> {
            System.out.println(cars.toString());
        });

        return mapper.map(car,new TypeToken< List<CarDTO>>(){}.getType());
    }

    @Override
    public List<CarDTO> getCarsForUi(String category) {
        /*List<String> type = carRepo.findType();

        List<Car> carList=new ArrayList<>();
        for (String s:type) {
            List<Car> byType = carRepo.findByType(s);
            for (Car c : byType) {
                carList.add(c);
            }
        }*/
        return mapper.map(carRepo.findByType(category),new TypeToken<List<CarDTO>>(){}.getType());
    }

    @Override
    public List<String> getCategory() {
        return mapper.map(carRepo.findType(),new TypeToken<List<String>>(){}.getType());
    }

    @Override
    public CarDTO getCarByCarCode(String carCode) {
        return mapper.map(carRepo.findByCarCode(carCode),CarDTO.class);
    }
}
