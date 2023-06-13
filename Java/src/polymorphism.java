class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv1 extends Product {
    Tv1() {
        super(100); // 조상클래스의 생성자 Product(int price) 호출
    }

    public String toString() { return "Tv"; }
}

class Computer extends Product {
    Computer() {
        super(200);
    }
    public String toString() { return "Computer"; }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액 부족");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + "를 구입했습니다");

    }
}

public class polymorphism {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv1());
        b.buy(new Computer());

        System.out.println(b.money);
        System.out.println(b.bonusPoint);
    }
}
