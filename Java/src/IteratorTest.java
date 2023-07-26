import java.util.*;

class IteratorTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("LG", 1, 1));
        list.add(new Student("samsung", 1, 2));
        list.add(new Student("apple", 2, 1));

        Iterator<Student> it = list.iterator(); // 없을 경우 밑의 주석처럼 형변환 필요
        while (it.hasNext()) {
            //  Student s = (Student)it.next(); // 지네릭스를 사용하지 않으면 형변환 필요.
            Student s = it.next(); // next()가 반환하는 것이 Object가 아닌 Student이기 때문에 형변환 불필요
            System.out.println(s.name);
             // System.out.println(it.next().name); 위의 두 줄 한 줄로 줄이기
             // System.out.println(((Student)it.next()).name); 형변환 할 경우 줄이기
        }
    }
}

class Student {
    String name = "";
    int ban;
    int no;

    Student(String name, int ban, int no) {
        this.name = name;
        this.ban = ban;
        this.no = no;
    }
}