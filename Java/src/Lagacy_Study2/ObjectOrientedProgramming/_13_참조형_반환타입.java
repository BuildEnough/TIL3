package Lagacy_Study2.ObjectOrientedProgramming;

class Data5 { int x;}

public class _13_참조형_반환타입 {
    public static void main(String[] args) {
        Data5 d = new Data5();
        d.x = 10;

        Data5 d2 = copy(d);
        System.out.println(d.x);
        System.out.println(d2.x);
    }

    static Data5 copy(Data5 d) {
        Data5 tmp = new Data5();
        tmp.x = d.x;
        return tmp;
    }
}
