import java.util.ArrayList;

public class AutoBoxingTest {
    public static void main(String[] args) {
        int i = 10;

        // 기본형을 참조형으로 형변환(형변환 생략 가능)
        Integer intg = (Integer)i; // 컴파일러 => Integer intg = Integer.valueOf(i);
        Object obj = (Object)i; // 컴파일러 => Object obj = (Object)Integer.valueOf(i);

        Long lng = 100L; // 컴파일러 => Long lng = new Long(100L);

        int i2 = intg + 10; // 참조형과 기본형간의 연산 가능
        long l = intg + lng; // 참조형 간의 덧셈도 가능

        Integer intg2 = new Integer(20);
        int i3 = (int)intg2; // 참조형을 기본형으로 형변환도 가능(형변환 생략 가능)
    }
}
