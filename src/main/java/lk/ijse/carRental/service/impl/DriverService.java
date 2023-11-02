package lk.ijse.carRental.service.impl;

import lk.ijse.carRental.dto.DriverDTO;

/**
 * @author Sasindu Malshan
 * @project CarRental
 * @date 11/2/2023
 */

public interface DriverService {
    DriverDTO findById(String driverId);
}
