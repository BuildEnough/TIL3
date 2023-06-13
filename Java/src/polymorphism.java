class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }

    Product() {} // 기본 생성자
}

class Tv1 extends Product {
    Tv1() { super(100); }

    public String toString() { return "Tv"; }
}

class Computer extends Product {
    Computer() {
        super(200);
    }
    public String toString() { return "Computer"; }
}

class Audio extends Product {
    Audio() {
        super(50);
    }
    public String toString() { return "Audio"; }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    Product[] cart = new Product[10];
    int i = 0;

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액 부족");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        cart[i++] = p;
        System.out.println(p + "를 구입했습니다");
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        for (int i = 0; i < cart.length; i++) {
            if (cart[i] == null) break;
            sum += cart[i].price;
            itemList += cart[i] + ", ";
            // itemList += cart[i].toString() + ", ";
        }
        System.out.println("sum: " + sum);
        System.out.println("itemList: " + itemList);
    }
}



public class polymorphism {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv1());
        b.buy(new Computer());
        b.buy(new Audio());
        b.summary();
    }
}
