package LagacyStudy3;

public class Outer {
    private int outerIv = 0;
    static int outerCv = 0;
    // private static int outerCv = 0; // private 붙여도 가능

    class InstanceInner {
        int iiv = outerIv; // 외부 클래스의 private 멤버도 접근가능
        int iiv2 = outerCv;
    }

    static class StaticInner {
        // int siv = outerIv; // static 클래스는 외부 클래스의 인스턴스 멤버에 접근할 수 없다
        static int scv = outerCv;
    }

    void myMethod() {
        int lv = 0; // 변수, 값이 바뀌지 않는 변수는 상수로 간주
        final int LV = 0; // 상수, JDK 1.8부터 final 생략 가능


        class LocalInner {
            int liv = outerIv;
            int liv2 = outerCv;

            // 외부 클래스의 지역변수는 final이 붙은 변수(상수)만 접근가능하다(JDK 1.8 이후부터 에러아님)
            int liv3 = lv; // 에러 아님(JDK 1.8부터 에러 아님)
            int liv4 = LV;
        }
    }
}
