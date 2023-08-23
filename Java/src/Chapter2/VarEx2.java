package Chapter2;

public class VarEx2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int tmp = 0;

        System.out.printf("%d, %d%n", x ,y);

        tmp = x;
        x = y;
        y = tmp;

        System.out.printf("%d, %d", x ,y);
    }
}
