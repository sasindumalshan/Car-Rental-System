package lk.ijse.carRental.repo;

import lk.ijse.carRental.entity.Booking;
import lk.ijse.carRental.entity.Car;
import lk.ijse.carRental.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

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

    @Query(value = "select * from booking where booking_id=?", nativeQuery = true)
    Booking findByBooking(String booking_id);

    /*@Query(value = "select b.user.c_nic ,b.user.fistName,b.user.lastName from Booking b where Booking .booking_id=:booking_id",nativeQuery = true)
    Booking find(@Param("booking_id") String booking_id);*/





}
