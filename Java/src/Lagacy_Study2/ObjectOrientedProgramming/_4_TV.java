package ObjectOrientedProgramming;

public class _4_TV {
    String color;
    boolean power;
    int channel;

    void power() {power = !power;}

    void channelUp() {++channel;}

    void channelDown() {--channel;}
}

class TVTest4 {
    public static void main(String[] args) {
        _4_TV[] tvArr = new _4_TV[3];

        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new _4_TV();
            tvArr[i].channel = i + 10;
        }

        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i].channelUp();
            System.out.println(tvArr[i].channel);
        }
    }
}