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
        Tv[] tvArr = new Tv[3];

        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new Tv();
            tvArr[i].channel = i;
        }

        for (int i = 0; i < tvArr.length; i++) {
            System.out.println(tvArr[i].channel);
        }
    }
}