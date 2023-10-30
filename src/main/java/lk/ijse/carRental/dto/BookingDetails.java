package lk.ijse.carRental.entity;

import lk.ijse.carRental.utility.types.LossDamage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

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
@IdClass(BookingDetails_PK.class)
public class BookingDetails {
    @Id
    private String booking_id;
    @Id
    private String reg_number;

    private double used_km;
    private double pre_km;
    @Column(name = "lossDamage", columnDefinition = "VARCHAR(15)")
    @Enumerated(EnumType.STRING)
    private LossDamage lossDamage;
    private LocalDate booking_end;
    private LocalDate booking_start;
    private String d_nic;
    private double ex_km;
    private double free_km;


    @ManyToOne
    @JoinColumn(name = "booking_id",referencedColumnName = "booking_id",insertable = false,updatable = false)
    private Booking booking;


    @ManyToOne
    @JoinColumn(name = "reg_number",referencedColumnName = "reg_number",insertable = false,updatable = false)
    private Car car;
}
