package lk.ijse.carRental.repo;

import lk.ijse.carRental.entity.CarPrice;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Sasindu Malshan
 * @project CarRental
 * @date 10/27/2023
 */

public interface CarPriceRepo extends JpaRepository<CarPrice,String> {
}
