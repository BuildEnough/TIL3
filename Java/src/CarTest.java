class Car {
    String color;
    String gearType;
    int door;

    Car() {} // 생성자
    Car(String c, String g, int d) { // 매개변수가 있는 생성자
        color = c;
        gearType = g;
        door = d;
    }
}

class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "white"; // 인스턴스 변수 따로 초기화
        c1.gearType = "auto"; // 인스턴스 변수 따로 초기화
        c1.door = 4; // 인스턴스 변수 따로 초기화

        Car c2 = new Car("white", "auto", 5); // 인스턴스를 생성하는 동시에 원하는 값으로 초기화
        System.out.println(c1.color +" "+  c1.gearType +" "+ c1.door);
        System.out.println(c2.color +" "+  c2.gearType +" "+ c2.door);
    }
}
