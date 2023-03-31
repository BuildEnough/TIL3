package Lagacy_Study1.chap_06;

public class _01_Method {
    // 메소드 정의: 어떤 기능을 하는 코드들의 묶음
    public static void sayHello() {
        System.out.println("안녕하세요? 메소드입니다.");
    }

    public static void main(String[] args) {
        // 메소드 호출
        System.out.println("메소드 호출 전");
        sayHello();
        sayHello();
        sayHello();
        System.out.println("메소드 호출 후");
    }
}
