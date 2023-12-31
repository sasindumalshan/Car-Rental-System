package lk.ijse.carRental.entity;

import lk.ijse.carRental.utility.types.UserAccess;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

/**
 * @author Sasindu Malshan
 * @project CarRental
 * @date 10/25/2023
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
public class Booking {
    @Id
    @Column(name = "booking_id", columnDefinition = "VARCHAR(64)")
    private String booking_id;
    @Column(name = "slip", columnDefinition = "LONGBLOB")
    private byte[] slip;
    private LocalDate date;
    private LocalTime time;
    @Column(name = "status", columnDefinition = "VARCHAR(15)")
    @Enumerated(EnumType.STRING)
    private UserAccess status;
    private double net_payment;
    private double booking_payment;

    @OneToMany(mappedBy = "booking_id", cascade = CascadeType.ALL)
    private List<BookingDetails> bookingDetails;

    @ManyToOne(cascade = {CascadeType.ALL})
    private User user;

}
