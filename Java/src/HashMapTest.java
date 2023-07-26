import java.awt.dnd.DragGestureEvent;
import java.util.*;

class HashMapTest {
    public static void main(String[] args) {
        // HashMap<String, Student> map = new HashMap<String, Student>();
        HashMap<String, Student> map = new HashMap(); // <String, Student> 생략 가능
        map.put("Apple", new Student("Apple", 1, 1, 100, 100, 100));

        Student s = map.get("Apple");

        System.out.println(map);
        System.out.println(map.get("Apple").name);
    }
}

class Student {
    String name = "";
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}