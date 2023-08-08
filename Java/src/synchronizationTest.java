class synchronizationTest {
    public static void main(String args[]) {
        Runnable r = new RunnableEx1();
        new Thread(r).start(); // ThreadGroup에 의해 참조되므로 gc대상이 아니다.
        new Thread(r).start(); // ThreadGroup에 의해 참조되므로 gc대상이 아니다.
    }
}

class Account {
    private int balance = 1000; // private로 해야 동기화의 의미가 있음

    public synchronized int getBalance() {
        return balance;
    }

    public synchronized void withdraw(int money) { // synchronized로 메서드를 동기화
        if(balance >= money) {
            try { Thread.sleep(1000);} catch(InterruptedException e) {}
            balance -= money;
        }
    } // withdraw
}

class RunnableEx1 implements Runnable {
    Account acc = new Account();

    public void run() {
        while(acc.getBalance() > 0) {
            // 100, 200, 300중의 한 값을 임으로 선택해서 출금(withdraw)
            int money = (int)(Math.random() * 3 + 1) * 100;
            acc.withdraw(money);
            System.out.println("balance:"+acc.getBalance());
        }
    } // run()
}