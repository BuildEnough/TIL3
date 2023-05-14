package Lagacy_Study2.ObjectOrientedProgramming;

public class _3_TV {
    String color;
    boolean power;
    int channel;

    void power() {power = !power;}

    void channelUp() {++channel;}

    void channelDown() {--channel;}
}

class TVTest3 {
    public static void main(String[] args) {
        _3_TV t1 = new _3_TV();
        _3_TV t2 = new _3_TV();
        System.out.println(t1.channel);
        System.out.println(t2.channel);

        t2 = t1;
        t1.channel = 7;
        System.out.println("t1의 channel 값을 7로 변경");

        System.out.println(t1.channel);
        System.out.println(t2.channel);
    }
}