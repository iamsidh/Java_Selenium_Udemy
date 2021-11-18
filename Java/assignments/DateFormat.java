package assignments;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class DateFormat {

    public static String datedemo(){

        LocalDateTime time = LocalDateTime.now();

        System.out.println("Before Formatting : "+time);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy_HH:mm:ss");

        String FormatDateTime = time.format(formatter);

        System.out.println("After Formatting : "+FormatDateTime);

        return FormatDateTime;

    }

    public static void main(String[] args) throws IOException {
       // datedemo();
        System.out.println("Siddhesh_"+datedemo()+"_Madgaonkar");
    }
}
