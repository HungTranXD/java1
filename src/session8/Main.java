package session8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        /* ----------------------------------------------------------------- */
        /* ---------------------------- LocalDate -------------------------- */
        /* ----------------------------------------------------------------- */
        //Cách 1
        LocalDate ld = LocalDate.now();
        System.out.println(ld.getDayOfWeek());
        //Cách 2
        LocalDate ld2 = LocalDate.of(2022, 12, 25);
        //Cách 3
        LocalDate ld3 = LocalDate.parse("2022-11-25");

        //Tính toán
        System.out.println("Sau 1 tháng: " + ld.plusMonths(1));

        //So sánh
        long offset = ChronoUnit.DAYS.between(ld, ld3);
        System.out.println(offset);

        LocalDateTime ldt1 = LocalDateTime.now();
        System.out.println(ldt1);
        System.out.println(ldt1.plusHours(1));

        LocalDateTime ldt2 = LocalDateTime.of(2022,10,27,12,15);
        LocalDateTime ldt3 = LocalDateTime.parse("2022-11-27T12:25:27");
    }
}
