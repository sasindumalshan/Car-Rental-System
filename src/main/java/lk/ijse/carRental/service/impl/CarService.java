package lk.ijse.carRental.service.impl;

import lk.ijse.carRental.dto.CarDTO;

import java.util.List;

/**
 * @author Sasindu Malshan
 * @project CarRental
 * @date 10/27/2023
 */

public interface CarService {
    List<CarDTO> getCars(int pageNo);

    List<CarDTO> getCarsForUi(String category);

    List<String> getCategory();

    CarDTO getCarByCarCode(String carCode);
}
