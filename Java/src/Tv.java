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
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println(t1.channel); // 0
        System.out.println(t2.channel); // 0

        t1.channel = 7;

        t2 = t1; // 참조변수 t1의 값을 t2에 저장

        System.out.println(t1.channel); // 7
        System.out.println(t2.channel); // 7
    }
}