package LagacyStudy3.pkg1;

public class MyParent {
    private int prv; // 같은 클래스
    int dft; // 같은 패키지
    protected int prt; // 같은 패키지 + 자손(다른 패키지)
    public int pub; // 접근제한 없음

    public void printMembers() {
        System.out.println(prv); // OK
        System.out.println(dft); // OK
        System.out.println(prt); // OK
        System.out.println(pub); // OK
    }
}

class MyParentTest {
    public static void main(String[] args) {
        MyParent p = new MyParent();
        // System.out.println(p.prv); // 에러, 다른 클래스이기 때문에 에러발생
        System.out.println(p.dft); // OK
        System.out.println(p.prt); // OK
        System.out.println(p.pub); // OK러
    }
}
