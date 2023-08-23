package LagacyStudy3;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Set set = new TreeSet(); // 새로만든 비교 기준 LagacyStudy3.TestComp()를 넣어줘야 한다

        // for문이 계속 돌기 때문에 주석 처리
//        for (int i = 0; set.size() < 6 ; i++) {
//            int num = (int)(Math.random()*45) + 1;
            set.add(new Test());  // set.add(new Integer(num));
            set.add(new Test());  // set.add(new Integer(num));
            set.add(new Test());  // set.add(new Integer(num));
            set.add(new Test());  // set.add(new Integer(num));
            set.add(new Test());  // set.add(new Integer(num));
//        }

        System.out.println(set);
    }
}

class Test implements Comparable{
    @Override
    public int compareTo(Object o) {
        return -1;
    }
}

class TestComp implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return -1; // return 0 이면 같은 객체로 판단하기 때문에 값이 하나로 나옴, 1또는 -1로 해야됨
    }
}