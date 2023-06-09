package pkg2;

// import pkg1.MyParent;

import pkg1.MyParent;

class MyChild extends pkg1.MyParent {
    public void printMembers() {
        System.out.println(prv); // 에러
        System.out.println(dft); // 에러
        System.out.println(prt); // OK
        System.out.println(pub); // OK
    }
}

public class MyParentTest2 {
    public static void main(String[] args) {
        MyParent p = new MyParent();
        System.out.println(p.prv); // 에러
        System.out.println(p.dft); // 에러
        System.out.println(p.prt); // 에러
        System.out.println(p.pub); // OK
    }
}
