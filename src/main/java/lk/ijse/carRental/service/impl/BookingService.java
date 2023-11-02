package lk.ijse.carRental.service.impl;

import lk.ijse.carRental.dto.BookingDTO;
import lk.ijse.carRental.dto.BookingDetailsDTO;

import java.util.List;

/**
 * @author Sasindu Malshan
 * @project CarRental
 * @date 11/2/2023
 */

public interface BookingService {

    List<BookingDTO> getBooking(String nic);

    List<BookingDTO> getAll();

    void save(BookingDTO bookingDTO);

    List<String> findAvailableDrivers();

    List<BookingDetailsDTO> findBookingDetailsByBooking_id(String booking_id);
}
