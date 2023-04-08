package ObjectOrientedProgramming;

public class TV {
    String color;
    boolean power;
    int channel;

    void power() {power = !power;}

    void channelUp() {++channel;}

    void channelDown() {--channel;}
}

//class TVTest {
//    public static void main(String[] args) {
//        TV t;
//        t = new TV();
//        t.channel = 7;
//        t.channelDown();
//        System.out.println(t.channel);
//    }
//}

class TVTest2 {
    public static void main(String[] args) {
        TV t1 = new TV();
        TV t2 = new TV();
        System.out.println(t1.channel);
        System.out.println(t2.channel);

        t1.channel = 7;
        System.out.println("t1의 channel 값을 7로 변경");

        System.out.println(t1.channel);
        System.out.println(t2.channel);
    }
}