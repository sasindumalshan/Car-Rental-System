package lk.ijse.carRental.repo;

import lk.ijse.carRental.dto.UserDTO;
import lk.ijse.carRental.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Sasindu Malshan
 * @project CarRental
 * @date 10/30/2023
 */
@EnableJpaRepositories
public interface UserRepo extends JpaRepository<User,String> {


    boolean existsByPassword(String password);
}
