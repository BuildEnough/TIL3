package LagacyStudy3;

abstract class Unit {
    int x, y;

    abstract void move(int x, int y);

    void stop() { System.out.println("멈춤"); }
}

interface Fightable {
    void move(int x, int y); // public abstract 생략
    void attack(Fightable f); // public abstract 생략
}

class Fighter extends Unit implements Fightable {
    // public 붙이는 이유: 오버라이딩 규칙 중 조상보다 접근제어자가 좁으면 안됨
    public void move(int x, int y) {
        System.out.printf("x: %d, y: %d%n", x, y);
    }
    public void attack(Fightable f) {
        System.out.println(f + "공격");
    }

    Fightable getFightable() {
        Fightable f = new Fighter();
        return f;
    }
}

public class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();
        Fightable f2 = f.getFightable(); // LagacyStudy3.Fightable 반환타입

    }
}
