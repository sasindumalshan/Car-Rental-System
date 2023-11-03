package lk.ijse.carRental.controller;

import jdk.jfr.ContentType;
import lk.ijse.carRental.dto.UserDTO;
import lk.ijse.carRental.dto.img;
import lk.ijse.carRental.entity.User;
import lk.ijse.carRental.service.impl.UserService;
import lk.ijse.carRental.utility.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.IOException;

/**
 * @author Sasindu Malshan
 * @project CarRental
 * @date 10/26/2023
 */
@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public String userController() {
        System.out.println("hello");
        return "Hello";
    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseUtil userSave(@ModelAttribute UserDTO userDTO) throws IOException {
        return   new ResponseUtil("200","User Added",userService.saveUser(userDTO));
    }
    @ResponseStatus(HttpStatus.ACCEPTED)
    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE} ,path ="/checkUser")
    public ResponseUtil checkUser(@ModelAttribute UserDTO userDTO) throws IOException {
        if (userService.existsUserByC_nicAndPassword(userDTO)){
            return   new ResponseUtil("200","exists User ",userService.getUser(userDTO.getC_nic()));
        }
        return   new ResponseUtil("404","not User ","GUEST");

    }

    @GetMapping(path ="/getUser",params = {"nic"})
    public ResponseUtil getUser( String nic) throws IOException {
        return   new ResponseUtil("404","not User ",userService.getUser(nic));

    }
    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE} ,path ="/updateUser")
    public ResponseUtil updateUser( @ModelAttribute UserDTO userDTO) throws IOException {
        return   new ResponseUtil("404","not User ",userService.updateUser(userDTO));

    }

    /* byte[] frontFileBytes = dto.getFrontImage ().getBytes ();
        byte[] backFileBytes = dto.getBackImage ().getBytes ();


        String projectPath = "/Users/ushan_kaushalya/SoftwareEngineeringEDU/IJSE/2nd Semester/Advance API Development/CourseWork/Easy_Car_Rental/Front_End/assest";
        Path frontLocation = Paths.get (projectPath + "/projectimages/customerimages/frontimage/front_" + dto.getCustomerID () + ".jpeg");
        Path backLocation = Paths.get (projectPath + "/projectimages/customerimages/backimage/back_" + dto.getCustomerID () + ".jpeg");

        Files.write (frontLocation, frontFileBytes);
        Files.write (backLocation, backFileBytes);

        dto.getFrontImage ().transferTo (frontLocation);
        dto.getBackImage ().transferTo (backLocation);*/
   /* @PostMapping
    public ResponseUtil addCustomer(@RequestBody CustomerDTO customerDTO) {
        userService.addUser(new UserDTO(customerDTO.getUsername(), customerDTO.getUser().getPassword(), customerDTO.getUser().getRole()));
        customerService.addCustomer(customerDTO);
        return new ResponseUtil("Ok", "Customer Successfully Added", customerDTO);
    }

    @PostMapping(params = {"customerId"})
    public ResponseUtil addCustomer(@ModelAttribute CustomerImageDTO customerImageDTO, String customerId) {
        customerImageDTO.setCustomerID(customerId);
        customerService.addCustomer(customerImageDTO);
        return new ResponseUtil("Ok", "Customer Image Successfully Added", customerId);
    }*/
}
