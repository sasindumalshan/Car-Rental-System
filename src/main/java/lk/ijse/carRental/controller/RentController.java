package lk.ijse.carRental.controller;

import lk.ijse.carRental.dto.CarDTO;
import lk.ijse.carRental.repo.CarRepo;
import lk.ijse.carRental.service.impl.CarService;
import lk.ijse.carRental.utility.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Sasindu Malshan
 * @project CarRental
 * @date 10/29/2023
 */
@RestController
@RequestMapping("/rent")
@CrossOrigin
public class RentController {
    @Autowired
    private CarService carService;


    @GetMapping(params = {"carCode"})
    public ResponseUtil get(String carCode){
        return new ResponseUtil("OK","find car",carService.getCarByCarCode(carCode));
    }
    @PostMapping
    public void post(){
        System.out.println("sdsdsdsdsssds");
    }
}
