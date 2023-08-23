package LagacyStudy3;

import java.util.*;

class HashMapTest {
    public static void main(String[] args) {
        // HashMap<String, LagacyStudy3.Student> map = new HashMap<String, LagacyStudy3.Student>();
        HashMap<String, Student> map = new HashMap(); // <String, LagacyStudy3.Student> 생략 가능
        map.put("LagacyStudy3.Apple", new Student("LagacyStudy3.Apple", 1, 1, 100, 100, 100));

        Student s = map.get("LagacyStudy3.Apple");

        System.out.println(map);
        System.out.println(map.get("LagacyStudy3.Apple").name);
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