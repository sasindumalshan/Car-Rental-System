package lk.ijse.carRental.repo;

import lk.ijse.carRental.entity.CarImg;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Sasindu Malshan
 * @project CarRental
 * @date 10/27/2023
 */

public interface CarImagRepo extends JpaRepository<CarImg, String> {
}
