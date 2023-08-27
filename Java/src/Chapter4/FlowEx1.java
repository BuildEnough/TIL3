package Chapter4;

public class FlowEx1 {
    public static void main(String[] args) {
        int x = 0;

        System.out.println("x==0 일 때 true인 것은");
        if(x==0) System.out.println("x==0");
        if(x!=0) System.out.println("x!=0");
        if(!(x==0)) System.out.println("!(x==0)");
        if(!(x!=0)) System.out.println("!(x!=0)");
    }
}
