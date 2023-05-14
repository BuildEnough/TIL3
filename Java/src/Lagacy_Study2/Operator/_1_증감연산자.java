package Lagacy_Study2.Operator;

public class _1_증감연산자 {
    public static void main(String[] args) {
        int i = 5, j= 0;
        j = i++;
        System.out.printf("%d, %d", i, j);

        System.out.println('\n');

        i = 5;
        j = 0;
        j = ++i;
        System.out.printf("%d, %d", i, j);

        System.out.println('\n');

        int x = 5, y = 5;

        System.out.println(++x);
        System.out.println(y++);
    }
}
