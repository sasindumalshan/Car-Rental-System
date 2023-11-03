package lk.ijse.CarRental.repo;

import lk.ijse.carRental.config.WebRootConfig;
import lk.ijse.carRental.dto.BookingDTO;
import lk.ijse.carRental.dto.DriverDTO;
import lk.ijse.carRental.dto.UserDTO;
import lk.ijse.carRental.dto.projection.BookingProjectionDTO;
import lk.ijse.carRental.entity.Booking;
import lk.ijse.carRental.entity.BookingDetails;
import lk.ijse.carRental.repo.BookingDetailsRepo;
import lk.ijse.carRental.repo.BookingRepo;
import lk.ijse.carRental.repo.DriverRepo;
import lk.ijse.carRental.repo.UserRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Sasindu Malshan
 * @project CarRental
 * @date 11/2/2023
 */
@WebAppConfiguration
@ContextConfiguration(classes = {WebRootConfig.class})
@ExtendWith(SpringExtension.class)
public class BookingTest {
    @Autowired
    private BookingRepo bookingRepo;
    @Autowired
    ModelMapper mapper;
    @Autowired
    DriverRepo driverRepo;
    @Autowired
    UserRepo userRepo;
    @Autowired
    BookingDetailsRepo repo;

    public void getBooking() {
//        List<BookingDTO> booking = bookingService.getBooking(nic);
        List<Booking> user = bookingRepo.findByUser("200144367300");

        List<BookingDTO> booking= mapper.map(user,new TypeToken<List<BookingDTO>>(){}.getType());

        System.out.println(booking.toString());

        List<BookingProjectionDTO> list = new ArrayList<>();
        for (BookingDTO d : booking) {
            List<BookingDetails> bookingDetailsByBooking_id = repo.findBookingDetailsByBooking_id(d.getBooking_id());
            BookingProjectionDTO t = new BookingProjectionDTO();
            t.setBooking_id(d.getBooking_id());
            t.setNic(d.getC_nic());
            t.setCarCount(bookingDetailsByBooking_id.size());
            t.setDate(d.getDate());
            t.setTime(d.getTime());
            t.setBooking_payment(d.getBooking_payment());
            t.setNet_payment(d.getNet_payment());
            t.setStatus(d.getStatus());
            list.add(t);
        }
    }
    public void getBookingRepo() {
        DriverDTO d01 = mapper.map(driverRepo.findById("D01"), DriverDTO.class);
        //boolean b = bookingRepo.existsById("7788");
        System.out.println(d01.toString());
//        List<BookingDTO> list = mapper.map(bookingRepo.findAll(), new TypeToken<List<BookingDTO>>() {
//        }.getType());
//
//        String booking_id=null;
//        for (BookingDTO dto:list) { booking_id = dto.getBooking_id(); }
//        if (booking_id==null){ booking_id="B001";}
//
//        System.out.println(booking_id);
    }
    @Test
    public void getBookingId(){
       // bookingRepo.find("B001");
        Booking b001 = bookingRepo.findByBooking("B001");
        BookingDTO map = mapper.map(b001, BookingDTO.class);
        UserDTO map2 = mapper.map(b001.getUser(), UserDTO.class);
        System.out.println(map2.toString());
    }
}
