public class TestClass {
    void instanceMethod() {} // 인스턴스 메서드
    static void staticMethod() {} // static 메서드

    void instanceMethod2() { // 인스턴스 메서드
        instanceMethod(); // 다른 인스턴스 메서드 호출 가능
        staticMethod(); // static 메서드 호출 가능
    }

    static void staticMethod2() { // static 메서드
        // instanceMethod(); // 에러, 인스턴스 메서드 호출 불가능
        staticMethod(); // static 메서드 호출 가능
    }
}