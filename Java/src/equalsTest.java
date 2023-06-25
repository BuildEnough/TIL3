class equalsTest {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if (v1.equals(v2))
            System.out.println("v1과 v2는 같다");
        else
            System.out.println("v1과 v2는 다르다");
    }
}

class Value {
    int value;

    Value(int value) {
        this.value = value;
    }

    public boolean equals(Object obj) {
        // return this==obj; // 주소비교, 서로 다른 객체는 항상 거짓
        // 참조변수의 형변환 전에는 반드시 instanceof로 확인하기
        if(!(obj instanceof Value)) return false;
        Value v = (Value)obj; //obj에는 value가 없기 떄문에 형변환 필수

        return this.value==v.value;
    }
}