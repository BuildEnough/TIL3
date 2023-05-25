public class MyMathTest {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long result1 = mm.add(5L, 3L);
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L);

        long result5 = mm.max(5, 3);
        long result6 = mm.min(5, 3);

        mm.max(5, 3); // 그냥 호출만 해도 상관없음, 저장안되고 호출만 됨

        System.out.println(result1); // 8
        System.out.println(result2); // 2
        System.out.println(result3); // 15
        System.out.println(result4); // 1.0

        System.out.println(result5); // 5
        System.out.println(result6); // 3
    }

}

class MyMath {
    long add(long a, long b) {
        long result = a + b;
        return result; // return a+b;
    }

    long subtract(long a, long b) {
        return a-b;
    }
    long multiply(long a, long b) {
        return a*b;
    }
    long divide(long a, long b) {
        return a/b;
    }

    // 둘 중에 큰 값 반환
    long max(long a, long b) {
//        long result = 0;
//        result = a > b ? a : b;
        return a > b ? a : b;
    }

    // 둘 중에 작은 값 반환
    long min(long a, long b) {
        return a < b ? a : b;
    }
}