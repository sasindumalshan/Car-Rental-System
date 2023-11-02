package lk.ijse.carRental.controller;

import lk.ijse.carRental.dto.*;
import lk.ijse.carRental.dto.projection.BookingProjectionDTO;
import lk.ijse.carRental.dto.projection.RequestDataProjection;
import lk.ijse.carRental.entity.Booking;
import lk.ijse.carRental.entity.BookingDetails;
import lk.ijse.carRental.entity.User;
import lk.ijse.carRental.service.impl.BookingService;
import lk.ijse.carRental.service.impl.CarService;
import lk.ijse.carRental.service.impl.DriverService;
import lk.ijse.carRental.service.impl.UserService;
import lk.ijse.carRental.utility.DateTimeUtil;
import lk.ijse.carRental.utility.ResponseUtil;
import lk.ijse.carRental.utility.types.UserAccess;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Sasindu Malshan
 * @project CarRental
 * @date 11/2/2023
 */
@RestController
@RequestMapping("/booking")
@CrossOrigin
public class BookingController {
    @Autowired
    private BookingService bookingService;
    @Autowired
    private UserService userService;
    @Autowired
    private ModelMapper mapper;
    @Autowired
    private CarService carService;
    @Autowired
    private DriverService driverService;


    @PostMapping(path = "/bookingReqvest")
    public String bookingRequest(@RequestBody RequestDataProjection rentData) throws IOException {
//        System.out.println(rentData.toString());
        List<BookingDTO> all = bookingService.getAll();
        List<BookingDetailsDTO> orderDetails=new ArrayList<>();
        User user = userService.getUser(rentData.getNic());
        String newBooking = getNewBooking(all);

        List<BookingProjectionDTO> carBooking = rentData.getCarBooking();
        for (BookingProjectionDTO projectionDTO:carBooking) {
            List<String> availableDrivers = bookingService.findAvailableDrivers();
            DriverDTO byId=null;
            if (availableDrivers.size()>0){
                 byId = driverService.findById(availableDrivers.get(0));
            }else {
                new RuntimeException("Sorry No drivers ");
            }

            CarDTO carByCarCode = carService.getCarByCarCode(projectionDTO.getCarCode());

            BookingDetailsDTO bookingDetailsDTO = new BookingDetailsDTO();
            bookingDetailsDTO.setBooking_id(newBooking);
            bookingDetailsDTO.setDriver_id(byId.getD_id());
            bookingDetailsDTO.setDriverDTO(byId);
            bookingDetailsDTO.setReg_number(carByCarCode.getReg_number());
            bookingDetailsDTO.setBooking_start(LocalDate.parse(projectionDTO.getStart()));
            bookingDetailsDTO.setBooking_end(LocalDate.parse(projectionDTO.getEndDate()));
            /**
             * set Booking Details
             * */
            orderDetails.add(bookingDetailsDTO);
        }
        BookingDTO bookingDTO = new BookingDTO(
                newBooking,
                new byte[0],
                rentData.getNic(),
                DateTimeUtil.getDate(),
                DateTimeUtil.getTime(),
                UserAccess.PENDING,
                0.00,
                rentData.getNetTotal(),
                orderDetails,
                mapper.map(user, UserDTO.class)
        );

        bookingService.save(bookingDTO);

        return "ok bookingReqvest";
    }

    private String getNewBooking(List<BookingDTO> list) {
        String booking_id = null;
        for (BookingDTO dto : list) {
            booking_id = dto.getBooking_id();
        }
        if (booking_id == null) {
           return  "B001";
        }
        String[] split = booking_id.split("B00");
        int getLastNumber = Integer.parseInt(split[1]);
        getLastNumber++;
        return "B00"+getLastNumber;
    }

    @GetMapping(path = "/getbooking", params = {"nic"})
    public ResponseUtil getBooking(String nic) throws IOException {
        List<BookingDTO> user = bookingService.getBooking(nic);

        List<BookingDTO> booking= mapper.map(user,new TypeToken<List<BookingDTO>>(){}.getType());

        System.out.println(booking.toString());

        List<BookingProjectionDTO> list = new ArrayList<>();
        for (BookingDTO d : booking) {
            List<BookingDetailsDTO> bookingDetailsByBooking_id = bookingService.findBookingDetailsByBooking_id(d.getBooking_id());
            BookingProjectionDTO t = new BookingProjectionDTO();
            t.setBooking_id(d.getBooking_id());
            t.setNic(d.getC_nic());
            t.setCarCount(bookingDetailsByBooking_id.size());
            t.setDate(d.getDate());
            t.setTime(d.getTime());
            t.setBooking_payment(d.getBooking_payment());
            t.setNet_payment(d.getNet_payment());
            t.setStatus(d.getStatus());
            t.setNic(nic);
            list.add(t);
        }


        return new ResponseUtil("200", "ok ok", list);
    }

}
