package Operator;

public class _4_큰자료형에서_작은자료형 {
    public static void main(String[] args) {
        byte a = 126;
        byte b = 1;
        byte c = (byte)(a + b); // int -> byte, byte 범위: -128 ~ 127
        System.out.println(c);
    }
}
