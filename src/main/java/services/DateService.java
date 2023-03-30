package services;

import javax.xml.crypto.Data;
import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateService {

    public static String formatDateForDB(String date) {
        DateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        Date formattedDate;
        try {
            formattedDate = format.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return formatter.format(formattedDate);
    }
}
