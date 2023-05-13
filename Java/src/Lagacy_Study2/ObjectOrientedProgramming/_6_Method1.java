package ObjectOrientedProgramming;

public class _6_Method1 {
    public static void main(String[] args) {
        Add a = new Add();
        System.out.println(a.add(3, 5));
    }
}

class Add {
    int add(int x, int y) {
        int result = x + y;
        return result;
    }
}