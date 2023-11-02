package lk.ijse.carRental.repo;

import lk.ijse.carRental.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Sasindu Malshan
 * @project CarRental
 * @date 11/2/2023
 */

public interface DriverRepo extends JpaRepository<Driver, String> {
}
