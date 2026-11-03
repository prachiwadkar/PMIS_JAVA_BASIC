
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Solution {
    public int daysBetweenDates(String date1, String date2) {

        // Convert strings into dates
        LocalDate d1 = LocalDate.parse(date1);
        LocalDate d2 = LocalDate.parse(date2);

        // Count days between the dates
        long days = ChronoUnit.DAYS.between(d1, d2);

        // Return positive number
        return (int) Math.abs(days);
    }
}
