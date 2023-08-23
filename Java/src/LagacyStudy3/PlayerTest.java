package LagacyStudy3;

abstract class Player { // 추상 클래스
    abstract void play(int pos); // 추상 메서드
    abstract void stop(); // 추상 메서드
}

// 추상 클래스는 상속을 통해 완성해야 객체 생성 가능
class AudioPlayer extends Player {
    void play(int pos) { System.out.println(pos); }
    void stop() { System.out.println("재생 중지");}
}

public class PlayerTest {
    public static void main(String[] args) {
        Player ap = new AudioPlayer(); // 다형성
        ap.play(100);
        ap.stop();
    }
}
