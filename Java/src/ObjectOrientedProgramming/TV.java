package ObjectOrientedProgramming;

public class TV {
    String color;
    boolean power;
    int channel;

    void power() {power = !power;}

    void channelUp() {++channel;}

    void channelDown() {--channel;}
}

class TVTest {
    public static void main(String[] args) {
        TV t;
        t = new TV();
        t.channel = 7;
        t.channelDown();
        System.out.println(t.channel);
    }
}
