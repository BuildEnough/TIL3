import java.util.*;

public class HashMapTest2 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("김자바", 90);
        map.put("김자바", 100);
        map.put("이자바", 100);
        map.put("강자바", 80);
        map.put("안자바", 90);
        // 4개만 저장됨(김자바 1개만 저장됨)

        Set set = map.entrySet();
        Iterator it = set.iterator();

        while(it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next(); // Map 인터페이스, Entry 인터페이스(Map의 내부 인터페이스)
            System.out.println("이름 : "+ e.getKey() + ", 점수 : " + e.getValue());
        }

        set = map.keySet();
        System.out.println("참가자 명단 : " + set);

        Collection values = map.values();
        it = values.iterator();

        int total = 0;

        while(it.hasNext()) {
            int i = (int)it.next();
            total += i;
        }

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + (float)total/set.size());
        System.out.println("최고점수 : " + Collections.max(values));
        System.out.println("최저점수 : " + Collections.min(values));
    }
}