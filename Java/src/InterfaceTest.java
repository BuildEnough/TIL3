class A {
    // public void method(C c) {
    public void method(I i) { // 인터페이스 I를 구현한 것들만 가능하게 함
        i.method();
    }
}

// B 클래스의 선언과 구현을 분리
interface I {
    public void method();
}


class B implements I {
    public void method() {
        System.out.println("B클래스의 메서드");
    }
}

class C implements I {
    public void method() {
        System.out.println("C클래스의 메서드");
    }
}


public class InterfaceTest {
    public static void main(String[] args) {
        A a = new A();
        a.method(new C()); // a.method(new B());
    }
}
