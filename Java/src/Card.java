class Card {
    String kind ;  // 카드의 무늬 - 인스턴스 변수
    int number;  // 카드의 숫자 - 인스턴스 변수
    static int width = 100;  // 카드의 폭  - 클래스 변수
    static int height = 250;  // 카드의 높이 - 클래스 변수
}

class CardTest{
    public static void main(String args[]) {
        System.out.println(Card.width); // 100
        System.out.println(Card.height); // 250
        System.out.println();

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println(c1.kind); // Heart
        System.out.println(c1.number); // 7
        System.out.println(c1.width); // 100
        System.out.println(c1.height); // 250
        System.out.println();

        System.out.println(c2.kind); // Spade
        System.out.println(c2.number); // 4
        System.out.println(c2.width); // 100
        System.out.println(c2.height); // 250
        System.out.println();


        // c1의 width = 50, height = 80 변경
        c1.width = 50;
        c1.height = 80;

        System.out.println(c1.kind); // Heart
        System.out.println(c1.number); // 7
        System.out.println(c1.width); // 50
        System.out.println(c1.height); // 80
        System.out.println();

        // c1과 c2는 클래스 변수를 공유하기 때문에 같이 바뀐다
        System.out.println(c2.kind); // Spade
        System.out.println(c2.number); // 4
        System.out.println(c2.width); // 50
        System.out.println(c2.height); // 80
    }
}