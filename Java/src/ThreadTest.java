class ThreadTest {
    public static void main(String args[]) {
        ThreadTest_1 th1 = new ThreadTest_1();
        ThreadTest_2 th2 = new ThreadTest_2();

        // th1.setPriority(5); // 생략됨, 기본값: 5
        th2.setPriority(7);

        System.out.println("Priority of th1(-) : " + th1.getPriority());
        System.out.println("Priority of th2(|) : " + th2.getPriority());
        th1.start();
        th2.start();
    }
}

class ThreadTest_1 extends Thread {
    public void run() {
        for(int i=0; i < 300; i++) {
            System.out.print("-");
            for(int x=0; x < 10000000; x++); // 시간지연용 for문
        }
    }
}

class ThreadTest_2 extends Thread {
    public void run() {
        for(int i=0; i < 300; i++) {
            System.out.print("|");
            for(int x=0; x < 10000000; x++); // 시간지연용 for문
        }
    }
}