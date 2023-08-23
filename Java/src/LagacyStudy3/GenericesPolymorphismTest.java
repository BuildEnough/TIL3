package LagacyStudy3;

import java.util.*;

class Product {}
class Tv extends Product {}
class Audio extends Product {}

class GenericesPolymorphismTest {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<Product>();
        ArrayList<Tv>      tvList = new ArrayList<Tv>();
//  	ArrayList<LagacyStudy3.Product> tvList = new ArrayList<LagacyStudy3.Tv>(); // 에러.
// 		List<LagacyStudy3.Tv>           tvList = new ArrayList<LagacyStudy3.Tv>(); // OK. 다형성

        productList.add(new Tv()); // public boolean add(LagacyStudy3.Product e)
        productList.add(new Audio());

        tvList.add(new Tv()); // public boolean add(LagacyStudy3.Tv e)
        tvList.add(new Tv());
        // tvList.add(new LagacyStudy3.Audio()); // 에러 Tv나 Tv의 자손만 가능

        printAll(productList);
        // printAll(tvList); // 컴파일 에러가 발생한다.
    }

    public static void printAll(ArrayList<Product> list) {
        for (Product p : list)
            System.out.println(p);
    }
}