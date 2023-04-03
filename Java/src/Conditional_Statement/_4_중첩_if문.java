package Conditional_Statement;

public class _4_중첩_if문 {
    public static void main(String[] args) {
        int num = 2;
        char sign = ' ';

        if (num >= 0) {
            if (num != 0) {
                sign = '+';
            }
        }
        else {
            sign = '-';
        }
        System.out.println(sign);
    }
}
