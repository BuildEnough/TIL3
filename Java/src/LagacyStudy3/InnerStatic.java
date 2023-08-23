package LagacyStudy3;

public class InnerStatic {
    class InstanceInner {}
    static class StaticInner {}

    InstanceInner iv = new InstanceInner(); // 인스턴스 멤버끼리는 직접 접근 가능
    static StaticInner cv = new StaticInner(); // static 멤버끼리는 직접 접근 가능
    // static StaticInner cv = new InstanceInner(); // 에러, static 멤버는 인스턴스 멤버에 직접 접근 불가

    static void staticMethod() { // static 멤버는 인스턴스 멤버에 직접 접근 불가
        // InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();

        InnerStatic outer = new InnerStatic(); // 인스턴스 클래스는 외부 클래스를 먼저 생성해야 생성가능
        InstanceInner obj1 = outer.new InstanceInner();
    }

    void instanceMethod() { // 인스턴스 메서드에서는 인스턴스 멤버와 static 멤버 모두 접근 가능
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();
        // LocalInner lv = new LocalInner(); // 지역 내부 클래스는 외부에서 접근할 수 없다
    }

    void myMethod() {
        class LocalInner {}
        LocalInner lv = new LocalInner();
    }
}
