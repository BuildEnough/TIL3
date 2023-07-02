import java.util.Calendar;

import static java.util.Calendar.DAY_OF_WEEK;

public class CalendarTest4 {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        date.set(2023, 7, 31);	// 2023년 8월 31일 세팅

        System.out.println(toString(date)); // 2023년 8월 31일
        System.out.println();

        System.out.println("= 1일 후 =");
        date.add(Calendar.DATE, 1);
        System.out.println(toString(date)); // 2023년 9월 1일
        System.out.println("-------------------------");
        date.set(2023, 7, 31);	// 2023년 8월 31일 세팅
        date.roll(Calendar.DATE, 1);
        System.out.println(toString(date)); // 2023년 8월 1일
        System.out.println();

        date.set(2023, 8, 1);	// 2023년 9월 1일 세팅
        System.out.println("= 9달 전 =");
        date.add(Calendar.MONTH, -9);
        System.out.println(toString(date)); // 2022년 12월 1일
        System.out.println("-------------------------");
        date.set(2023, 8, 1); // 2023년 9월 1일 세팅
        System.out.println("= 9달 전 =");
        date.roll(Calendar.MONTH, -9);
        System.out.println(toString(date)); // 2022년 12월 1일
        System.out.println();
    }

    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR)+"년 "+ (date.get(Calendar.MONTH)+1)
                +"월 " + date.get(Calendar.DATE) + "일";
    }
}