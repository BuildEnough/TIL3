package ObjectOrientedProgramming;

public class _2_TV {
    String color;
    boolean power;
    int channel;

    void power() {power = !power;}

    void channelUp() {++channel;}

    void channelDown() {--channel;}
}

class TVTest2 {
    public static void main(String[] args) {
        _2_TV t1 = new _2_TV();
        _2_TV t2 = new _2_TV();
        System.out.println(t1.channel);
        System.out.println(t2.channel);

        t1.channel = 7;
        System.out.println("t1의 channel 값을 7로 변경");

        System.out.println(t1.channel);
        System.out.println(t2.channel);
    }
}