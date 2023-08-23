package LagacyStudy3;

import java.util.Calendar;

public class CalendarTest2 {
    public static void main(String[] args) {
        // 요일은 1부터 시작하기 때문에, DAY_OF_WEEK[0]은 비워둠
        final String[] DAY_OF_WEEK = {"", "일", "월", "화", "수", "목", "금", "토"};

        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();

        // date1.set(2023, Calendar.JANUARY, 1);와 같이 할 수 있다
        date1.set(2023, 0, 1); // date1을 2023년 1월 1일로 날짜를 설정

        System.out.println(toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]);
        System.out.println(toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]);

        // 두 날짜간의 차이를 얻으려면, getTimeInMillis() 천분의 일초 단위로 변환해야한다.
        long difference = (date2.getTimeInMillis() - date1.getTimeInMillis())/1000;
        System.out.println("그 날(date1)부터 지금(date2)까지 " + difference +"초가 지남");
        System.out.println("일(day)로 계산하면 " + difference/(24*60*60) + "일"); // 1일 = 24 * 60 * 60
    }

    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR)+"년 "+ (date.get(Calendar.MONTH)+1) +"월 " + date.get(Calendar.DATE);
    }
}