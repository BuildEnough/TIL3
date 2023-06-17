class AAA { // AAA는 BBB의 외부 클래스
    int i = 1000;
    BBB b = new BBB();

    class BBB { // BBB는 AAA의 내부 클래스
        void method() {
            System.out.println(i); // 객체 생성없이 외부 클래스의 멤버 접근가능
        }
    }
}

//class CCC {
//    BBB b = new BBB(); // 에러
//}

public class InnerTest {
    public static void main(String[] args) {
        AAA a = new AAA();
        a.b.method();
    }
}
