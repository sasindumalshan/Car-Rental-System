package lk.ijse.carRental.repo;

import lk.ijse.carRental.dto.BookingDetailsDTO;
import lk.ijse.carRental.entity.BookingDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author Sasindu Malshan
 * @project CarRental
 * @date 11/2/2023
 */

public interface BookingDetailsRepo extends JpaRepository<BookingDetails, String> {
    @Query(value = "select * from bookingdetails WHERE booking_id =?", nativeQuery = true)
    List<BookingDetails> findBookingDetailsByBooking_id(String bookingId);

    @Query(value = "SELECT * from bookingdetails where driver_id=? and booking_end>=CURDATE()", nativeQuery = true)
    List<BookingDetails> getBookingDetailsNewForDriver(String driver_id);

    @Query(value = "SELECT COUNT(driver_id) from bookingdetails where driver_id=? and booking_end>CURDATE()", nativeQuery = true)
    long getBookingDetailsCompletedForDriver(String driver_id);

    @Query(value = "SELECT * from bookingdetails where driver_id =?", nativeQuery = true)
    List<BookingDetails> getAllBookingDetailsForDriver(String driver_id);


}
