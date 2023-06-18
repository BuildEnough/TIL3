class Outer3 {
    int value = 10; // Outer3.this.value    value: 외부 클래스의 iv

    class Inner {
        int value = 20; // this.value     value: 내부 클래스 iv

        void method1() {
            int value  = 30; // lv 지역변수
            System.out.println(value); // 30
            System.out.println(this.value); // 20
            System.out.println(Outer3.this.value);// 10
        }
    }
}


public class InnerSameName {
    public static void main(String[] args) {
        Outer3 outer = new Outer3();
        Outer3.Inner inner = outer.new Inner();
        inner.method1();
    }
}
