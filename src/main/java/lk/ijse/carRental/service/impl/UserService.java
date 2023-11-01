package lk.ijse.carRental.service.impl;

import lk.ijse.carRental.dto.UserDTO;
import lk.ijse.carRental.entity.User;

import java.io.IOException;

/**
 * @author Sasindu Malshan
 * @project CarRental
 * @date 10/31/2023
 */

public interface UserService  {
    void saveUser(UserDTO userDTO) throws IOException;

    boolean existsUserByC_nicAndPassword(UserDTO userDTO) throws IOException;


    User getUser(String nic);

    UserDTO updateUser(UserDTO userDTO) throws IOException;
}
