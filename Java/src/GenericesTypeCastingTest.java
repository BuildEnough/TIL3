import java.util.ArrayList;

class Fruit implements Eatable {
    public String toString() { return "Fruit";}
}
class Apple extends Fruit { public String toString() { return "Apple";}}
class Grape extends Fruit { public String toString() { return "Grape";}}
class Toy                 { public String toString() { return "Toy"  ;}}

interface Eatable {}

class GenericesTypeCastingTest {
    public static void main(String[] args) {
        FruitBox<? extends Fruit> fBox = (FruitBox<? extends Fruit>)new FruitBox<Fruit>();

        // FruitBox<Apple> -> FruitBox<? extends Fruit> 가능
        FruitBox<? extends Fruit> aBox = new FruitBox<Apple>();

        // FruitBox<? extends Fruit> -> FruitBox<Apple> 가능
        FruitBox<Apple> appleBox = (FruitBox<Apple>)aBox; // OK, 경고발생
    }
}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {}

class Box<T> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) { list.add(item);     }
    T get(int i)     { return list.get(i); }
    int size()       { return list.size(); }
    public String toString() { return list.toString();}
}