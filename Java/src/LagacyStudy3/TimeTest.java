package LagacyStudy3;

class Time {
    private int hour; // 0 ~23
    private int minute;
    private int sencond;

    public void setHour(int hour) {
        if (isNotValidHour(hour)) return;
        this.hour = hour;
    }

    // 매개변수로 넘겨진 hour이 유효한지 확인해서 알려주는 메서드
    private static boolean isNotValidHour(int hour) {
        return hour < 0 || hour > 23;
    }

    public int getHour() {return hour; }
}

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time();
        t.setHour(21); // hour의 값을 21로 변경
        System.out.println(t.getHour()); // 21

        t.setHour(100); // 100은 유효한 값이 아니기 떄문에 if문이 true가 되어 해당 문을 빠져나간다
        System.out.println(t.getHour()); // 21
    }
}
