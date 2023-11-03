package lk.ijse.carRental.service;

import lk.ijse.carRental.dto.BookingDTO;
import lk.ijse.carRental.dto.BookingDetailsDTO;
import lk.ijse.carRental.dto.UserDTO;
import lk.ijse.carRental.entity.Booking;
import lk.ijse.carRental.entity.BookingDetails;
import lk.ijse.carRental.repo.BookingDetailsRepo;
import lk.ijse.carRental.repo.BookingRepo;
import lk.ijse.carRental.service.impl.BookingService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author Sasindu Malshan
 * @project CarRental
 * @date 11/2/2023
 */
@Service
@Transactional
public class BookingServiceImpl implements BookingService {
    @Autowired
    ModelMapper mapper;
    @Autowired
    private BookingRepo bookingRepo;
    @Autowired
    private BookingDetailsRepo bookingDetailsRepo;

    @Override
    public List<BookingDTO> getBooking(String nic) {
        return mapper.map(bookingRepo.findByUser(nic), new TypeToken<List<BookingDTO>>() {
        }.getType());
    }

    @Override
    public List<BookingDTO> getAll() {
        return mapper.map(bookingRepo.findAll(), new TypeToken<List<BookingDTO>>() {
        }.getType());
    }

    @Override
    public void save(BookingDTO bookingDTO) {

        if (bookingRepo.existsById(bookingDTO.getBooking_id())) {
            new RuntimeException("booking exits");
        }

        System.out.println(bookingDTO);
        bookingRepo.save(mapper.map(bookingDTO, Booking.class));

        //List<BookingDetailsDTO> orderDetails = bookingDTO.getOrderDetails();

       /* for (BookingDetailsDTO dto:orderDetails){
            repo.save(mapper.map(dto, BookingDetails.class));
        }*/
    }

    @Override
    public List<String> findAvailableDrivers() {
        return bookingRepo.findAvailableDrivers();
    }

    @Override
    public List<BookingDetailsDTO> findBookingDetailsByBooking_id(String booking_id) {
        return mapper.map(bookingDetailsRepo.findBookingDetailsByBooking_id(booking_id), new TypeToken<List<BookingDetails>>() {
        }.getType());
    }

    @Override
    public List<BookingDetailsDTO> getBookingDetailsNewForDriver(String driver_id) {

        List<BookingDetails> bookingDetailsNewForDriver = bookingDetailsRepo.getBookingDetailsNewForDriver(driver_id);
        return mapper.map(bookingDetailsNewForDriver, new TypeToken<List<BookingDetailsDTO>>() {
        }.getType());
    }

    @Override
    public long getBookingDetailsCompletedForDriver(String driver_id) {
        return bookingDetailsRepo.getBookingDetailsCompletedForDriver(driver_id);
    }

    @Override
    public List<BookingDetailsDTO> getAllBookingDetailsForDriver(String driver_id) {
        return mapper.map(bookingDetailsRepo.getAllBookingDetailsForDriver(driver_id), new TypeToken<List<BookingDetailsDTO>>() {
                }.getType());
    }

    @Override
    public BookingDTO findByBooking(String booking_id) {
        Booking byBooking = bookingRepo.findByBooking(booking_id);
        BookingDTO dto = mapper.map(byBooking, BookingDTO.class);
        dto.setUserDTO(mapper.map(byBooking.getUser(), UserDTO.class));

        return dto;
    }
}
