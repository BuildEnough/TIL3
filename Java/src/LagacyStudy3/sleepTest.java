package LagacyStudy3;

import javax.swing.JOptionPane;

class sleepTest {
    public static void main(String[] args) throws Exception {
        Thread_1 th1 = new Thread_1();
        th1.start();

        System.out.println("isInterrupted():"+ th1.isInterrupted()); // false
        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신 값은 " + input + "입니다.");
        th1.interrupt();  // interrupt()를 호출하면, interrupted상태가 true가 된다.
        System.out.println("isInterrupted():"+ th1.isInterrupted()); // true

        // main 쓰레드가 interrupt 되었는지 확인
        System.out.println("interrupted():"+ Thread.interrupted()); // false, th1.interruped()로 하지 않게 주의, th1 사용해도 Thread(static 메서드이기 때문)
    }
}

class Thread_1 extends Thread {
    public void run() {
        int i = 10;

        while(i!=0 && !isInterrupted()) {
            System.out.println(i--);
            for(long x=0;x<2500000000L;x++); // 시간 지연
        }
        System.out.println("카운트가 종료되었습니다.");
    }
}