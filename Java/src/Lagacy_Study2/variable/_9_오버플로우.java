package Lagacy_Study2.variable;

public class _9_오버플로우 {
    public static void main(String[] args) {
        short sMin = -32768;
        short sMax = 32767;
        char cMin = 0;
        char cMax = 65535;

        System.out.println(sMin);
        System.out.println((short)(sMin-1));
        System.out.println('\n');

        System.out.println(sMax);
        System.out.println((short)(sMax+1));
        System.out.println('\n');

        System.out.println((int)cMin);
        System.out.println((int)(--cMin));
        System.out.println('\n');

        System.out.println((int)cMax);
        System.out.println((int)(++cMax));
        System.out.println('\n');




    }
}
