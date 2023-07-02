import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();
        System.out.println(today.get(Calendar.YEAR)); // 2023
        System.out.println(today.get(Calendar.MONTH)); // 6
        System.out.println(today.get(Calendar.WEEK_OF_YEAR)); // 27
        System.out.println(today.get(Calendar.WEEK_OF_MONTH)); // 2
        System.out.println();

        System.out.println(today.get(Calendar.DATE)); // 2
        System.out.println(today.get(Calendar.DAY_OF_YEAR)); // 183
        System.out.println(today.get(Calendar.DAY_OF_MONTH)); // 2
        System.out.println(today.get(Calendar.DAY_OF_WEEK)); // 1
        System.out.println(today.get(Calendar.DAY_OF_WEEK_IN_MONTH)); // 1
        System.out.println(today.get(Calendar.AM_PM)); // 0
        System.out.println();

        System.out.println(today.get(Calendar.HOUR)); // 9
        System.out.println(today.get(Calendar.HOUR_OF_DAY)); // 9
        System.out.println(today.get(Calendar.MINUTE)); // 32
        System.out.println(today.get(Calendar.SECOND)); // 38
        System.out.println(today.get(Calendar.MILLISECOND)); // 353
        System.out.println(today.get(Calendar.ZONE_OFFSET)); // 32400000
        System.out.println(today.get(Calendar.DATE)); // 2
    }
}
