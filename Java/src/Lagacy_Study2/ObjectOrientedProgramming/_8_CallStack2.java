package ObjectOrientedProgramming;

public class _8_CallStack2 {
    public static void main(String[] args) {
        System.out.println("main 시작");
        firstMethod();
        System.out.println("main 종료");
    }

    static void firstMethod() {
        System.out.println("firstMethod 시작");
        secondMethod();
        System.out.println("firstMethod 종료");
    }

    static void secondMethod() {
        System.out.println("secondMethod 시작");
        System.out.println("secondMethod 종료");
    }
}
