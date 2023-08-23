package LagacyStudy3;

import java.util.ArrayList;

class Fruit implements Eatable {
    public String toString() { return "LagacyStudy3.Fruit";}
}
class Apple extends Fruit { public String toString() { return "LagacyStudy3.Apple";}}
class Grape extends Fruit { public String toString() { return "LagacyStudy3.Grape";}}
class Toy                 { public String toString() { return "LagacyStudy3.Toy"  ;}}

interface Eatable {}

class GenericesTypeCastingTest {
    public static void main(String[] args) {
        FruitBox<? extends Fruit> fBox = (FruitBox<? extends Fruit>)new FruitBox<Fruit>();

        // LagacyStudy3.FruitBox<LagacyStudy3.Apple> -> LagacyStudy3.FruitBox<? extends LagacyStudy3.Fruit> 가능
        FruitBox<? extends Fruit> aBox = new FruitBox<Apple>();

        // LagacyStudy3.FruitBox<? extends LagacyStudy3.Fruit> -> LagacyStudy3.FruitBox<LagacyStudy3.Apple> 가능
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