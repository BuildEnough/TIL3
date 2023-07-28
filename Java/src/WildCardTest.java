import java.util.ArrayList;

class Fruit		       	{ public String toString() { return "Fruit";}}
class Apple extends Fruit	{ public String toString() { return "Apple";}}
class Grape extends Fruit	{ public String toString() { return "Grape";}}

class Juice {
    String name;

    Juice(String name)       { this.name = name + "Juice"; }
    public String toString() { return name;                }
}

class Juicer {
    static Juice makeJuice(FruitBox<? extends Fruit> box) { // Fruit와 그 자손 가능
        String tmp = "";

        for(Fruit f : box.getList())
            tmp += f + " ";
        return new Juice(tmp);
    }
}

class WildCardTest {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<Apple>();

        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(appleBox)); // 와일드 카드를 사용했기 때문에 가능
    }
}

class FruitBox<T extends Fruit> extends Box<T> {}

class Box<T> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) { list.add(item);      }
    T get(int i)     { return list.get(i);  }
    ArrayList<T> getList() { return list;   }
    int size()       { return list.size();  }
    public String toString() { return list.toString();}
}
