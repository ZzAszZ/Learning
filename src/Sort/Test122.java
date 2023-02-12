package Sort;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test122 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2002, 12, 12);
        LocalDateTime localDateTime = LocalDateTime.of(2002,12,12,0,0,0,0);

        LocalDate updLocalDate = LocalDate.of(localDateTime.getYear(), localDateTime.getMonth(), localDateTime.getDayOfMonth());


        System.out.println(localDate.atTime(LocalTime.now()).equals(localDateTime));
    }
}
