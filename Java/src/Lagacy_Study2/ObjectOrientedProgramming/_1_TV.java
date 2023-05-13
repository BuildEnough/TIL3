package ObjectOrientedProgramming;

public class _1_TV {
    String color;
    boolean power;
    int channel;

    void power() {power = !power;}

    void channelUp() {++channel;}

    void channelDown() {--channel;}
}

class TVTest {
    public static void main(String[] args) {
        _1_TV t;
        t = new _1_TV();
        t.channel = 7;
        t.channelDown();
        System.out.println(t.channel);
    }
}