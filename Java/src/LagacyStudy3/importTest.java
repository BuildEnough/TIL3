package LagacyStudy3;

import static java.lang.System.out; // System.out를 out만으로 참조가능
import static java.lang.Math.*; // Math 클래스의 모든 static 멤버
// import static java.lang.Math.random; // Math.random()만, 괄호 붙이지 않는다


public class importTest {
    public static void main(String[] args) {
        // System.out.println(Math.random());
        out.println(random()); // 0.12440018531065256

        // System.out.println(Math.PI);
        out.println(PI); // 3.141592653589793
    }
}