public class ExceptionTest {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(args[0]); // ArrayIndexOutOfBoundException
            System.out.println(4); // 실행되지 않는다
        } catch (ArithmeticException ae) {
            if (ae instanceof ArithmeticException)
                System.out.println("true");
            System.out.println("ArithmeticException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }  // try-catch의 끝
        System.out.println(6);
    }
}
