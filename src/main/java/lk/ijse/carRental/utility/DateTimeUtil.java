package lk.ijse.carRental.utility;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

/**
 * @author Sasindu Malshan
 * @project CarRental
 * @date 11/2/2023
 */

public class DateTimeUtil {
    public static LocalDate getDate() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return LocalDate.parse(format.format(new Date()));


    }

    public static LocalTime getTime() {
        SimpleDateFormat dateFormat=new SimpleDateFormat("hh:mm:ss");
        System.out.println(dateFormat.format(new Date()));
        return LocalTime.parse(dateFormat.format(new Date()));


    }
}
