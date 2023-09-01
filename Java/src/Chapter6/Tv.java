package Chapter6;

class Tv {
    String color;
    boolean power;
    int channel;

    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}

class TvTest {
    public static void main(String[] args) {
        Tv t = new Tv();
        t.channel = 5;
        System.out.println(t.channel);

        t.channelDown();
        System.out.println(t.channel);

        t.channelUp();
        System.out.println(t.channel);
    }
}

class TvTest2 {
    public static void main(String[] args) {
        Tv t2 = new Tv();
        t2.channel= 10;
        System.out.println(t2.channel);

        t2.channelDown();
        t2.channelDown();
        System.out.println(t2.channel);
    }
}


class TvTest3 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println(t1.channel);
        System.out.println(t2.channel);

        t2 = t1;
        t1.channel = 7;
        System.out.println(t1.channel);
        System.out.println(t2.channel);
    }
}

class TvTest4 {
    public static void main(String[] args) {
        Tv[] tvArr = new Tv[3];

        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new Tv();
            tvArr[i].channel = i+10;
        }

        for (int i = 0; i < tvArr.length; i++) {
            System.out.println(tvArr[i].channel);
        }
    }
}