package lk.ijse.carRental.service;

import lk.ijse.carRental.dto.DriverDTO;
import lk.ijse.carRental.repo.DriverRepo;
import lk.ijse.carRental.service.impl.DriverService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Sasindu Malshan
 * @project CarRental
 * @date 11/2/2023
 */
@Service
public class DriverServiceImpl implements DriverService {
    @Autowired
    private DriverRepo driverRepo;
    @Autowired
    private ModelMapper mapper;

    @Override
    public DriverDTO findById(String driverId) {
        return mapper.map( driverRepo.findById(driverId),DriverDTO.class);
    }
}
