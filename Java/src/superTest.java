public class superTest {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();
    }
}

class Parent {
    int x = 10; // super.x
}

class Child extends Parent {
    int x = 20; // this.x

    void method() {
        System.out.println(super.x); // 10
        System.out.println(this.x); // 20
        System.out.println(x); // 20 가까이 있기 때문에 this.x를 호출
    }
}
