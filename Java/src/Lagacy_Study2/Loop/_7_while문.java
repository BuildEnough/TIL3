package Loop;

public class _7_while문 {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        i = 0;
        while (i++ != 10){
            System.out.println(i);
        }
    }
}
