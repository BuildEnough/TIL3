package Chapter6;

class CallStackTest2 {
    public static void main(String[] args) {
        System.out.println("main 실행");
        firstMethod();
        System.out.println("main 종료");
    }

    static void firstMethod() {
        System.out.println("firstMethod 실행");
        secondStack();
        System.out.println("firstMethod 종료");
    }

    static void secondStack() {
        System.out.println("secondStack 실행");
        System.out.println("secondStack 종료");
    }
}
