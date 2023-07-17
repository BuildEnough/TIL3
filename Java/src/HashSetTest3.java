import java.util.*;

public class HashSetTest3 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc"); // 중복이기 때문에 저장안됨
        set.add(new PersonHash("David",10));
        set.add(new PersonHash("David",10));

        System.out.println(set);
    }
}

// equals()와 hashCode()를 오버라이딩해야 HashSet이 바르게 동작
class PersonHash {
    String name;
    int age;

    @Override
    public int hashCode() {
        // int hash(Object... values); // 가변인자
        return Objects.hash(name,age);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof PersonHash)) return false;

        PersonHash p = (PersonHash) obj;
        // 나자신(this)의 이름과 나이를 p와 비교
        return this.name.equals(p.name) && this.age==p.age;
    }

    PersonHash(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name +":"+ age;
    }
}