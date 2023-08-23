package LagacyStudy3;

import java.util.ArrayList;

class Tvv {}
class Audioo {}

public class typeVariableTest {
    public static void main(String[] args) {
        ArrayList<Tvv> list = new ArrayList<Tvv>();
        list.add(new Tvv());

        Tvv t = list.get(0); // list의 첫번째 요소를 꺼냄
    }
}
