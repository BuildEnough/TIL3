class Tv {
    // Tv의 속성(멤버 변수)
    String color;
    boolean power;
    int channel;

    // Tv의 기능(메서드)
    void power() {power = !power;}

    void channelUp() {channel++;}

    void channelDown() {channel--;}
}

class Tvtest {
    public static void main(String[] args) {
        Tv t;
        t = new Tv();
        t.channel = 7;
        t.channelDown();
        System.out.println(t.channel); // 6
    }
}