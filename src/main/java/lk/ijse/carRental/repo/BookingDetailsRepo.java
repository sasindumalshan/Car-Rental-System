package lk.ijse.carRental.repo;

import lk.ijse.carRental.entity.BookingDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author Sasindu Malshan
 * @project CarRental
 * @date 11/2/2023
 */

public interface BookingDetailsRepo extends JpaRepository<BookingDetails,String> {
    @Query(value = "select * from bookingdetails WHERE booking_id =?",nativeQuery = true)
    List<BookingDetails> findBookingDetailsByBooking_id(String bookingId);
}
