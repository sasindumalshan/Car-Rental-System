package lk.ijse.carRental.entity;

import lk.ijse.carRental.utility.types.UserAccess;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

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
public class Driver {
    @Id
    @Column(name = "d_id" ,columnDefinition = "VARCHAR(64)")
    private String d_id;

    @OneToOne(targetEntity = User.class, cascade = CascadeType.ALL)
    private User user;

    @Column(name = "access", columnDefinition = "VARCHAR(15)")
    @Enumerated(EnumType.STRING)
    UserAccess access;
}
