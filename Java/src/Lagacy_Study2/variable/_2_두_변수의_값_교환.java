package variable;

public class _2_두_변수의_값_교환 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        int temp = 0;

        System.out.println(x);
        System.out.println(y);

        temp = x;
        x = y;
        y = temp;

        System.out.println(x);
        System.out.println(y);
    }
}
