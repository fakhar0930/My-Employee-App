package Package2;

public class DeadlockExample {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public void methodA() {
        synchronized (lock1) {
            System.out.println(Thread.currentThread().getName() + " acquired lock1");
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            synchronized (lock2) {
                System.out.println(Thread.currentThread().getName() + " acquired lock2");
            }
        }
    }

    public void methodB() {
        synchronized (lock1) {
            System.out.println(Thread.currentThread().getName() + " acquired lock1");
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            synchronized (lock2) {
                System.out.println(Thread.currentThread().getName() + " acquired lock2");
            }
        }
    }
}

class DeadlockTest {
    public static void main(String[] args) {
        DeadlockExample example = new DeadlockExample();

        Thread t1 = new Thread(() -> example.methodA(), "Thread-1");
        Thread t2 = new Thread(() -> example.methodB(), "Thread-2");

        t1.start();
        t2.start();
    }
}


