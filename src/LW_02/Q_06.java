package LW_02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Q_06 {
    public static void main(String[] args) {
        LocalDate today= LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");

        String formattedDate = today.format(formatter);
        System.out.println("Today's date is: "+ formattedDate);

    }
}
