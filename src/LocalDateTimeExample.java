import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2015, 1, 20);
        LocalTime ss = LocalTime.now();

//        Date date3 =new Date(2015, Calendar.JANUARY,20);
        Scanner s1 = new Scanner(System.in);
    }
}
