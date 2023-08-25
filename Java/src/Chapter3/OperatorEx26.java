package Chapter3;

public class OperatorEx26 {
    public static void main(String[] args) {
        int a  = 5;
        int b  = 0;

        System.out.println(a!=0 || ++b!=0);
        System.out.printf("%d, %d%n", a ,b);

        System.out.println(a==0 && ++b!=0);
        System.out.printf("%d, %d%n", a ,b);



    }
}
