package lk.ijse.carRental.service;

import lk.ijse.carRental.dto.UserDTO;
import lk.ijse.carRental.entity.User;
import lk.ijse.carRental.repo.UserRepo;
import lk.ijse.carRental.service.impl.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

/**
 * @author Sasindu Malshan
 * @project CarRental
 * @date 10/31/2023
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo userRepo;
    @Autowired
    ModelMapper mapper;

    @Override
    public UserDTO saveUser(UserDTO userDTO) throws IOException {
        if (!userRepo.existsById(userDTO.getC_nic())){
            //User save = ;
           return mapper.map(userRepo.save(userDTO.toEntity()),UserDTO.class);
        }else {
            throw new RuntimeException(userDTO.getC_nic()+"User NIC is Already Exists ");
        }
    }

    @Override
    public boolean existsUserByC_nicAndPassword(UserDTO userDTO){
        return userRepo.existsById(userDTO.getC_nic())&&userRepo.existsByPassword(userDTO.getPassword());
    }

    @Override
    public User getUser(String nic) {
        return mapper.map(userRepo.findById(nic),User.class);
    }

    @Override
    public UserDTO updateUser(UserDTO userDTO) throws IOException {
        if (userRepo.existsById(userDTO.getC_nic())){
            return mapper.map( userRepo.save(userDTO.toEntity()),UserDTO.class);
        }else {
            throw new RuntimeException("User Not Exists");
        }
    }
}
