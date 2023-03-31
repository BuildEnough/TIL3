package variable;

public class _4_printf와_지시자 {
    public static void main(String[] args) {
        int age = 14;
        byte b = 1;
        short s = 2;
        char c = 'A';

        int ten = 10;

        System.out.printf("%d%n", b);
        System.out.printf("%d%n", s);
        System.out.printf("%c, %d%n", c, (int)c); // char 타입 형변환 꼭 해주기
        System.out.printf("[%5d]%n", ten);
        System.out.printf("[%-5d]%n", ten);
        System.out.printf("[%05d]%n", ten);

    }
}
