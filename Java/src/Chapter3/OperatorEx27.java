package Chapter3;

public class OperatorEx27 {
    public static void main(String[] args) {
        boolean b = true;
        char ch = 'C';

        System.out.println(b);
        System.out.println(!b);
        System.out.println(!!b);
        System.out.println();

        System.out.println(ch);
        System.out.println(ch < 'a' || ch > 'z');
        System.out.println(!(ch >= 'a' && ch <= 'z'));
    }
}
