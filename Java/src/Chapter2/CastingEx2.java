package Chapter2;

public class CastingEx2 {
    public static void main(String[] args) {
        int i = 10;
        byte b = (byte)i;
        System.out.printf("%d, %d%n", i, b);

        i = 300;
        b = (byte)i;
        System.out.printf("%d, %d%n", i, b); // 300 - (128 + 128) = 44

        b = 10;
        i = (int)b;
        System.out.printf("%d, %d%n", i, b);

        b = -2;
        i = (int)b;
        System.out.printf("%d, %d%n", i, b);

        System.out.println(Integer.toBinaryString(i));

    }
}
