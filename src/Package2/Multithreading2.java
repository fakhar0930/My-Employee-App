package Package2;
public class Multithreading2 {
    int count = 0;

    public  void increment() {
        count++;
    }



    public static void main(String[] args) throws InterruptedException {
        Multithreading2 counter = new Multithreading2();

        // Two threads incrementing 1000 times each
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) counter.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) counter.increment();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.count);
    }
}
