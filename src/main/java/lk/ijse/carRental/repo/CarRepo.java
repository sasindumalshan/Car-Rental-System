package lk.ijse.carRental.repo;

import lk.ijse.carRental.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author Sasindu Malshan
 * @project CarRental
 * @date 10/27/2023
 */

public interface CarRepo extends JpaRepository<Car, String> {

    @Query(value = "select distinct type from car", nativeQuery = true)
    List<String> findType();

    List<Car> findByType(String type);

    Car findByCarCode(String carCode);
}
