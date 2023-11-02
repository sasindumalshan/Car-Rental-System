package lk.ijse.carRental.repo;

import lk.ijse.carRental.entity.Booking;
import lk.ijse.carRental.entity.Car;
import lk.ijse.carRental.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author Sasindu Malshan
 * @project CarRental
 * @date 11/2/2023
 */

public interface BookingRepo extends JpaRepository<Booking, String> {
    @Query(value = "select * from booking where user_c_nic=?", nativeQuery = true)
    List<Booking> findByUser(String nic);

    @Query(value = "SELECT d_id FROM driver WHERE d_id NOT IN (SELECT driver_id FROM bookingdetails where booking_start > CURDATE())",nativeQuery = true)
    List<String> findAvailableDrivers();


}
