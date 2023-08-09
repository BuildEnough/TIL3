class lambdaTest {
    public static void main(String[] args) {
        // Object obj = (a, b) -> a > b ? a : b // 람다식, 익명객체
//        MyFunction f = new MyFunction() {
//            public int max(int a, int b) { // 오버라이딩: 접근제어자는 좁게 못바꾼다(public)
//                return a > b ? a : b;
//            }
//        };


        // 람다식(익명 객체)을 다루기 위한 참조변수의 타입은 함수형 인터페이스로 한다
        MyFunction f = (a, b) -> a > b ? a : b; // 람다식, 익명객체

        int value = f.max(3, 5); // 함수형 인터페이스
        System.out.println("value="+value);

    }
}

@FunctionalInterface
interface MyFunction {
    int max(int a, int b);
}
